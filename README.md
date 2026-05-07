# FlightSched

GET :
/v1/api/flight_schedule/search?origin=MANILA&destination=HONGKONG

OUT:
```json
[
    {
        "arrivalTime": "2026-06-01T11:00:00",
        "departureTime": "2026-06-01T09:00:00",
        "destination": "HONGKONG",
        "flightNumber": "PR102",
        "id": 2,
        "origin": "MANILA",
        "seats": [
            {
                "id": 7,
                "seatNumber": "1A",
                "seatType": "BUSINESS",
                "status": "AVAILABLE"
            },
            {
                "id": 8,
                "seatNumber": "1B",
                "seatType": "BUSINESS",
                "status": "AVAILABLE"
            },
            {
                "id": 9,
                "seatNumber": "2A",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            },
            {
                "id": 10,
                "seatNumber": "2B",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            },
            {
                "id": 11,
                "seatNumber": "2C",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            },
            {
                "id": 12,
                "seatNumber": "2D",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            }
        ]
    }
]
```


Reserve

POST :
http://localhost:8080/v1/api/flight_reservation/1/reserve

Request Payload:
```json
{
    "passengerId": 3,
    "seatId": 7
}
```


Response Payload
```json
{
    "flightSeat": {
        "id": 7,
        "seatNumber": "1A",
        "seatType": "BUSINESS",
        "status": "RESERVED"
    },
    "id": 2,
    "passenger": {
        "address": "Batangas Philippines",
        "emailAddress": "pedro@gmail.com",
        "full_name": "Pedro Reyes",
        "id": 3,
        "mobilePhone": "09191234567",
        "passportNumber": null
    },
    "reservationDate": "2026-05-07T16:31:20.5835629"
}
```
