import requests

class Requester(object):

	def __init__(self):
		self.beer_url = "https://api.punkapi.com/v2/beers?beer_name=nuclear"


	def getHttpRequest(self):
		# Create a reponse and get the json data
		request = requests.get(url=self.beer_url)

		return request.json() 


