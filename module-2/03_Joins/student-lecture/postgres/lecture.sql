-- ********* INNER JOIN ***********

-- Let's find out who made payment 16666:
SELECT * FROM payment
WHERE payment_id = 16666;


-- Ok, that gives us a customer_id, but not the name. We can use the customer_id to get the name FROM the customer table
SELECT * FROM payment
JOIN customer ON payment.customer_id = customer.customer_id
WHERE payment.payment_id = 16666;
-- We can see that the * pulls back everything from both tables. We just want everything from payment and then the first and last name of the customer:
SELECT c.first_name, c.last_name, p.* FROM payment AS p
JOIN customer AS c ON p.customer_id = c.customer_id
WHERE p.payment_id = 16666;
-- But when did they return the rental? Where would that data come from? From the rental table, so let’s join that.

SELECT c.first_name, c.last_name, r.return_date, p.* 
FROM payment AS p
JOIN customer AS c ON p.customer_id = c.customer_id
JOIN rental AS r ON p.rental_id = r.rental_id
WHERE p.payment_id = 16666;

-- What did they rent? Film id can be gotten through inventory.

SELECT c.first_name, c.last_name, r.return_date, f.title, p.* 
FROM payment AS p
JOIN customer AS c ON p.customer_id = c.customer_id
JOIN rental AS r ON p.rental_id = r.rental_id
JOIN inventory AS inv ON r.inventory_id = inv.inventory_id
JOIN film AS f ON inv.film_id = f.film_id
WHERE p.payment_id = 16666;

-- What if we wanted to know who acted in that film?
-- we get more rows here, we go from film to actor through a 1 to many relationship also called a JOIN TABLE film_actor
SELECT c.first_name, c.last_name, r.return_date, f.title, a.first_name, a.last_name, p.* 
FROM payment AS p
JOIN customer AS c ON p.customer_id = c.customer_id
JOIN rental AS r ON p.rental_id = r.rental_id
JOIN inventory AS inv ON r.inventory_id = inv.inventory_id
JOIN film AS f ON inv.film_id = f.film_id
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE p.payment_id = 16666;
-- we can steal the primary key from the film table and change where clause to shorten the query
SELECT f.title, f.film_id, a.*
FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE f.film_id = 948;

--group by join
SELECT f.title, ARRAY_AGG(a.first_name || ' ' || a.last_name) AS "actors"
FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE f.film_id = 948
GROUP BY f.film_id;


-- What if we wanted a list of all the films and their categories ordered by film title
SELECT f.title, c.name
FROM film AS f
JOIN film_category As fc ON f.film_id=fc.film_id
JOIN category AS c ON fc.category_id = c.category_id
ORDER BY f.title;
-- Show all the 'Comedy' films ordered by film title
SELECT f.title, c.name
FROM film AS f
JOIN film_category As fc ON f.film_id=fc.film_id
JOIN category AS c ON fc.category_id = c.category_id
WHERE c.name = 'Comedy'
ORDER BY f.title;
-- Finally, let's count the number of films under each category
SELECT COUNT(f.title), c.name
FROM film AS f
INNER JOIN film_category As fc ON f.film_id=fc.film_id
INNER JOIN category AS c ON fc.category_id = c.category_id
GROUP BY c.name
ORDER BY COUNT(f.title) DESC;

-- ********* LEFT JOIN ***********

-- (There aren't any great examples of left joins in the "dvdstore" database, so the following queries are for the "world" database)

-- A Left join, selects all records from the "left" table and matches them with records from the "right" table if a matching record exists.

-- Let's display a list of all countries and their capitals, if they have some.
--innerjoin will only find matching recors
SELECT * FROM country
JOIN city on country.capital = city.id;
-- Only 232 rows
-- But we’re missing entries:

-- There are 239 countries. So how do we show them all even if they don’t have a capital?
-- That’s because if the rows don’t exist in both tables, we won’t show any information for it. If we want to show data FROM the left side table everytime, we can use a different join:
SELECT * FROM country
LEFT JOIN city on country.capital = city.id;
-- *********** UNION *************

-- Back to the "dvdstore" database...

-- Gathers a list of all first names used by actors and customers
-- By default removes duplicates
SELECT first_name 
FROM actor
UNION
SELECT first_name
FROM customer;

-- Gather the list, but this time note the source table with 'A' for actor and 'C' for customer
