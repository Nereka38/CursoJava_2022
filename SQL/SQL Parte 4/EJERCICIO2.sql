use capgemini_arg;

desc locations;
SELECT * from locations;

INSERT INTO locations (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID)
VALUES (9999, 'Manuela Pedraza', 1429, 'Buenos Aires', 'Buenos Aires', 'AR');

desc countries;
select * from countries;

INSERT INTO countries (COUNTRY_ID, COUNTRY_NAME, REGION_ID)
VALUES ('AR', 'Argentina', 2);