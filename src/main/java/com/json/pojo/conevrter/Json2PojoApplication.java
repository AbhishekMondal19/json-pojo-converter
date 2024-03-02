package com.json.pojo.conevrter;

import com.json.pojo.conevrter.util.JSONToPOJOUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@SpringBootApplication
public class Json2PojoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(Json2PojoApplication.class, args);
		// Invoke convertJsonToJavaClass method
		// Build URL for JSON file
		URL inputJsonUrl = Json2PojoApplication.class.getClassLoader().getResource("inputJSON/movieDetails.json");
		File outputJavaClassDirectory = new File("src\\main\\java\\com\\json\\pojo\\conevrter\\model");
		String packageName = "model";
		String javaClassName = "MovieDetails";
		JSONToPOJOUtil.convertJsonToJavaClass(inputJsonUrl, outputJavaClassDirectory, packageName, javaClassName);
	}

}
