import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
public class Test {
 public static void main(String[] args) throws ClientProtocolException, IOException {
  HttpClient client = new DefaultHttpClient();
  HttpPost post = new HttpPost("http://10.177.54.170:8000/calculate/");
  
	 ObjectToJson ob = new ObjectToJson();
  TestObject to=new TestObject();
  String s=ob.convert_To_Json(to);
 // post.setEntity(s);
  System.out.println(s);
  StringEntity input = new StringEntity(s);
  input.setContentType("application/json");
  post.setEntity(input);
  HttpResponse response = client.execute(post);
  BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
  String line = "";
  while ((line = rd.readLine()) != null) {
   System.out.println(line);
  }
String jsonValue="{\"MDMSGPHist\":{\"mean_cti\":\"0.09775471870078165\",\"stddev_cti\":\"0.010620863054360058\"}, \"MDMSMetres\":{\"elevation_m\":\"998.7\",\"roughness_m\":\"0.03\",\"wind_speed\":\"8.92\",\"weibull_a\":\"10.060003791384636\"},\"MDMSKiloMetres\":{\"elevation_m\":\"980.3163893523727\",\"roughness_m\":\"0.11\",\"air_density\":\"1.0731408364474098\",\"wind_speed\":\"7.58006003713075\"}}";
	/*//Gson gson = new Gson();
	JsonParser parser = new JsonParser();
	JsonObject object = (JsonObject) parser.parse(jsonValue);// response will be the json String
	//YourPojo emp = gson.fromJson(object, YourPojo.class); 
	json from python ={"MDMSGPHist":{"mean_cti":"0.09775471870078165","stddev_cti":"0.010620863054360058"}, "MDMSMetres":{"elevation_m":"998.7","roughness_m":"0.03","wind_speed":"8.92","weibull_a":"10.060003791384636"},"MDMSKiloMetres":{"elevation_m":"980.3163893523727","roughness_m":"0.11","air_density":"1.0731408364474098","wind_speed":"7.58006003713075"}}
*/ 
	ObjectMapper objectMapper = new ObjectMapper();
	objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	WindParameters wp = objectMapper.readValue(jsonValue, WindParameters.class);
	
	System.out.println(wp.toString());	
 }
}
