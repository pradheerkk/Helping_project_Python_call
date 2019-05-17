import java.io.IOException; 
import org.codehaus.jackson.map.ObjectMapper; 

public class ObjectToJson { 
	
	public String convert_To_Json(TestObject to){
		
		// Creating object of TestObject 
		String jsonStr="";
		//System.out.println(to.toString());
		// Creating Object of ObjectMapper define in Jakson Api 
		//System.out.println("1");
		ObjectMapper om = new ObjectMapper(); 
		//System.out.println(om);

		try { 

			// get Oraganisation object as a json string 
			//System.out.println("2");
			jsonStr = om.writeValueAsString(to); 
			//System.out.println("3");
			// Displaying JSON String 
			System.out.println(jsonStr); 
		} 

		catch (IOException e) { 
			e.printStackTrace(); 
		}
		return jsonStr; 
		
	} 

	// Get the data to be inserted into the object 
}
