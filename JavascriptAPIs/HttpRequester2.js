class HttpRequester2{

	constructor(){

	}

	getHttpRequest(){
		// create get request and read response
		var postcode_url = "https://postcodes.io/postcodes/UB56AS";
		var request = new XMLHttpRequest();
		request.open("GET", postcode_url, false);
		request.send(null);
		return request.responseText
	}
}