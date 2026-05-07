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




SELECT * FROM FLIGHT_SCHEDULE;
ARRIVAL_TIME  	DEPARTURE_TIME  	ID  	DESTINATION  	FLIGHT_NUMBER  	ORIGIN  
2026-06-01 10:30:00	2026-06-01 08:00:00	1	TAIWAN	PR101	MANILA
2026-06-01 11:00:00	2026-06-01 09:00:00	2	HONGKONG	PR102	MANILA
2026-06-01 13:30:00	2026-06-01 10:00:00	3	THAILAND	PR103	MANILA
2026-06-02 10:00:00	2026-06-02 07:30:00	4	TAIWAN	PR104	CEBU


SELECT * FROM PASSENGER;
ID  	ADDRESS  	EMAIL_ADDRESS  	FULL_NAME  	MOBILE_PHONE  	PASSPORT_NUMBER  
1	Manila Philippines	juan@gmail.com	Juan Dela Cruz	09171234567	null
2	Cavite Philippines	maria@gmail.com	Maria Santos	09181234567	null
3	Batangas Philippines	pedro@gmail.com	Pedro Reyes	09191234567	null



```
