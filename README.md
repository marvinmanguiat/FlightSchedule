# FlightSched

GET :
/v1/api/flight_schedule/search?origin=MANILA&destination=HONGKONG&page=0&size=10&sort=departureTime,asc

OUT:
```json
[
    {
        "arrivalTime": "2026-06-01T13:30:00",
        "departureTime": "2026-06-01T10:00:00",
        "destination": "THAILAND",
        "flightNumber": "PR103",
        "id": 3,
        "origin": "MANILA",
        "seats": [
            {
                "id": 13,
                "seatNumber": "1A",
                "seatType": "BUSINESS",
                "status": "AVAILABLE"
            },
            {
                "id": 14,
                "seatNumber": "1B",
                "seatType": "BUSINESS",
                "status": "AVAILABLE"
            },
            {
                "id": 15,
                "seatNumber": "2A",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            },
            {
                "id": 16,
                "seatNumber": "2B",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            },
            {
                "id": 17,
                "seatNumber": "2C",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            },
            {
                "id": 18,
                "seatNumber": "2D",
                "seatType": "ECONOMY",
                "status": "AVAILABLE"
            }
        ]
    },
    {
        "arrivalTime": "2026-06-01T13:30:00",
        "departureTime": "2026-06-01T10:00:00",
        "destination": "THAILAND",
        "flightNumber": "PR103",
        "id": 4,
        "origin": "MANILA",
        "seats": []
    },
    {
        "arrivalTime": "2026-06-01T13:30:00",
        "departureTime": "2026-06-01T10:00:00",
        "destination": "THAILAND",
        "flightNumber": "PR103",
        "id": 5,
        "origin": "MANILA",
        "seats": []
    },
    {
        "arrivalTime": "2026-06-01T13:30:00",
        "departureTime": "2026-06-01T10:00:00",
        "destination": "THAILAND",
        "flightNumber": "PR103",
        "id": 6,
        "origin": "MANILA",
        "seats": []
    },
    {
        "arrivalTime": "2026-06-01T13:30:00",
        "departureTime": "2026-06-01T10:00:00",
        "destination": "THAILAND",
        "flightNumber": "PR103",
        "id": 7,
        "origin": "MANILA",
        "seats": []
    }
]
```


Reserve

POST :
/v1/api/flight_reservation/1/reserve

Request Payload:
```json
{
    "passengerId": 3,
    "seatId": 14
}
```


Response Payload
```json
{
    "flightSeat": {
        "id": 14,
        "seatNumber": "1B",
        "seatType": "BUSINESS",
        "status": "RESERVED"
    },
    "id": 1,
    "passenger": {
        "address": "Batangas Philippines",
        "emailAddress": "pedro@gmail.com",
        "full_name": "Pedro Reyes",
        "id": 3,
        "mobilePhone": "09191234567",
        "passportNumber": null
    },
    "reservationDate": "2026-05-07T21:21:25.279412"
}

```
