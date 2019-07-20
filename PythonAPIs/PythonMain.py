from PythonRequestStaticAPI import Requester

if __name__ == "__main__":
	# get request and print json data
	request = Requester()
	response = request.getHttpRequest()

	print("Response: %s"%response)