package com.endava.app;

import com.endava.app.helpers.MovieDatabaseEndpoints;
import com.endava.app.http.HttpMessageSender;
import io.restassured.response.Response;

public class MovieDatabaseApi {

	private final String url;
	private final HttpMessageSender sender;

	public MovieDatabaseApi(String url) {
		this.url = url;
		this.sender = new HttpMessageSender(url);
	}

	public String getToken(){
		Response response = sender.sendGetRequest(MovieDatabaseEndpoints.createToken);
		return response.then().extract().path("request_token");
	}
}
