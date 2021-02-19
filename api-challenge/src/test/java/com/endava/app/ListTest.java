package com.endava.app;

import com.endava.app.entities.ListDetails;
import com.endava.app.entities.ListItem;
import com.endava.app.entities.MovieDatabaseList;
import com.endava.app.entities.MovieDetails;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
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

	@Test
	public void addMovieToList(){
		int listId = 7077662;
		int movieId = 396535;
		Response response = api.addMovieToList(movieId, listId);
		Assert.assertEquals(201,response.getStatusCode());
		ListDetails listDetails = api.getList(listId);
		//System.out.println(listDetails.getItems().get(0).getTitle());
		final MovieDetails movieDetails = api.getMovieDetails(577922);
		List<ListItem> itemsList = listDetails.getItems();
		//itemsList.forEach(item -> Assert.assertTrue(item.getTitle()==movieDetails.getTitle()));

		boolean isMovieInList = false;
		for (ListItem item : itemsList){
			if (item.getTitle().equals(movieDetails.getTitle()))
				isMovieInList = true;
		}
		Assert.assertTrue(isMovieInList);
	}

	@Test
	public void clearList(){
		int listId = 7077662;
		Response response = api.clearList(listId);
		Assert.assertEquals(201,response.getStatusCode());
		ListDetails listDetails = api.getList(listId);
		Assert.assertEquals(listDetails.getItems().size(),0);
	}


}

