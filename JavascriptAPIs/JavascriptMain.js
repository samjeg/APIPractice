
$(document).ready(function(){
	//  create response using custum class and print response
	// var request = new HttpRequester();
	// var request = new HttpRequester2();
	var request = new HttpRequesterLiveAPI();
	var response = request.getHttpRequest();
	console.log("Response: "+response);
});