package com.api.Base;
import static io.restassured.http.ContentType.*;

import com.api.filters.Filters;
import com.api.model.requests.Loginrequest;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class BaseService {
	
	private final static  String BASE_URI="http://64.227.160.186:8080/";
	public RequestSpecification requestspecification;
	
	static {
		
		RestAssured.filters(new Filters());
	}
	public BaseService() {
		
		requestspecification=given().baseUri(BASE_URI);
		
		
	}
	
	public   Response PostRequest(Object payload,String endpoint) {
		
		 return requestspecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	public   Response GetRequest(String endpoint) {
		
		
		return requestspecification.get(endpoint);
	}
	
	public   Response Put (Object Payload,String endpoint) {
		return requestspecification.log().all().contentType(ContentType.JSON).body(Payload).put(endpoint);
		
	}

	protected void setToken(String token) {
        requestspecification.header("Authorization", "Bearer " +token);
		
		
	}

}
