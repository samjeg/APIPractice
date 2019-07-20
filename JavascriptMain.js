
$(document).ready(function(){
	var request = new HttpRequester();
	var response = request.getHttpRequest();
	console.log("Response: "+response);
});