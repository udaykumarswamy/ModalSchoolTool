package com.modalschool.constants;

/**
 * @author udaykumar swamy
 *Following class will have all the constant values of the application this values cant be modified ever
 */
public class ApplicationConstants {

	public static final String checkUser="from LoginUser m where m.userName=:userName and m.password=:password";
	public static final String updateLastLogin="update LoginUser m set m.lastLogin=:lastLogin where m.userId=:userId";

}
