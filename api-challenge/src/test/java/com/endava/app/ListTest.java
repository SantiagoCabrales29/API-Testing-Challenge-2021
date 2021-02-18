package com.endava.app;

import com.endava.app.entities.ListDetails;
import com.endava.app.entities.MovieDatabaseList;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ListTest {
	private static MovieDatabaseApi api;
	private static Properties props;

	@BeforeClass
	public static void createTestEnvironment() {
		props = new Properties();
		try {
			props.load(new FileInputStream("application.properties"));
		} catch (IOException var2) {
			System.out.println("Hay un error leyendo el archivo de properties");
		}
		System.out.println(props.getProperty("url"));
		api = new MovieDatabaseApi(props.getProperty("url"));
	}

	@Test
	public void createList() {
		MovieDatabaseList list = new MovieDatabaseList("Christopher Nolan Films", "A list that groups all Christopher Nolan films ever made", "en");
		Response response = api.createList(list);
		Assert.assertEquals(201,response.getStatusCode());
	}

	@Test
	public void getList(){
		int listId = 7077662;
		int random = (int) (Math.random() * (10000));
		ListDetails listDetails = api.getList(listId);
		Assert.assertNotNull(listDetails);
		System.out.println(listDetails.getName());
	}


}

