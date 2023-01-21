USE mydb;
describe person;

INSERT INTO person VALUES(1,'shio','makatsaria',26);
INSERT INTO person VALUES(2,'giorgi','afshilava',48);
INSERT INTO person VALUES(3,'beqa','dzagania',21);
INSERT INTO person VALUES(4,'nodari','marabdeli',19);
INSERT INTO person VALUES(5,'irakli','nacvlishvili',25);
INSERT INTO person VALUES(6,'miriani','mukeria',29);
INSERT INTO person VALUES(7,'giorgi','ghulatava',46);
INSERT INTO person VALUES(8,'shota','shiolashvili',63);
INSERT INTO person VALUES(9,'nika','baratashvili',46);
INSERT INTO person VALUES(10,'achi','sherozia',35);
INSERT INTO person VALUES(11,'erekle','gulia',27);
INSERT INTO person VALUES(12,'sulxani','bzikadze',32);
INSERT INTO person VALUES(13,'bachi','nadareishvili',34);
INSERT INTO person VALUES(14,'genadi','natelashvili',18);
INSERT INTO person VALUES(15,'zviadi','gorgiladze',24);

describe tires;

INSERT INTO tires VALUES(1,4,195, 'michlen');
INSERT INTO tires VALUES(2,4,195, 'Continental');
INSERT INTO tires VALUES(3,4,200, 'Bridgestone');
INSERT INTO tires VALUES(4,4,200, 'Bridgestone');
INSERT INTO tires VALUES(5,4,190, 'FiGoodyearrestone');
INSERT INTO tires VALUES(6,4,190, 'michlen');


describe carservices;
INSERT INTO carservices VALUES(1,'Wrench_King');
INSERT INTO carservices VALUES(2,'Marvel_Autos');
INSERT INTO carservices VALUES(3,'Ignition_Kingdom');
INSERT INTO carservices VALUES(4,'Car_Medic');
INSERT INTO carservices VALUES(5,'Wheels_Doc');
INSERT INTO carservices VALUES(6,'Ignition_Kingdom');
INSERT INTO carservices VALUES(7,'Wrench_King');
INSERT INTO carservices VALUES(8,'Wheels_Doc');

describe serviceemployee;

INSERT INTO serviceemployee VALUES(1,3,89,'mechanic',2,2);
INSERT INTO serviceemployee VALUES(2,3,75,'mechanic',2,3);
INSERT INTO serviceemployee VALUES(3,2,59,'mechanic',4,5);
INSERT INTO serviceemployee VALUES(4,2,89,'mechanic',1,1);
INSERT INTO serviceemployee VALUES(5,5,128,'mechanic',7,8);
INSERT INTO serviceemployee VALUES(6,4,111,'mechanic',11,7);
INSERT INTO serviceemployee VALUES(7,3,97,'mechanic',12,3);
INSERT INTO serviceemployee VALUES(8,1,43,'mechanic',14,5);
INSERT INTO serviceemployee VALUES(9,1,40,'mechanic',5,5);
SELECT * FROM serviceemployee;


DESCRIBE engine;
INSERT INTO engine VALUES(1,'Kryotec 2-litre turbocharged',485,11);
INSERT INTO engine VALUES(2,'1.3-Litre turbocharged',385,7);
INSERT INTO engine VALUES(3,'Smartstream G 1.4-litre turbo GDI',425,12);
INSERT INTO engine VALUES(4,'1.5-litre i-VTEC',235,6);
INSERT INTO engine VALUES(5,'Smartstream G 1.4-litre turbo GDI',425,12);
INSERT INTO engine VALUES(6,'1.3-Litre turbocharged',385,7);
INSERT INTO engine VALUES(7,'1.5-litre i-VTEC',235,6);
INSERT INTO engine VALUES(8,'1.2-litre Revotron turbocharged',285,6);
INSERT INTO engine VALUES(9,'1-litre Kappa turbocharged GDi',225,5);
INSERT INTO engine VALUES(10,'Smartstream G 1.4-litre turbo GDI',425,12);
INSERT INTO engine VALUES(11,'1-litre Kappa turbocharged GDi',225,5);
INSERT INTO engine VALUES(12,'1.2-litre Revotron turbocharged',285,6);

SELECT * FROM engine;


DESCRIBE gearbox;
INSERT INTO gearbox VALUES(1,5,'Manual Transmission');
INSERT INTO gearbox VALUES(2,6,'Torque Converter Automatic');
INSERT INTO gearbox VALUES(3,5,'CVT Automatic');
INSERT INTO gearbox VALUES(4,5,'DCT Automatic');
INSERT INTO gearbox VALUES(5,6,'AMT');

describe carparts;

