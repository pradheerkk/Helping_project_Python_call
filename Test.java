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
  HttpPost post = new HttpPost("http://10.177.54.170:8000/calculate");
	 ObjectToJson ob = new ObjectToJson();
  TestObject to=new TestObject();
  String s=ob.convert_To_Json(to);
  System.out.println(s);
  StringEntity input = new StringEntity("s");
  input.setContentType("application/json");
  post.setEntity(input);
  HttpResponse response = client.execute(post);
  BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
  String line = "";
  while ((line = rd.readLine()) != null) {
   System.out.println(line);
  }
 }
}
