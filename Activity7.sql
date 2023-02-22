REM   Script: Activity7
REM   In this activity we will using the orders table to perform aggregate operations using the set operators.

Write SQL queries to get the following results:

Write an SQL statement to find the total purchase amount of all orders.
Write an SQL statement to find the average purchase amount of all orders.
Write an SQL statement to get the maximum purchase amount of all the orders.
Write an SQL statement to get the minimum purchase amount of all the orders.
Write an SQL statement to find the number of salesmen listed in the table.

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

select * from orders;

select purchase_amount, SUM(purchase_amount) 
from orders;

select purchase_amount, SUM(purchase_amount) 
from orders 
group by order_no;

SELECT order_no, SUM(purchase_amount) 
FROM orders 
GROUP BY order_no;

SELECT order_no, SUM(purchase_amount) 
FROM orders 
GROUP BY order_no;

select * from orders;

SELECT order_no, SUM(purchase_amount) 
FROM orders;

SELECT order_no, SUM(purchase_amount) 
FROM orders 
GROUP BY order_no;

Select order_no, AVG(purchase_amount) 
FROM orders 
GROUP BY order_no;

SELECT SUM(purchase_amount) AS "TOTAL_AMOUNT" 
FROM orders 
GROUP BY order_no;

SELECT SUM(purchase_amount) AS "TOTAL_AMOUNT" 
FROM orders;

SELECT SUM(purchase_amount) 
FROM orders;

SELECT SUM(purchase_amount) AS "TOTAL_AMOUNT" 
FROM orders;

Select AVG(purchase_amount) AS "AVERAGEA_AMOUNT" 
FROM orders;

SELECT MAX(purchase_amount) AS "MAX_AMOUNT" 
FROM orders;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

select * from orders;

SELECT SUM(purchase_amount) AS "TOTAL_AMOUNT" 
FROM orders;

Select AVG(purchase_amount) AS "AVERAGEA_AMOUNT" 
FROM orders;

SELECT MAX(purchase_amount) AS "MAX_AMOUNT" 
FROM orders;

SELECT MIN(purchase_amount) AS "MIN_AMOUNT" 
FROM orders;

SELECT MIN(purchase_amount) AS "MIN_AMOUNT" 
FROM orders;

select * from orders;

SELECT COUNT(DISTINCT SALESMAN_ID) AS "SALESMAN_COUNT" 
FROM orders;

select * from orders;