INSERT INTO carparts VALUES(1,5,5,4);
INSERT INTO carparts VALUES(2,2,3,4);
INSERT INTO carparts VALUES(3,12,3,3);
INSERT INTO carparts VALUES(4,4,4,3);
INSERT INTO carparts VALUES(5,6,4,5);
INSERT INTO carparts VALUES(6,9,1,5);
INSERT INTO carparts VALUES(7,9,2,5);
INSERT INTO carparts VALUES(8,4,1,2);


describe lights;
INSERT INTO lights VALUES(1,1,1,1,1,0);
INSERT INTO lights VALUES(2,1,0,1,1,0);
INSERT INTO lights VALUES(3,1,1,1,1,1);
INSERT INTO lights VALUES(4,1,1,0,1,0);
INSERT INTO lights VALUES(5,1,1,1,1,1);
INSERT INTO lights VALUES(6,1,1,0,1,1);

describe heatingcooling;


INSERT INTO heatingcooling VALUES(1,1,1,1,1);
INSERT INTO heatingcooling VALUES(2,0,1,1,1);
INSERT INTO heatingcooling VALUES(3,0,0,1,0);
INSERT INTO heatingcooling VALUES(4,0,1,1,0);
INSERT INTO heatingcooling VALUES(5,0,0,1,1);
INSERT INTO heatingcooling VALUES(6,1,1,1,1);

describe carsystems;

INSERT INTO carsystems VALUES(1,1,6);
INSERT INTO carsystems VALUES(2,4,5);
INSERT INTO carsystems VALUES(3,1,6);
INSERT INTO carsystems VALUES(4,2,1);
INSERT INTO carsystems VALUES(5,1,3);
INSERT INTO carsystems VALUES(6,5,1);

describe carslist;

describe carshops;
INSERT INTO  carshops VALUES(6,'Marvel Autos',279);
INSERT INTO  carshops VALUES(7,'Car Fixers.',761);
INSERT INTO  carshops VALUES(8,'Wrench King.',1687);
INSERT INTO  carshops VALUES(5,'Car Medic.',7139);
INSERT INTO  carshops VALUES(4,'Car Intel.',4921);
SELECT * FROM carshops;


describe carowner;
INSERT INTO carowner VALUES(1,'much',4);
INSERT INTO carowner VALUES(2,'few',2);
INSERT INTO carowner VALUES(3,'few',6);
INSERT INTO carowner VALUES(4,'much',9);

describe carslist;

INSERT INTO carslist VALUES(1,'Audi A3 Cabriolet.',2010,5,3,2,2);
INSERT INTO carslist VALUES(2,'Audi A3 Cabriolet.',2000,3,1,1,3);
INSERT INTO carslist VALUES(3,'Audi A3 Cabriolet.',1985,3,1,2,1);
INSERT INTO carslist VALUES(4,'Audi A3 Cabriolet.',2013,5,1,4,1);
INSERT INTO carslist VALUES(5,'Audi A3 Cabriolet.',2007,2,3,5,2);
INSERT INTO carslist VALUES(6,'Audi A3 Cabriolet.',2005,1,5,2,4);
SELECT * FROM carslist;

describe servicedcars;

INSERT INTO servicedcars VALUES(1,2,6,900);
INSERT INTO servicedcars VALUES(2,3,2,200);
INSERT INTO servicedcars VALUES(3,3,1,800);
INSERT INTO servicedcars VALUES(4,3,5,500);
INSERT INTO servicedcars VALUES(5,2,6,280);



SELECT * FROM person;

UPDATE person SET first_name='gocha' WHERE person_id=4;
UPDATE person SET last_name='arabuli' WHERE person_id=3;
UPDATE person SET first_name='nugzari' WHERE person_id=5;
UPDATE person SET last_name='dimitradze' WHERE person_id=7;
UPDATE person SET first_name='zviadi' WHERE person_id=9;
UPDATE person SET age=38 WHERE person_id=12;
UPDATE person SET first_name='eka' WHERE person_id=2;
UPDATE person SET first_name='karlo' WHERE person_id=4;
UPDATE person SET age=33 WHERE person_id=3;
UPDATE person SET first_name='natia' WHERE person_id=7;
UPDATE person SET first_name='lizi' WHERE person_id=7;
UPDATE person SET last_name='futkaradze' WHERE person_id=14;


SELECT * FROM person;


