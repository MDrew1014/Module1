BEGIN TRANSACTION;
CREATE TABLE address
(
id serial, 
house_number varchar(16) NOT NULL,
street varchar(64) NOT NULL,
street2 varchar(64),
city varchar(64) NOT NULL,
province varchar(64) NOT NULL,
postal_code varchar(16) NOT NULL,
CONSTRAINT pk_address PRIMARY KEY(id)
);




CREATE TABLE person
(
  id serial PRIMARY KEY ,
  first_name varchar(64),
  last_name varchar(64),
  create_date TIMESTAMP NOT NULL DEFAULT now()
  );
  INSERT INTO person (first_name, last_name) VALUES ('Elizabeth', 'Jackson');
  SELECT * FROM person;
 
  


CREATE TABLE person_address
(
person_id int NOT NULL,
address_id int NOT NULL,
is_primary boolean NOT NULL DEFAULT false,
is_billing boolean NOT NULL DEFAULT false,
CONSTRAINT pk_person_address PRIMARY KEY (person_id, address_id)

);

ALTER TABLE person_address
ADD CONSTRAINT fk_person_id_id FOREIGN KEY (person_id) REFERENCES person(id),
ADD CONSTRAINT fk_address_id_id FOREIGN KEY (address_id) REFERENCES address(id);


ROLLBACK;