import requests

class Requester2(object):

	def __init__(self):
		self.postcode_url = "https://postcodes.io/postcodes/UB56AS"

	def getHttpRequest(self):

		request = requests.get(url=self.postcode_url)

		return request.json()
