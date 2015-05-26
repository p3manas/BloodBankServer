spool on;
set echo on;
spool GIVELIFE.log

DROP USER GIVELIFE CASCADE;

create user GIVELIFE identified by GIVELIFE;
grant connect,resource,dba to GIVELIFE;


--------------------------------------------------------
--  DDL for Table USERS
--------------------------------------------------------

  CREATE TABLE "GIVELIFE"."USERS"
   (
	"ACCOUNT_ID" NUMBER(*,0),
	"FIRST_NAME" VARCHAR2(30 BYTE),
	"LAST_NAME" VARCHAR2(30 BYTE),
	"EMAIL" VARCHAR2(30 BYTE),
	"DOB" DATE,
	"BLOOD_GROUP" VARCHAR2(10 BYTE),
	"MOBILE_NO" NUMBER(*,0),
	"COUNTRY" VARCHAR2(30 BYTE),
	"STATE" VARCHAR2(30 BYTE),
	"DISTRICT" VARCHAR2(30 BYTE),
	"CITY" VARCHAR2(30 BYTE),
	"COL1" VARCHAR2(30 BYTE), 
	"COL2" NUMBER(*,0), 
	"COL3" NUMBER(*,0), 
	"COL4" DATE, 
	"COL5" VARCHAR2(30 BYTE), 
	"COL6" VARCHAR2(30 BYTE), 
	"CREATED_ON" DATE, 
	"CREATED_BY" VARCHAR2(30 BYTE), 
	"MODIFIED_ON" DATE, 
	"MODIFIED_BY" VARCHAR2(30 BYTE)
   ) ;
--------------------------------------------------------
--  DDL for Table USER_REQUEST
--------------------------------------------------------

  CREATE TABLE "GIVELIFE"."USER_REQUEST" 
   (	
	"REQ_ID" NUMBER(*,0),
    "ACCOUNT_ID" NUMBER(*,0), 
	"DONOR_ID" NUMBER(*,0),
	"BLOOD_REQ_TYPE" VARCHAR2(30 BYTE),
	"REQ_TIME" DATE, 
	"STATUS" VARCHAR2(30 BYTE)
   ) ;
   
--------------------------------------------------------
--  DDL for Table USER_DONOR
--------------------------------------------------------

  CREATE TABLE "GIVELIFE"."USER_DONOR" 
   (	
	"DONOR_ID" NUMBER(*,0),
    "ACCOUNT_ID" NUMBER(*,0), 
	"DONOR_REQ_TIME" DATE,
	"STATUS" VARCHAR2(30 BYTE),
	"RATING" FLOAT(2)
   ) ;
   
         --------------------------------------------------------
--  DDL for Table HOSPITAL
--------------------------------------------------------

  CREATE TABLE "GIVELIFE"."HOSPITAL" 
   (	
    "HOSPITAL_ID" NUMBER(*,0), 
	"HOSPITAL_NAME" VARCHAR2(30 BYTE), 
	"HOSPITAL_LOC" VARCHAR2(30 BYTE),
	"STATUS" VARCHAR2(30 BYTE), 
	"COUNTRY" VARCHAR2(30 BYTE),
	"STATE" VARCHAR2(30 BYTE),
	"CITY" VARCHAR2(30 BYTE)
   ) ;
   
  






--------------------------------------------------------
--  DDL for Index Unique_Identifier1
--------------------------------------------------------

  CREATE UNIQUE INDEX "GIVELIFE"."Unique_Identifier1" ON "GIVELIFE"."USERS" ("ACCOUNT_ID") ;
 
--------------------------------------------------------
--  Constraints for Table USERS
--------------------------------------------------------

  ALTER TABLE "GIVELIFE"."USERS" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USERS" MODIFY ("CREATED_ON" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USERS" MODIFY ("CREATED_BY" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USERS" ADD CONSTRAINT "Unique_Identifier1" PRIMARY KEY ("ACCOUNT_ID");
	  
	
  --------------------------------------------------------
--  DDL for Index Unique_Identifier1
--------------------------------------------------------

  CREATE UNIQUE INDEX "GIVELIFE"."Unique_Identifier3" ON "GIVELIFE"."USER_DONOR" ("DONOR_ID") ;
  
--------------------------------------------------------
--  Constraints for Table USER_DONOR
--------------------------------------------------------

  ALTER TABLE "GIVELIFE"."USER_DONOR" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USER_DONOR" MODIFY ("DONOR_ID" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USER_DONOR" ADD CONSTRAINT "Unique_Identifier3" PRIMARY KEY ("DONOR_ID") ;
  
--------------------------------------------------------
--  Ref Constraints for Table USER_DONOR
--------------------------------------------------------

  ALTER TABLE "GIVELIFE"."USER_DONOR" ADD CONSTRAINT "IS AUTHENTICATED WITH3" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "GIVELIFE"."USERS" ("ACCOUNT_ID") ENABLE;

	  
--------------------------------------------------------
--  DDL for Index Unique_Identifier1
--------------------------------------------------------

  CREATE UNIQUE INDEX "GIVELIFE"."Unique_Identifier2" ON "GIVELIFE"."USER_REQUEST" ("ACCOUNT_ID","REQ_ID","DONOR_ID") ;
  
  
--------------------------------------------------------
--  Constraints for Table USER_REQUEST
--------------------------------------------------------

  ALTER TABLE "GIVELIFE"."USER_REQUEST" MODIFY ("ACCOUNT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USER_REQUEST" MODIFY ("REQ_ID" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USER_REQUEST" MODIFY ("DONOR_ID" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."USER_REQUEST" ADD CONSTRAINT "Unique_Identifier2" PRIMARY KEY ("ACCOUNT_ID","REQ_ID","DONOR_ID") ;
  
  --------------------------------------------------------
--  Ref Constraints for Table USER_REQUEST
--------------------------------------------------------

    ALTER TABLE "GIVELIFE"."USER_REQUEST" ADD CONSTRAINT "IS AUTHENTICATED WITH" FOREIGN KEY ("ACCOUNT_ID")
	  REFERENCES "GIVELIFE"."USERS" ("ACCOUNT_ID") ENABLE;
	 
    ALTER TABLE "GIVELIFE"."USER_REQUEST" ADD CONSTRAINT "IS AUTHENTICATED WITH2" FOREIGN KEY ("DONOR_ID")
	  REFERENCES "GIVELIFE"."USER_DONOR" ("DONOR_ID") ENABLE;
	  
  
--------------------------------------------------------
--  DDL for Index Unique_Identifier4
--------------------------------------------------------

  CREATE UNIQUE INDEX "GIVELIFE"."Unique_Identifier4" ON "GIVELIFE"."HOSPITAL" ("HOSPITAL_ID") ;
  
--------------------------------------------------------
--  Constraints for Table HOSPITAL
--------------------------------------------------------
 
  ALTER TABLE "GIVELIFE"."HOSPITAL" MODIFY ("HOSPITAL_ID" NOT NULL ENABLE);
 
  ALTER TABLE "GIVELIFE"."HOSPITAL" ADD CONSTRAINT "Unique_Identifier4" PRIMARY KEY ("HOSPITAL_ID");  


 
  spool off;
	  
