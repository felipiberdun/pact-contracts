package contracts.producer

org.springframework.cloud.contract.spec.Contract.make {
	request {
		description("""
Represents successfull response for a ping request
given:
	api is up and running
when:
	a request is made to check if it is available
then:
	it will answer with pong
""")
		method 'GET'
		url '/ping'
	}
	response {
		status 200
		body( "pong")
		headers {
			header(
					'Content-Type', 'text/plain'
			)
		}
	}
}