package com.api.filters;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class Filters implements Filter{
	
	private static final Logger logger= LogManager.getLogger(Filter.class);

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {
		logrequest(requestSpec);
		Response response=ctx.next(requestSpec, responseSpec);
		logresponse(response);
		return response;
	}
	
	public void logrequest(FilterableRequestSpecification requestSpec) {
		logger.info("BASE URI: "+requestSpec.getBaseUri());
		logger.info("Headers: "+requestSpec.getHeaders());
		logger.info("Body: "+requestSpec.getBody());
		
	}
	
	public void logresponse(Response response) {
		logger.info("Status code"+ response.statusCode());
		logger.info("Body"+ response.body().asPrettyString());
		logger.info("Header"+ response.getHeaders());
		
		
	}

}
