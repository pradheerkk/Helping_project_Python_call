import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException; 
 
public class JArray {
 
public static void main(String args[]) throws JSONException {
	String jsonString1 = null;
	String jsonString2 = null;
	String jsonString3 = null;
JSONArray arrayObj = new JSONArray();
a a=new a();
b b = new b();
c c =new c();
ObjectMapper mapper = new ObjectMapper();
mapper.setVisibility(JsonMethod.FIELD, Visibility.ANY);
try {
	 jsonString1 = mapper.writeValueAsString(a);
	 jsonString2 = mapper.writeValueAsString(b);
	 jsonString3 = mapper.writeValueAsString(c);
} catch (JsonGenerationException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (JsonMappingException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
arrayObj.put(jsonString1);
arrayObj.put(jsonString2);
arrayObj.put(jsonString3);
 
System.out.println(arrayObj);
//System.out.println(jsonString1);
 
int length = arrayObj.length();
 

 
System.out.println("Length: " + length);
 
 }
}