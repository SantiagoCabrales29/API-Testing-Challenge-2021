package com.endava.app;

import com.endava.app.http.HttpMessageSender;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AuthTest {
	private static Properties props;
	private static MovieDatabaseApi api;

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
	public void getToken(){
		String token = api.getToken();
		Assert.assertNotNull(token);
		props.setProperty("token",token);
		System.out.println(props.getProperty("token"));
	}
}// Token para mañana -> 7dcf8d06748b6d9645746454a46712d2a1da9fd3
