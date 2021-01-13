-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
SELECT f.title, a.first_name, a.last_name
FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE first_name = 'NICK' AND last_name = 'STALLONE';
-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
SELECT f.title, a.first_name, a.last_name
FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE first_name = 'RITA' AND last_name = 'REYNOLDS';
-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)
SELECT f.title, a.first_name, a.last_name
FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE (first_name = 'JUDY' AND last_name = 'DEAN') OR (first_name = 'RIVER' AND last_name = 'DEAN');
-- 4. All of the the ‘Documentary’ films
-- (68 rows)
SELECT film.title, category.name AS category_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Documentary'
ORDER BY film.title;
-- 5. All of the ‘Comedy’ films
-- (58 rows)
SELECT film.title, category.name AS category_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Comedy'
ORDER BY film.title;
-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
SELECT film.title, category.name AS category_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Children' AND film.rating = 'G';
-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)
SELECT film.title, category.name AS category_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Family' AND film.rating = 'G' AND film.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)
SELECT f.title, a.first_name, a.last_name
FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE first_name = 'MATTHEW' AND last_name = 'LEIGH' AND f.rating = 'G';
-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
SELECT film.title, category.name AS category_name
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Sci-Fi' AND film.release_year = 2006;
-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
SELECT f.title
FROM film AS f
JOIN film_category ON f.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON fa.actor_id = a.actor_id
WHERE category.name = 'Action' AND a.first_name = 'NICK' AND a.last_name = 'STALLONE';
-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)
SELECT address.address, address.address2, city.city, address.district,country.country   -----WRONG
FROM address
JOIN city ON address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
SELECT staff.store_id, address.address, staff.first_name, staff.last_name
FROM address
JOIN city ON address.city_id = city.city_id
JOIN country ON city.country_id = country.country_id
JOIN staff ON staff.address_id = address.address_id;
SELECT *
FROM staff;
-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)
SELECT customer.first_name, customer.last_name, COUNT(payment.amount)
FROM customer
JOIN rental ON rental.customer_id = customer.customer_id
JOIN payment ON rental.rental_id = payment.rental_id
GROUP BY customer.first_name, customer.last_name
ORDER BY COUNT(payment.amount) DESC LIMIT 10;
-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)
SELECT customer.first_name, customer.last_name, SUM(payment.amount)
FROM customer
JOIN rental ON rental.customer_id = customer.customer_id
JOIN payment ON rental.rental_id = payment.rental_id
GROUP BY customer.first_name, customer.last_name
ORDER BY SUM(payment.amount) DESC LIMIT 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that an employee may work at multiple stores.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
SELECT s.store_id, a.address, COUNT(r.rental_id) AS "Total # of Rentals", SUM(p.amount) AS "Total Amount of Sales", AVG(p.amount) AS "Average Sale"
FROM store AS s
JOIN address AS a ON s.address_id = a.address_id
JOIN inventory AS i ON s.store_id = i.store_id
JOIN rental AS r ON i.inventory_id = r.inventory_id
JOIN payment AS p ON r.rental_id = p.rental_id
GROUP BY s.store_id, a.address
ORDER BY s.store_id;
-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)
SELECT film.title, COUNT(r.rental_id)
FROM film
JOIN inventory AS i ON i.film_id = film.film_id
JOIN rental AS r ON r.inventory_id = i.inventory_id
GROUP BY film.title
ORDER BY COUNT(r.rental_id) DESC LIMIT 10;
-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)
SELECT c.name, COUNT(r.rental_id)
FROM category AS c
JOIN film_category AS fc ON c.category_id = fc.category_id
JOIN film ON fc.film_id = film.film_id
JOIN inventory AS i ON i.film_id = film.film_id
JOIN rental AS r ON r.inventory_id = i.inventory_id
GROUP BY c.name
ORDER BY COUNT(r.rental_id) DESC LIMIT 5;
-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
SELECT film.title, COUNT(r.rental_id)
FROM category AS c
JOIN film_category AS fc ON c.category_id = fc.category_id
JOIN film ON fc.film_id = film.film_id
JOIN inventory AS i ON i.film_id = film.film_id
JOIN rental AS r ON r.inventory_id = i.inventory_id
WHERE c.name = 'Action'
GROUP BY film.title
ORDER BY COUNT(r.rental_id) DESC LIMIT 5;
-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)
SELECT a.first_name, a.last_name, COUNT(r.rental_id)
FROM actor AS a
JOIN film_actor AS fa ON fa.actor_id = a.actor_id
JOIN film AS f ON f.film_id = fa.film_id
JOIN inventory AS i ON i.film_id = f.film_id
JOIN rental AS r ON r.inventory_id = i.inventory_id
GROUP BY a.actor_id, a.first_name, a.last_name
ORDER BY COUNT(r.rental_id) DESC LIMIT 10;

-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
SELECT a.last_name, a.first_name, COUNT(r.rental_id)
FROM film AS f
JOIN film_actor AS fa ON f.film_id = fa.film_id
JOIN actor AS a ON a.actor_id = fa.actor_id
JOIN film_category AS fc ON fc.film_id = f.film_id
JOIN category AS c ON c.category_id = fc.category_id
JOIN inventory AS i ON i.film_id = f.film_id
JOIN rental AS r ON r.inventory_id = i.inventory_id
WHERE c.name = 'Comedy'
GROUP BY a.last_name, a.first_name
ORDER BY COUNT(r.rental_id) DESC limit 5;
