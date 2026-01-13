package com.api.Base;

import java.util.HashMap;

import com.api.model.requests.Loginrequest;
import com.api.model.requests.SignUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService {
	public static final String BASE_URI="/api/auth/";
	
	public Response Login(Loginrequest Payload) {
		 return PostRequest(Payload, BASE_URI+"login");
	}
	
	public Response signUp(SignUpRequest Payload) {
		 return PostRequest(Payload, BASE_URI+"signup");
	}
	
	public Response forgotPassword(String emailaddress) {
		HashMap<String, String> Payload= new HashMap<String, String>();
		Payload.put("email", emailaddress);
		
		return PostRequest(Payload, BASE_URI+"forgot-password");
		
		
	} 
	protected void setToken(String token) {
        requestspecification.header("Authorization", "Bearer " + token);
		
		
	}

}
