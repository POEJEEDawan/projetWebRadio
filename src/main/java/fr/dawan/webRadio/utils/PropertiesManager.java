package fr.dawan.webRadio.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesManager {
	
	public String getPersistenceUnitName() throws IOException {
		Properties prop = new Properties();
		prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
		
		return prop.getProperty("unit_name");
	}

	public String getBucketUrl() throws IOException {
		Properties prop = new Properties();
		prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
		
		return prop.getProperty("bucket_url");
		
	}
}
