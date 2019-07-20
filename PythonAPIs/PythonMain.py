from PythonRequestStaticAPI import Requester
from PythonRequestStaticAPI2 import Requester2
from PythonRequestLiveAPI import LiveAPIRequester

if __name__ == "__main__":
	# get request and print json data
	# request = Requester()
	# request = Requester2()
	request = LiveAPIRequester()
	response = request.getHttpRequest()

	print("Response: %s"%response)