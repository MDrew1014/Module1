START TRANSACTION;

DROP TABLE IF EXISTS cocktail;

CREATE TABLE cocktail(
        id SERIAL PRIMARY KEY,
        name varchar(256) NOT NULL,
        alcoholic BOOLEAN NOT NULL DEFAULT TRUE
        );

INSERT INTO cocktail (name) VALUES('Old Fashioned'), ('Whiskey Sour'), ('Manhattan'), ('Mohito');

COMMIT;
SELECT * FROM cocktail;