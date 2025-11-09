-- public.persons definition

-- Drop table

-- DROP TABLE public.persons;

CREATE TABLE public.persons (
	id serial4 NOT NULL,
	city varchar NULL,
	"name" varchar NULL,
	phone_number varchar NULL,
	CONSTRAINT persons_pk PRIMARY KEY (id)
);