DELETE FROM person WHERE person_id = 5;
DELETE FROM person WHERE person_id = 4;
DELETE FROM person WHERE person_id = 6;
DELETE FROM person WHERE person_id = 7;
DELETE FROM person WHERE person_id = 8;
DELETE FROM person WHERE first_name='shio';
DELETE FROM person WHERE person_id = 2;
DELETE FROM person WHERE person_id = 53;
DELETE FROM person WHERE last_name='gulia' = 5;
DELETE FROM person WHERE person_id = 9;
DELETE FROM person WHERE person_id = 10;
DELETE FROM person WHERE person_id = 11;
DELETE FROM person WHERE person_id = 12;
DELETE FROM person WHERE person_id = 13;
DELETE FROM person WHERE person_id = 14;
DELETE FROM person WHERE person_id = 15;
DELETE FROM person WHERE person_id = 1;
DELETE FROM person WHERE person_id = 2;
DELETE FROM person WHERE person_id = 3;



ALTER TABLE person ADD COLUMN height INT;
ALTER TABLE person ADD COLUMN weight INT;
describe  person;
ALTER TABLE person DROP COLUMN height ;
ALTER TABLE person DROP COLUMN weight ;
ALTER TABLE person MODIFY first_name VARCHAR(55);

SELECT * FROM person;


INSERT INTO carshops VALUES(1,'volvo',29);
INSERT INTO carshops VALUES(2,'volvo',96);
INSERT INTO carshops VALUES(3,'volvo',65);
select * from carshops;

describe shopemployee;
INSERT INTO shopemployee VALUES(1,2,4,'manager',2,7);
INSERT INTO shopemployee VALUES(2,6,56,'salesman',2,14);
INSERT INTO shopemployee VALUES(4,2,56,'storage_guy',1,12);
INSERT INTO shopemployee VALUES(5,6,19,'salesman',2,13);
INSERT INTO shopemployee VALUES(6,1,5,'storage_guy',1,11);
INSERT INTO shopemployee VALUES(7,4,27,'consultant',2,6);
INSERT INTO shopemployee VALUES(8,3,22,'chief',1,2);
INSERT INTO shopemployee VALUES(9,6,38,'chiefs_firsthand',2,5);
INSERT INTO shopemployee VALUES(10,2,19,'servicer',1,3);
INSERT INTO shopemployee VALUES(11,6,38,'salesman',2,4);
INSERT INTO shopemployee VALUES(12,2,19,'salesman',1,9);
describe carshops;
SELECT * FROM shopemployee;
DELETE  FROM shopemployee; 


SELECT * FROM person INNER JOIN shopemployee 
ON
person.person_id=shopemployee.person_id;



SELECT * FROM person LEFT  JOIN shopemployee 
ON
person.person_id=shopemployee.person_id;



SELECT * FROM person RIGHT JOIN shopemployee 
ON
person.person_id=shopemployee.person_id;


SELECT * FROM person LEFT OUTER JOIN shopemployee 
ON
person.person_id=shopemployee.person_id;


SELECT * FROM person RIGHT OUTER JOIN shopemployee 
ON
person.person_id=shopemployee.person_id;


SELECT position,AVG(sold_cars) FROM shopemployee  GROUP BY position;
SELECT position,SUM(sold_cars) FROM shopemployee  GROUP BY position;
SELECT position,MIN(sold_cars) FROM shopemployee  GROUP BY position;
SELECT position,MAX(sold_cars) FROM shopemployee  GROUP BY position;

SELECT position,AVG(working_experience) FROM shopemployee  GROUP BY position;
SELECT position,SUM(working_experience) FROM shopemployee  GROUP BY position;
SELECT position,MIN(working_experience) FROM shopemployee  GROUP BY position;
SELECT position,MAX(working_experience) FROM shopemployee  GROUP BY position;





SELECT sold_cars,position,AVG(sold_cars) FROM shopemployee  GROUP BY position HAVING shopemployee.sold_cars BETWEEN 11 AND 140;
SELECT sold_cars, position,SUM(sold_cars) FROM shopemployee  GROUP BY position HAVING shopemployee.sold_cars BETWEEN 11 AND 140;
SELECT sold_cars, position,MIN(sold_cars) FROM shopemployee  GROUP BY position HAVING shopemployee.sold_cars BETWEEN 11 AND 140;
SELECT sold_cars,position,MAX(sold_cars) FROM shopemployee  GROUP BY position HAVING shopemployee.sold_cars BETWEEN 11 AND 140;

SELECT working_experience,position,AVG(working_experience) FROM shopemployee  GROUP BY position HAVING working_experience IN(1,2,3,4);
SELECT working_experience,position,SUM(working_experience) FROM shopemployee  GROUP BY position HAVING working_experience IN(1,2,3,4);
SELECT working_experience,position,MIN(working_experience) FROM shopemployee  GROUP BY position HAVING working_experience IN(1,2,3,4);
SELECT working_experience,position,MAX(working_experience) FROM shopemployee  GROUP BY position HAVING working_experience IN(1,2,3,4);

