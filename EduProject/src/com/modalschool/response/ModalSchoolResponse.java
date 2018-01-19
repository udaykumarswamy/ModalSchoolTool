package com.modalschool.response;

/**
 * @author uday kumar swamy
 *
 *this class obhject is used to send the response to the services
 */
public class ModalSchoolResponse {

	private String message;
	private String status;
	private Object responseObject;
	
	public ModalSchoolResponse(){
		
	}
	public ModalSchoolResponse(String message,String status,Object responseObject)
	{
		this.message=message;
		this.status=status;
		this.responseObject=responseObject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getResponseObject() {
		return responseObject;
	}

	public void setResponseObject(Object responseObject) {
		this.responseObject = responseObject;
	}
}
