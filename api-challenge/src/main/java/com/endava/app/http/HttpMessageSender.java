package com.endava.app.http;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class HttpMessageSender {
	private final String url;
	private static RequestSpecification requestSpecification;
	private static Properties props;

	public HttpMessageSender(String url) {
		props = new Properties();
		try {
			props.load(new FileInputStream("application.properties"));
		} catch (IOException var2) {
			System.out.println("Hay un error leyendo el archivo de properties");
		}
		this.url = props.getProperty("url");
		createRequestSpecification();
	}

	public static void createRequestSpecification(){
		requestSpecification = new RequestSpecBuilder().
				setContentType(ContentType.JSON).
				addQueryParam("api_key",props.getProperty("key")).
				build();
	}

	public Response sendGetRequest(String endpoint){
		return given().spec(requestSpecification).log().all().when().get(this.url+endpoint).andReturn();
	}
}
