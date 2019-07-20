
class HttpRequester {
	
	constructor(){

	}

	getHttpRequest(){
		var beers_url = "https://api.punkapi.com/v2/beers?beer_name=nuclear";
		var request = new XMLHttpRequest();
		request.open("GET", beers_url, false);
		request.send(null);
		return request.responseText
	}
}