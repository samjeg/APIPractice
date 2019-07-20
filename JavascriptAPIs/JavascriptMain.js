
$(document).ready(function(){
	//  create response using custum class and print response
	// var request = new HttpRequester();
	var request = HttpRequester2();
	var response = request.getHttpRequest();
	console.log("Response: "+response);
});