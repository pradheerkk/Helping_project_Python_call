import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JavaGetRequest {

	private static HttpURLConnection con;

	public static void main(String[] args) throws MalformedURLException, ProtocolException, IOException {

		String url = "http://localhost:8080/books/";

		try {

			URL myurl = new URL(url);
			con = (HttpURLConnection) myurl.openConnection();

			con.setRequestMethod("GET");

			StringBuilder content;

			try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {

				String line;
				content = new StringBuilder();

				while ((line = in.readLine()) != null) {
					content.append(line);
					content.append(System.lineSeparator());
				}
			}
			System.out.println(content);
			String result = content.toString();
			System.out.println(content.toString());
			System.out.println(content.getClass().getName());
			System.out.println(result);
			// Player ronaldo = new ObjectMapper().readValue(jsonString, Player.class);
			JSONObject data;
			JSONParser helper = new JSONParser();
			ObjectMapper mapper = new ObjectMapper();
			List<Book> myObjects = mapper.readValue(result, new TypeReference<List<Book>>(){});
			for(Book b : myObjects)
			{
			
			System.out.println(b);
		} 
			System.out.println(myObjects);
			
	}
		catch (Exception e) { // TODO Auto-generated catch block
			  e.printStackTrace(); }
	
}
}