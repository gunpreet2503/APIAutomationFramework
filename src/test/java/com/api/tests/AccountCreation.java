package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.Base.AuthService;
import com.api.model.requests.SignUpRequest;

import io.restassured.response.Response;



public class AccountCreation {
	@Test(description="Verify the login")
	public void createaccount() {
		SignUpRequest signupRequest = new SignUpRequest.Builder().email("abc@gamsiw.co").firstName("abc").lastName("singh")
				.mobileNumber("7262425221").userName("abc2132").password("12212asaa").build();
		
		AuthService auth=new AuthService();
		Response response=auth.signUp(signupRequest);
		System.out.println(response.asPrettyString());
		//Assert.assertEquals(response.getStatusCode(), 200);
		
		
	
	
}
public class forgotPassword{
	@Test(description="Verify the forgot password")
	public void forgotpassword() {
			
		AuthService auth=new AuthService();
		Response response=auth.forgotPassword("abc@gamsiws.co");
		System.out.println(response.asPrettyString());
		
	}
	
}	

}
