INSERT INTO PROVINCE VALUES (1, 'Cordoba');
INSERT INTO PROVINCE VALUES (2, 'Buenos Aires');
INSERT INTO PROVINCE VALUES (3, 'Mendoza');
INSERT INTO PROVINCE VALUES (4, 'Santa Fe');
INSERT INTO PROVINCE VALUES (5, 'San Luis');

INSERT INTO CUSTOMER VALUES (1, 'Emanuel', 'Ramirez', 11111111, 'FakeStreet 111', 'RealStreet', 'Neighbourhood', 111, 'test@test.com', 1, 1);
INSERT INTO CUSTOMER VALUES (2, 'Lalo', 'Landa', 22222222, 'FakeStreet 222', 'RealStreet', 'Neighbourhood', 222, 'test2@test.com', 1, 2);
INSERT INTO CUSTOMER VALUES (3, 'Luke', 'Skywalker', 33333333, 'FakeStreet 333', 'RealStreet', 'Neighbourhood', 333, 'test3@test.com', 1, 2);
INSERT INTO CUSTOMER VALUES (4, 'John', 'Doe', 44444444, 'FakeStreet 444', 'RealStreet', 'Neighbourhood', 444, 'test4@test.com', 0, 3);
INSERT INTO CUSTOMER VALUES (5, 'Jane', 'Doe', 55555555, 'FakeStreet 555', 'RealStreet', 'Neighbourhood', 555, 'test5@test.com', 1, 3);

INSERT INTO CUSTOMER_ORDER VALUES (1, NOW(), 'Pending', 12345678, 1, 1);
INSERT INTO CUSTOMER_ORDER VALUES (2, NOW(), 'Completed', 12345678, 1, 1);
INSERT INTO CUSTOMER_ORDER VALUES (3, NOW(), 'Completed', 12345678, 1, 2);