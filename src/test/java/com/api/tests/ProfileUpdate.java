package com.api.tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.Base.AuthService;
import com.api.Base.UserProfileManagement;
import com.api.model.requests.Loginrequest;
import com.api.model.requests.ProfileRequest;
import com.api.response.LoginResponse;

import io.restassured.response.Response;
@Listeners(com.api.listners.TestListners.class)
public class ProfileUpdate {
	@Test (description="Verify the updation of profile")
	public void UpdateProfile() {
		AuthService auth = new AuthService();
		Response response=auth.Login(new Loginrequest("uday1234","uday12345"));
		LoginResponse loginresponse= response.as(LoginResponse.class);	
		UserProfileManagement profile =new UserProfileManagement();
		ProfileRequest profilerequest= new ProfileRequest.Builder().firstName("Raman").email("raman@gmail.com").
				mobileNumber("7162222212").lastName("Singh").build();
		response=profile.updateProfile(loginresponse.getToken(), profilerequest);
		
		System.out.println(response.asPrettyString());
		
		
		
	}

}
