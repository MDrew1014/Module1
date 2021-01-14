-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**
SELECT * FROM actor;
-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
START TRANSACTION;
INSERT INTO actor (actor_id, first_name, last_name) VALUES (201, 'Hampton', 'Avenue');
INSERT INTO actor (actor_id, first_name, last_name) VALUES (202, 'Lisa', 'Byway');
SELECT * FROM actor;
COMMIT;
SELECT * FROM actor;
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
SELECT * FROM film;
START TRANSACTION;
INSERT INTO film ( title, description, release_year, language_id, length) VALUES('EUCLIDIAN PI', 'The epic story of Euclid as a pizza delivery boy in
ancient Greece', 2008, 1, 198);
SELECT * FROM film ORDER BY film_id DESC LIMIT 10;
COMMIT;
SELECT * FROM film ORDER BY film_id DESC LIMIT 10;
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT * FROM film WHERE film_id = 1008;
SELECT * FROM film_actor;
START TRANSACTION;
INSERT INTO film_actor (actor_id, film_id) VALUES (201, 1008);
INSERT INTO film_actor (actor_id, film_id) VALUES (202, 1008);
SELECT * FROM film_actor;
COMMIT;
-- 4. Add Mathmagical to the category table.
SELECT * FROM category;
START TRANSACTION;
INSERT INTO category (name) VALUES ('Mathmagical');
SELECT * FROM category;
COMMIT;
SELECT * FROM category;
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT * FROM film_category;
START TRANSACTION;
INSERT INTO film_category (film_id, category_id) VALUES (274, 17);
INSERT INTO film_category (film_id, category_id) VALUES (1008, 17);
INSERT INTO film_category (film_id, category_id) VALUES (494, 17);
INSERT INTO film_category (film_id, category_id) VALUES (714, 17);
INSERT INTO film_category (film_id, category_id) VALUES (996, 17);
ROLLBACK;
SELECT * FROM film_category WHERE film_id IN (274,1008,494,714,996);
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
SELECT * FROM film WHERE film_id IN (274,1008,494,714,996);
START TRANSACTION;
UPDATE film set rating = 'G' WHERE film_id = 274;
UPDATE film set rating = 'G' WHERE film_id = 1008;
UPDATE film set rating = 'G' WHERE film_id = 494;
UPDATE film set rating = 'G' WHERE film_id = 714;
UPDATE film set rating = 'G' WHERE film_id = 996;
COMMIT;
-- 7. Add a copy of "Euclidean PI" to all the stores.
SELECT * FROM inventory;
START TRANSACTION;
INSERT INTO inventory(film_id, store_id) VALUES (1008,1);
INSERT INTO inventory(film_id, store_id) VALUES (1008,2);
COMMIT;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- unable to delete from foreign key constraint on table film_actor
START TRANSACTION;
DELETE FROM film WHERE title = 'EUCLIDIAN PI';

-- 9. Delete Mathmagical from the category table.
START TRANSACTION;
DELETE FROM category WHERE category_id = 17;
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>
-- unable to delete on table becuase it violates foreign key constraints
-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
SELECT * FROM film_category;
START TRANSACTION;
DELETE FROM film_category WHERE category_id = 17;
COMMIT;
-- <YOUR ANSWER HERE>
---- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
START TRANSACTION;
DELETE FROM category WHERE category_id = 17;
COMMIT;
START TRANSACTION;
DELETE FROM film WHERE title = 'EUCLIDIAN PI';
ROLLBACK;
-- <YOUR ANSWER HERE>
--COULD DELET THE CATEGORY BUT NOT THE NAME BECAUSE OF FOREIGN KEY CONSTRAINTS
-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS;
--I would have to first delete the film from film_id and then could delete it from the film table