import requests

class LiveAPIRequester(object):

	def __init__(self):
		self.live_stock_url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY&symbol=MSFT&interval=5min&apikey=JVXUTYD7P11S8WGS"

	def getHttpRequest(self):

		request = requests.get(url=self.live_stock_url)

		return request.json()