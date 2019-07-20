import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
import java.io.IOException;

public class HTTPManagerLiveAPI{

	public HTTPManagerLiveAPI(){

	}

	public String getHttpRequest(){
		String response = "";
		String userAgent = "Mozilla/5.0";

		try{
			// Create a connection to the url
			String live_stock_url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=JVXUTYD7P11S8WGS";
			URL url_obj = new URL(live_stock_url);
			HttpURLConnection conn = (HttpURLConnection) url_obj.openConnection();

			// set neccesary request properties
			conn.setRequestMethod("GET");
			conn.setRequestProperty("User-Agent", userAgent);

			// read the reponse comming in using buffer
			BufferedReader reader = new BufferedReader(
				new InputStreamReader(conn.getInputStream())
			);
			StringBuffer data = new StringBuffer();
			String inputLine;

			while((inputLine = reader.readLine()) != null){
				data.append(inputLine);
			}

			response = data.toString();

			// close request and buffer 
			reader.close();
			conn.disconnect();


		} catch( IOException e){
			e.printStackTrace();
		} 

		return response;
	}
}