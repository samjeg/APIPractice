// import org.apache.http.client.methods
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
import java.net.URL;
import java.io.IOException;

public class HTTPManagerStaticAPI {

    public HTTPManagerStaticAPI() {
    }

    //cornstructor methods
    public String makeAllBeersCall() {
        String response = "";

        try {
            String url = "http://www.google.com/search?q=mkyong";
            String beers_url = "https://api.punkapi.com/v2/beers?beer_name=nuclear";
            URL obj = new URL(beers_url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            
            con.setRequestMethod("GET");
            String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36";
            String userAgent2 = "Mozilla/5.0";
            // System.out.println("user agent: "+userAgent);
            con.setRequestProperty("User-Agent", userAgent2);


            BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            
            response = content.toString();    
            in.close();
            con.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return response;
    }


}