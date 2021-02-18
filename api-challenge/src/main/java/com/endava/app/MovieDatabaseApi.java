package com.endava.app;

import com.endava.app.entities.ListDetails;
import com.endava.app.entities.MovieDatabaseList;
import com.endava.app.entities.MovieDetails;
import com.endava.app.helpers.MovieDatabaseEndpoints;
import com.endava.app.http.HttpMessageSender;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.restassured.response.Response;

import java.util.HashMap;

public class MovieDatabaseApi {

	private final String url;
	private final HttpMessageSender sender;
	private JsonParser parser = new JsonParser();

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

	public Response createList(MovieDatabaseList list) {
		Response response = sender.sendPostRequest(MovieDatabaseEndpoints.list,list);
		int id = response.then().extract().path("list_id");
		list.setList_id(id);
		return response;
	}

	public ListDetails getList(int index) {
		Response response = sender.sendGetRequest(MovieDatabaseEndpoints.getList(index));
		JsonElement jsonResponse = parser.parse(response.body().asString());
		ListDetails listDetails = new Gson().fromJson(jsonResponse,ListDetails.class);
		return listDetails;
	}

	public Response addMovieToList(int movieId, int listId) {
		HashMap<String,Integer> body =  new HashMap();
		body.put("media_id", movieId);
		return sender.sendPostRequest(MovieDatabaseEndpoints.addMovieToList(listId),body);
	}

	public MovieDetails getMovieDetails(int idMovie) {
		Response response = sender.sendGetRequest(MovieDatabaseEndpoints.getMovie(idMovie));
		JsonElement jsonResponse = parser.parse(response.body().asString());
		MovieDetails movieDetails = new Gson().fromJson(jsonResponse,MovieDetails.class);
		return movieDetails;
	}

	public Response rateMovie(int idMovie, double value) {
		HashMap<String,Double> body = new HashMap<>();
		body.put("value",value);
		return sender.sendPostRequest(MovieDatabaseEndpoints.rateMovie(idMovie),body);

	}
}
