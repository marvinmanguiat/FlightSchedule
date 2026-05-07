INSERT INTO flight_schedule
(id, flight_number, origin, destination, departure_time, arrival_time)
VALUES
(1, 'PR101', 'MANILA', 'TAIWAN',   '2026-06-01 08:00:00', '2026-06-01 10:30:00'),
(2, 'PR102', 'MANILA', 'HONGKONG','2026-06-01 09:00:00', '2026-06-01 11:00:00'),
(3, 'PR103', 'MANILA', 'THAILAND','2026-06-01 10:00:00', '2026-06-01 13:30:00'),
(4, 'PR104', 'CEBU',   'TAIWAN', '2026-06-02 07:30:00', '2026-06-02 10:00:00');



INSERT INTO flight_seat
(id, seat_number, seat_type, status, flight_schedule_id)
VALUES
(1,  '1A', 'BUSINESS', 'AVAILABLE', 1),
(2,  '1B', 'BUSINESS', 'AVAILABLE', 1),
(3,  '2A', 'ECONOMY',  'AVAILABLE', 1),
(4,  '2B', 'ECONOMY',  'AVAILABLE', 1),
(5,  '2C', 'ECONOMY',  'AVAILABLE', 1),
(6,  '2D', 'ECONOMY',  'AVAILABLE', 1);



INSERT INTO flight_seat
(id, seat_number, seat_type, status, flight_schedule_id)
VALUES
(7,  '1A', 'BUSINESS', 'AVAILABLE', 2),
(8,  '1B', 'BUSINESS', 'AVAILABLE', 2),
(9,  '2A', 'ECONOMY',  'AVAILABLE', 2),
(10, '2B', 'ECONOMY',  'AVAILABLE', 2),
(11, '2C', 'ECONOMY',  'AVAILABLE', 2),
(12, '2D', 'ECONOMY',  'AVAILABLE', 2);


INSERT INTO flight_seat
(id, seat_number, seat_type, status, flight_schedule_id)
VALUES
(13, '1A', 'BUSINESS', 'AVAILABLE', 3),
(14, '1B', 'BUSINESS', 'AVAILABLE', 3),
(15, '2A', 'ECONOMY',  'AVAILABLE', 3),
(16, '2B', 'ECONOMY',  'AVAILABLE', 3),
(17, '2C', 'ECONOMY',  'AVAILABLE', 3),
(18, '2D', 'ECONOMY',  'AVAILABLE', 3);




INSERT INTO passenger
(id, full_name, address, mobile_phone, email_address)
VALUES
(1, 'Juan Dela Cruz', 'Manila Philippines', '09171234567', 'juan@gmail.com'),
(2, 'Maria Santos', 'Cavite Philippines', '09181234567', 'maria@gmail.com'),
(3, 'Pedro Reyes', 'Batangas Philippines', '09191234567', 'pedro@gmail.com');

