

public class JavaMain {
	public static void main(String[] params){
		// HTTPManagerStaticAPI request = new HTTPManagerStaticAPI();
		// String response = request.makeAllBeersCall();
		// HTTPManagerStaticAPI2 request = new HTTPManagerStaticAPI2();
		HTTPManagerLiveAPI request = new HTTPManagerLiveAPI();
		String response = request.getHttpRequest();
		System.out.println(response); 
		System.exit(0);
	}
}