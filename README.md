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
