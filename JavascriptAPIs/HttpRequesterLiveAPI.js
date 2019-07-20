class HttpRequesterLiveAPI {

	constructor(){

	}

	getHttpRequest(){
		var live_stock_url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=JVXUTYD7P11S8WGS"
		var request = new XMLHttpRequest();
		request.open("GET", live_stock_url, false);
		request.send(null);
		return request.responseText;
	}
}