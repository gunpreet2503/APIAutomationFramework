package com.api.tests;

import org.testng.annotations.Test;

import com.api.Base.AuthService;

import io.restassured.response.Response;

public class ForgotPassword {
	@Test(description="Verify the forgot password")
	public void forgotpassword() {
			
		AuthService auth=new AuthService();
		Response response=auth.forgotPassword("abc@gamsiwd.co");
		System.out.println(response.asPrettyString());
		
	}

}
