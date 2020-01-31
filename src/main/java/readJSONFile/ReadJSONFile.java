package readJSONFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONFile {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {



		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(new FileReader("/Users/umang/Desktop/simplejson.json"));
		
		JSONObject jsonObj = (JSONObject) obj; 
		
		String name = (String) jsonObj.get("name");
		System.out.println("name is : " + name);
		
//		long age = (long) jsonObj.get("age");
//		System.out.println("age is :" + age);
		
//		String jsonAge = (String) jsonObj.get("age");
//		int age = Integer.parseInt(jsonAge);
		
		String city = (String) jsonObj.get("city");
		System.out.println("city is : " + city);
		
		long age = (Long)jsonObj.get("age");
		System.out.println("age of john who is sitting in new york is : " + age);
	}

}
