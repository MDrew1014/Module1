DROP TABLE IF EXISTS status;

CREATE TABLE status(
        id SERIAL PRIMARY KEY,
        is_apocalypse boolean NOT NULL DEFAULT false,
        message varchar(120) NOT NULL
)