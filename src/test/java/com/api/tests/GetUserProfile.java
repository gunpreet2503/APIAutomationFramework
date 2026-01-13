package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.Base.AuthService;
import com.api.Base.UserProfileManagement;
import com.api.model.requests.Loginrequest;
import com.api.response.GetUserProfileResponse;
import com.api.response.LoginResponse;

import io.restassured.response.Response;

public class GetUserProfile {
	
	@Test(description="Verify the user details")
		
		public void getprofilinfo() {
		
		AuthService auth = new AuthService();
		Response response=auth.Login(new Loginrequest("uday1234","uday12345"));
		LoginResponse loginresponse= response.as(LoginResponse.class);
		System.out.println(loginresponse.getToken());	
		UserProfileManagement profile =new UserProfileManagement();
		response=profile.getProfile(loginresponse.getToken());
		//System.out.println(response.asPrettyString());
		GetUserProfileResponse getuserprofile=response.as(GetUserProfileResponse.class);
		System.out.println(getuserprofile.getEmail());
		Assert.assertEquals(loginresponse.getId(), 1);
		 
		
			
		}
	}


