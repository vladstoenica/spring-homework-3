use subs;
INSERT INTO customer (phoneNumber, customerName, customerAddress, customerType, customerIdProof, subscription_id)
VALUES ('0722222222, ‘Ion Ion’, 'Str Mare nr 1’, ‘premium’, 1, 1);

INSERT INTO customer (phoneNumber, customerName, customerAddress, customerType, customerIdProof, subscription_id)
VALUES ('0722222223’, ‘Andrei Andrei, 'Str Mica nr 4’, ‘standard’, 0, 2);

INSERT INTO customer (phoneNumber, customerName, customerAddress, customerType, customerIdProof, subscription_id)
VALUES ('0722222224’, ‘Marcel ‘Popescu, 'Str Ultima nr 12’ , ‘premium’, 1, 3);


INSERT INTO bill (bill_no, month, cost, status, customer_id, subscription_id)
VALUES (1, 'jan', '30', 'paid', 1, 1);

INSERT INTO bill (bill_no, month, cost, status, customer_id, subscription_id)
VALUES (2, 'feb', '30', 'not paid', 1, 1);

INSERT INTO bill (bill_no, month, cost, status, customer_id, subscription_id)
VALUES (3, 'feb', '100', 'paid', 2, 2);

INSERT INTO bill (bill_no, month, cost, status, customer_id, subscription_id)
VALUES (4, 'feb', '120', 'paid', 3, 3);


INSERT INTO subscription (subscription_id, cost, details, area, speed)
VALUES (1, '30', 'standard', 'area 1', 100);

INSERT INTO subscription (subscription_id, cost, details, area, speed)
VALUES (2, '100', 'premium', 'area 2', 200);

INSERT INTO subscription (subscription_id, cost, details, area, speed)
VALUES (3, '120', 'premium', 'area 2', 300);