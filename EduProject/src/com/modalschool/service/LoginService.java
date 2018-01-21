package com.modalschool.service;

import java.util.List;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.modalschool.daoimpl.LoginQueryManager;
import com.modalschool.response.ModalSchoolResponse;
import com.modalschool.to.LoginUserTo;
import com.modalschool.bean.*;

/**
 * @author udaykumar swamy
 *
 */

@Controller
@RequestMapping(value = "/login", produces = "application/json")
public class LoginService {

	@Autowired
	private LoginQueryManager loginQueryManager;

	/**
	 * @param loginUserInfo
	 * @return ModalSchoolResponse
	 * @throws JSONException
	 */
	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public @ResponseBody LoginUserTo LoginUser(@RequestBody String loginUserInfo)
			throws JSONException {

		ModalSchoolResponse modalSchoolResponse = new ModalSchoolResponse();
		LoginUserTo loginUserTo = new LoginUserTo();
		JSONObject loginInfo = new JSONObject(loginUserInfo);
		String userName = loginInfo.getString("userName");
		String password = loginInfo.getString("password");
		try {
			List<LoginUser> userResult = loginQueryManager.checkUser(userName,
					password);
			if (userResult.size() > 0) {
				modalSchoolResponse.setMessage("user Authentication success");
				modalSchoolResponse.setStatus("success");
				for (LoginUser userInfo : userResult) {
					loginUserTo.setUserName(userInfo.getUserName());
					loginUserTo.setAccessType(userInfo.getAccessType());
					loginUserTo.setLastLogin(userInfo.getLastLogin());
					loginUserTo.setUserId(userInfo.getUserId());
					loginUserTo.setIsAuthenticatedUser("true");
				}
				modalSchoolResponse.setResponseObject(loginUserTo);
			} else {
				modalSchoolResponse.setMessage("user Authentication failed!!");
				modalSchoolResponse.setStatus("failed");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginUserTo;

	}
}
