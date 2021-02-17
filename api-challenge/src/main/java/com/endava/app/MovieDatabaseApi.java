package com.endava.app;

import com.endava.app.helpers.MovieDatabaseEndpoints;
import com.endava.app.http.HttpMessageSender;
import io.restassured.response.Response;

import java.util.HashMap;

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

	public String getSessionId(String token) {
		HashMap<String,String> body = new HashMap<>();
		body.put("request_token", token);
		Response response = sender.sendPostRequest(MovieDatabaseEndpoints.createSessionId, body);
		return response.then().log().all().extract().path("session_id");
	}
}
