import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
import java.io.IOException;


public class HTTPManagerStaticAPI2{


	public HTTPManagerStaticAPI2(){}

	public String getHttpRequest(){
		String response = "";
		String user_agent = "Mozilla/5.0";
		try{
			String postode_url = "https://postcodes.io/postcodes/UB56AS";
			URL url_obj = new URL(postode_url);
			HttpURLConnection conn = (HttpURLConnection) url_obj.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", user_agent);

			BufferedReader reader = new BufferedReader(
				new InputStreamReader(conn.getInputStream())
			);

			StringBuffer content = new StringBuffer(); 
			String inputLine;

			while((inputLine = reader.readLine()) != null){
				content.append(inputLine);
			}

			response = content.toString();
			reader.close();
			conn.disconnect();
		}
		catch(IOException e){
			e.printStackTrace();
		}

		return response;
	}
}