/*
Below scripts not required to execute as they table will be created automatically when application runs.
For referene only...
CREATE TABLE "CUSTOMER" (
	"CIF" varchar(50) NOT NULL,
	"NAME" varchar(50) NOT NULL,
	"DOB" date NULL,
	"ONBOARDINGDATE" date NULL,
	"PHONE" varchar(20) NULL);
	
CREATE TABLE "BANKACCOUNT" (
	"ACCNO" varchar(50) NOT NULL,
	"OPENINGDATE" date NOT NULL,
	"BALANCE" float8 NULL,
	"STATUS" int4 NULL,
	"CIF" varchar(50) NULL);	
	
CREATE TABLE "TRANSACTION" (
	"TRANID" varchar(100) NOT NULL,
	"AMT" float8 NULL,
	"TIME" date NULL,
	"STATUS" int4 NULL,
	"CURRENCY" varchar NULL,
	"CIF" varchar(50) NOT NULL,
	"ACCNO" varchar(50) NULL);
*/



INSERT INTO CUSTOMER VALUES('21234567892','1990-12-12','Raj','2020-08-08','0172295472');

INSERT INTO BANK_ACCOUNT VALUES('756253536','1000','2020-08-08',1,'21234567892');

INSERT INTO TRANSACTION VALUES('112365742','100','MYR',1,'2020-08-08 12:12:12','756253536');





