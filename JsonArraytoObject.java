import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonArraytoObject {
	public static void main(String args[]) {

		StringBuilder content = new StringBuilder("[\r\n" + 
				"  \r\n" + 
				"  {\r\n" + 
				"    \"mean_cti\": 0.09775471870078165,\r\n" + 
				"    \"stddev_cti\": 0.010620863054360058,\r\n" + 
				"	\"data_source\": \"GP Historical\"\r\n" + 
				"  },\r\n" + 
				"  \r\n" + 
				"  {\r\n" + 
				"    \"elevation_m\": 998.7,\r\n" + 
				"    \"roughness_m\": 0.03,\r\n" + 
				"    \"wind_speed\": 8.92,\r\n" + 
				"    \"weibull_a\": 10.060003791384636,\r\n" + 
				"	\"data_source\": \"200 m\"\r\n" + 
				"    \r\n" + 
				"  },\r\n" + 
				" \r\n" + 
				"  {\r\n" + 
				"    \"elevation_m\": 980.3163893523727,\r\n" + 
				"    \"roughness_m\": 0.11,\r\n" + 
				"    \"air_density\": 1.0731408364474098,\r\n" + 
				"    \"wind_speed\": 7.58006003713075,\r\n" + 
				"	\"data_source\": \"27 km\"\r\n" + 
				"   \r\n" + 
				"  }\r\n" + 
				"]");
		System.out.println(content);
		String result = content.toString();
		System.out.print(content.toString());
		System.out.println(content.getClass().getName());
		System.out.println(result);
		// Player ronaldo = new ObjectMapper().readValue(jsonString, Player.class);
		/*
		 * JSONObject data; JSONParser helper = new JSONParser(); ObjectMapper mapper =
		 * new ObjectMapper(); List<Object> myObjects; try { myObjects =
		 * mapper.readValue(result, new TypeReference<List<Object>>(){}); for(Object b :
		 * myObjects) {
		 * 
		 * System.out.println(b); } System.out.println(myObjects);
		 * 
		 * 
		 * 
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		JSONObject data;
		JSONParser helper = new JSONParser();
		ObjectMapper mapper = new ObjectMapper();
		List<tester> myObjects;
		try {
			myObjects = mapper.readValue(result, new TypeReference<List<tester>>(){});
			for(tester t : myObjects)
			{
			
			System.out.println(t);
		} 
			System.out.println(myObjects);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
