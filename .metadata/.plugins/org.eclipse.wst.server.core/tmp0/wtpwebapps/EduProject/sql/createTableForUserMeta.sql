--this query will create MS_USER_META table.
  CREATE TABLE "UDAY KUMAR SWAMY"."MS_USER_META" 
   (	"USER_ID" NUMBER NOT NULL ENABLE, 
	"USER_NAME" VARCHAR2(50 BYTE) NOT NULL ENABLE, 
	"USER_MAIL_ID" VARCHAR2(50 BYTE), 
	"ACCESS_TYPE" NUMBER, 
	"PASSWORD" VARCHAR2(20 BYTE) NOT NULL ENABLE, 
	"LAST_LOGIN" VARCHAR2(20 BYTE), 
	 CONSTRAINT "MODALSCHOOL_USER_META_PK" PRIMARY KEY ("USER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
