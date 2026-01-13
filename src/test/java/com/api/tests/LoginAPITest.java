package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.Base.AuthService;
import com.api.model.requests.Loginrequest;
import com.api.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest {
	
	@Test(description="Verify the login")
	public void login() {
		
		Loginrequest login = new Loginrequest("uday1234", "uday12345");
		AuthService authservice= new AuthService();
		Response response=authservice.Login(login);
		System.out.println(response.asPrettyString());
		LoginResponse loginresponse=response.as(LoginResponse.class);
		System.out.println(loginresponse.getId());
		Assert.assertEquals(loginresponse.getId(), 1);
		//Assert.assertEquals(loginresponse.getEmail(), "disha123er@gmail.com");
		
	}

}
