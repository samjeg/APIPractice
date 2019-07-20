

public class JavaMain {
	public static void main(String[] params){
		// create request and print response
		HTTPManagerLiveAPI request = new HTTPManagerLiveAPI();
		String response = request.getHttpRequest();
		System.out.println(response); 
		System.exit(0);
	}
}