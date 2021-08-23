# Shipping

### Default port
`8085`

### Context Path
	[POST] - JSON http://localhost:8085/api/shipping/calculate
		{
		    "cpf": "34874642845",
		    "codProd": 1
		}
		
	RETURN 
		{
		    "value": 2.0,
		    "deliveryTime": 10,
		    "manufactured": true
		}


### Build docker
docker build -t madeira/shipping:latest .

docker run -p8085:8085 madeira/shipping:latest
