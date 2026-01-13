package com.api.Base;

import io.restassured.response.Response;

public class UserProfileManagement extends BaseService {
	
	public static  final String BASE_Path="/api/users";
	
	public Response getProfile(String token) {
		setToken(token); 
		 return GetRequest(BASE_Path+"/profile" );
		 
	}
	
	public Response updateProfile(String token,Object Payload) {
		setToken(token); 
		 return Put(Payload,BASE_Path+"/profile" );
		
	}

}
