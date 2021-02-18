package com.endava.app;

import com.endava.app.entities.MovieDetails;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MovieTest {
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
	public void getMovieDetails(){
		int idMovie = 12445;
		MovieDetails movieDetails = api.getMovieDetails(idMovie);
		Assert.assertNotNull(movieDetails);
		System.out.println(movieDetails.getTitle());
	}
}
