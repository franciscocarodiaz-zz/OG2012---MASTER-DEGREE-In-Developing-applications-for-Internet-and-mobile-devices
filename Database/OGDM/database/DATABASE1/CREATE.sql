SET SQLBLANKLINES ON
CREATE TABLE OG_ACTION 
(
  OG_ACTION_ID NUMBER NOT NULL 
, ACTION VARCHAR2(20) 
, CONSTRAINT OG_ACTION_PK PRIMARY KEY 
  (
    OG_ACTION_ID 
  )
  ENABLE 
);

CREATE TABLE OG_CATEGORY 
(
  OG_CATEGORY_ID NUMBER NOT NULL 
, CATEGORY VARCHAR2(20) 
, CONSTRAINT OG_CATEGORY_PK PRIMARY KEY 
  (
    OG_CATEGORY_ID 
  )
  ENABLE 
);

CREATE TABLE OG_CATEGORY_REFEREE 
(
  OG_CATEGORY_REFEREE_ID NUMBER NOT NULL 
, CATEGORY_REFEREE VARCHAR2(20) 
, CONSTRAINT OG_CATEGORY_REFEREE_PK PRIMARY KEY 
  (
    OG_CATEGORY_REFEREE_ID 
  )
  ENABLE 
);

CREATE TABLE OG_COLOUR 
(
  OG_COLOUR_ID NUMBER NOT NULL 
, COLOUR VARCHAR2(20) 
, CONSTRAINT OG_COLOUR_PK PRIMARY KEY 
  (
    OG_COLOUR_ID 
  )
  ENABLE 
);

CREATE TABLE OG_GENDER 
(
  OG_GENDER_ID NUMBER NOT NULL 
, GENDER VARCHAR2(20) 
, CONSTRAINT OG_GENDER_PK PRIMARY KEY 
  (
    OG_GENDER_ID 
  )
  ENABLE 
);

CREATE TABLE OG_GROUP 
(
  OG_GROUP_ID NUMBER NOT NULL 
, GROUPNAME VARCHAR2(20) 
, OG_TEAM_ID VARCHAR2(20) 
, OG_TEAM_ID1 VARCHAR2(20) 
, OG_TEAM_ID2 VARCHAR2(20) 
, OG_TEAM_ID3 VARCHAR2(20) 
, CONSTRAINT OG_GROUP_PK PRIMARY KEY 
  (
    OG_GROUP_ID 
  )
  ENABLE 
);

CREATE TABLE OG_MATCH 
(
  OG_MATCH_ID NUMBER NOT NULL 
, STARTDATE VARCHAR2(20) 
, ENDDATE VARCHAR2(20) 
, WINNER VARCHAR2(20) 
, OG_MEDAL_ID NUMBER NOT NULL 
, OG_PHASE_ID NUMBER NOT NULL 
, REFEREE1 NUMBER 
, OG_STADIUM_ID NUMBER NOT NULL 
, OG_STATUS_ID NUMBER NOT NULL 
, OG_TEAM_ID NUMBER NOT NULL 
, OG_TEAM_ID1 NUMBER NOT NULL 
, CONSTRAINT OG_MATCH_PK PRIMARY KEY 
  (
    OG_MATCH_ID 
  )
  ENABLE 
);

CREATE TABLE OG_MEDAL 
(
  OG_MEDAL_ID NUMBER NOT NULL 
, MEDAL VARCHAR2(20) 
, CONSTRAINT OG_MEDAL_PK PRIMARY KEY 
  (
    OG_MEDAL_ID 
  )
  ENABLE 
);

CREATE TABLE OG_MEDAL_STANDING 
(
  OG_MEDAL_STANDING_ID NUMBER NOT NULL 
, ID_NATIONALITY VARCHAR2(20) 
, GOLD VARCHAR2(20) 
, SILVER VARCHAR2(20) 
, BRONZE VARCHAR2(20) 
, OG_NATIONALITY_ID NUMBER NOT NULL 
, CONSTRAINT OG_MEDAL_STANDING_PK PRIMARY KEY 
  (
    OG_MEDAL_STANDING_ID 
  )
  ENABLE 
);

CREATE TABLE OG_NATIONALITY 
(
  OG_NATIONALITY_ID NUMBER NOT NULL 
, NATIONALITY VARCHAR2(20) 
, CONSTRAINT OG_NATIONALITY_PK PRIMARY KEY 
  (
    OG_NATIONALITY_ID 
  )
  ENABLE 
);

CREATE TABLE OG_NEW 
(
  OG_NEW_ID NUMBER NOT NULL 
, TITLE VARCHAR2(20) 
, HEADER VARCHAR2(20) 
, CONTENT VARCHAR2(20) 
, DATE_HOUR VARCHAR2(20) 
, IMG VARCHAR2(20) 
, CONSTRAINT OG_NEW_PK PRIMARY KEY 
  (
    OG_NEW_ID 
  )
  ENABLE 
);

CREATE TABLE OG_NEW_NOC 
(
  OG_NEW_NOC_ID NUMBER NOT NULL 
, OG_NEW_ID NUMBER NOT NULL 
, OG_NOC_ID NUMBER NOT NULL 
, CONSTRAINT OG_NEW_NOC_PK PRIMARY KEY 
  (
    OG_NEW_NOC_ID 
  )
  ENABLE 
);

CREATE TABLE OG_NOC 
(
  OG_NOC_ID NUMBER NOT NULL 
, NOC VARCHAR2(20) 
, CONSTRAINT OG_NOC_PK PRIMARY KEY 
  (
    OG_NOC_ID 
  )
  ENABLE 
);

CREATE TABLE OG_PARTICIPANT 
(
  OG_PARTICIPANT_ID NUMBER NOT NULL 
, NAME VARCHAR2(20) 
, SURNAME VARCHAR2(20) 
, BIRTHDATE DATE 
, WEIGHT VARCHAR2(20) 
, HEIGHT VARCHAR2(20) 
, PERSON VARCHAR2(20) 
, OG_GENDER_ID NUMBER NOT NULL 
, OG_NATIONALITY_ID NUMBER NOT NULL 
, OG_NOC_ID NUMBER NOT NULL 
, OG_ROLE_ID NUMBER NOT NULL 
, CONSTRAINT OG_PARTICIPANT_PK PRIMARY KEY 
  (
    OG_PARTICIPANT_ID 
  )
  ENABLE 
);

CREATE TABLE OG_PERSON 
(
  OG_PERSON_ID NUMBER NOT NULL 
, NAME VARCHAR2(20) 
, SURNAME VARCHAR2(20) 
, BIRTHDATE DATE 
, OG_GENDER_ID NUMBER NOT NULL 
, OG_NATIONALITY_ID NUMBER NOT NULL 
, OG_NOC_ID NUMBER NOT NULL 
, CONSTRAINT OG_PERSON_PK PRIMARY KEY 
  (
    OG_PERSON_ID 
  )
  ENABLE 
);

CREATE TABLE OG_PHASE 
(
  OG_PHASE_ID NUMBER NOT NULL 
, PHASE VARCHAR2(20) 
, CONSTRAINT OG_PHASE_PK PRIMARY KEY 
  (
    OG_PHASE_ID 
  )
  ENABLE 
);

CREATE TABLE OG_REFEREE 
(
  OG_REFEREE_ID NUMBER NOT NULL 
, NAME VARCHAR2(20) 
, SURNAME VARCHAR2(20) 
, BIRTHDATE DATE 
, OG_GENDER_ID NUMBER NOT NULL 
, OG_NATIONALITY_ID NUMBER NOT NULL 
, OG_NOC_ID NUMBER NOT NULL 
, OG_CATEGORY_REFEREE_ID NUMBER NOT NULL 
, CONSTRAINT OG_REFEREE_PK PRIMARY KEY 
  (
    OG_REFEREE_ID 
  )
  ENABLE 
);

CREATE TABLE OG_RESULT 
(
  OG_RESULT_ID NUMBER NOT NULL 
, HOME_TEAM VARCHAR2(20) 
, AWAY_TEAM VARCHAR2(20) 
, RES1_HOME VARCHAR2(20) 
, RES1_AWAY VARCHAR2(20) 
, RES2_HOME VARCHAR2(20) 
, RES2_AWAY VARCHAR2(20) 
, RES_ET1_HOME VARCHAR2(20) 
, RES_ET1_AWAY VARCHAR2(20) 
, RES_ET2_HOME VARCHAR2(20) 
, RES_ET2_AWAY VARCHAR2(20) 
, RES_TOTAL_HOME VARCHAR2(20) 
, RES_TOTAL_AWAY VARCHAR2(20) 
, RES_PEN_HOME VARCHAR2(20) 
, RES_PEN_AWAY VARCHAR2(20) 
, OG_MATCH_ID NUMBER NOT NULL 
, CONSTRAINT OG_RESULT_PK PRIMARY KEY 
  (
    OG_RESULT_ID 
  )
  ENABLE 
);

CREATE TABLE OG_ROLE 
(
  OG_ROLE_ID NUMBER NOT NULL 
, ROLE VARCHAR2(20) 
, CONSTRAINT OG_ROLE_PK PRIMARY KEY 
  (
    OG_ROLE_ID 
  )
  ENABLE 
);

CREATE TABLE OG_STADIUM 
(
  OG_STADIUM_ID NUMBER NOT NULL 
, NAME VARCHAR2(20) 
, CAPACITY VARCHAR2(20) 
, CONSTRAINT OG_STADIUM_PK PRIMARY KEY 
  (
    OG_STADIUM_ID 
  )
  ENABLE 
);

CREATE TABLE OG_STATISTIC_PARTICIPANT 
(
  OG_STATISTIC_PARTICIPANT_ID NUMBER NOT NULL 
, PJ VARCHAR2(20) 
, TIT VARCHAR2(20) 
, MJUG VARCHAR2(20) 
, G VARCHAR2(20) 
, ASIST VARCHAR2(20) 
, FC VARCHAR2(20) 
, FS VARCHAR2(20) 
, OG_PARTICIPANT_ID NUMBER NOT NULL 
, CONSTRAINT OG_STATISTIC_PARTICIPANT_PK PRIMARY KEY 
  (
    OG_STATISTIC_PARTICIPANT_ID 
  )
  ENABLE 
);

CREATE TABLE OG_STATISTIC_TEAM 
(
  OG_STATISTIC_TEAM_ID NUMBER NOT NULL 
, NMATCH VARCHAR2(20) 
, NMATCH_WINS VARCHAR2(20) 
, NMATCH_EQ VARCHAR2(20) 
, GF VARCHAR2(20) 
, GC VARCHAR2(20) 
, OG_TEAM_ID NUMBER NOT NULL 
, CONSTRAINT OG_STATISTIC_TEAM_PK PRIMARY KEY 
  (
    OG_STATISTIC_TEAM_ID 
  )
  ENABLE 
);

CREATE TABLE OG_STATUS 
(
  OG_STATUS_ID NUMBER NOT NULL 
, STATUS VARCHAR2(20) 
, CONSTRAINT OG_STATUS_PK PRIMARY KEY 
  (
    OG_STATUS_ID 
  )
  ENABLE 
);

CREATE TABLE OG_STAT_MATCH_PARTIC 
(
  OG_STAT_MATCH_PARTIC_ID NUMBER NOT NULL 
, MATCH VARCHAR2(20) 
, MINUTE VARCHAR2(20) 
, OG_ACTION_ID NUMBER NOT NULL 
, OG_MATCH_ID NUMBER NOT NULL 
, OG_PARTICIPANT_ID NUMBER NOT NULL 
, OG_TEAM_ID NUMBER NOT NULL 
, CONSTRAINT OG_STAT_MATCH_PARTIC_PK PRIMARY KEY 
  (
    OG_STAT_MATCH_PARTIC_ID 
  )
  ENABLE 
);

CREATE TABLE OG_TEAM 
(
  OG_TEAM_ID NUMBER NOT NULL 
, ID_GROUP NUMBER NOT NULL 
, OG_COLOUR_ID_HOME NUMBER NOT NULL 
, OG_GENDER_ID NUMBER NOT NULL 
, OG_COLOUR_ID_AWAY NUMBER NOT NULL 
, OG_NATIONALITY_ID NUMBER NOT NULL 
, OG_NOC_ID NUMBER NOT NULL 
, CONSTRAINT OG_TEAM_PK PRIMARY KEY 
  (
    OG_TEAM_ID 
  )
  ENABLE 
);

CREATE TABLE OG_TEAM_PARTIC 
(
  DORSAL NUMBER(2) NOT NULL 
, OG_PARTICIPANT_ID NUMBER NOT NULL 
, OG_TEAM_ID NUMBER NOT NULL 
, CONSTRAINT OG_TEAM_PARTIC_PK PRIMARY KEY 
  (
    DORSAL 
  , OG_PARTICIPANT_ID 
  , OG_TEAM_ID 
  )
  ENABLE 
);

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_UK_MEDAL UNIQUE 
(
  OG_MEDAL_ID 
)
ENABLE;

ALTER TABLE OG_MEDAL_STANDING
ADD CONSTRAINT OG_MEDAL_STANDING_UK_NAT UNIQUE 
(
  OG_NATIONALITY_ID 
)
ENABLE;

ALTER TABLE OG_RESULT
ADD CONSTRAINT OG_RESULT_UK_MATCH UNIQUE 
(
  OG_MATCH_ID 
)
USING INDEX 
(
    CREATE UNIQUE INDEX OG_RESULT_UK_RESULT ON OG_RESULT (OG_MATCH_ID ASC) 
)
 ENABLE;

ALTER TABLE OG_STATISTIC_PARTICIPANT
ADD CONSTRAINT OG_STATISTIC_PARTICIPANT_UK UNIQUE 
(
  OG_PARTICIPANT_ID 
)
ENABLE;

ALTER TABLE OG_STATISTIC_TEAM
ADD CONSTRAINT OG_STATISTIC_TEAM_UK_TEAM UNIQUE 
(
  OG_TEAM_ID 
)
ENABLE;

ALTER TABLE OG_TEAM_PARTIC
ADD CONSTRAINT OG_TEAM_PARTIC_UK_PARTIC UNIQUE 
(
  OG_PARTICIPANT_ID 
)
ENABLE;

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_MEDAL FOREIGN KEY
(
  OG_MEDAL_ID 
)
REFERENCES OG_MEDAL
(
  OG_MEDAL_ID 
)
ENABLE;

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_PHASE FOREIGN KEY
(
  OG_PHASE_ID 
)
REFERENCES OG_PHASE
(
  OG_PHASE_ID 
)
ENABLE;

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_REFEREE FOREIGN KEY
(
  REFEREE1 
)
REFERENCES OG_REFEREE
(
  OG_REFEREE_ID 
)
ENABLE;

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_STADIUM FOREIGN KEY
(
  OG_STADIUM_ID 
)
REFERENCES OG_STADIUM
(
  OG_STADIUM_ID 
)
ENABLE;

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_STATUS FOREIGN KEY
(
  OG_STATUS_ID 
)
REFERENCES OG_STATUS
(
  OG_STATUS_ID 
)
ENABLE;

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_TEAM1 FOREIGN KEY
(
  OG_TEAM_ID 
)
REFERENCES OG_TEAM
(
  OG_TEAM_ID 
)
ENABLE;

ALTER TABLE OG_MATCH
ADD CONSTRAINT OG_MATCH_TEAM2 FOREIGN KEY
(
  OG_TEAM_ID1 
)
REFERENCES OG_TEAM
(
  OG_TEAM_ID 
)
ENABLE;

ALTER TABLE OG_MEDAL_STANDING
ADD CONSTRAINT OG_MEDAL_STANDING_NATIONALITY FOREIGN KEY
(
  OG_NATIONALITY_ID 
)
REFERENCES OG_NATIONALITY
(
  OG_NATIONALITY_ID 
)
ENABLE;

ALTER TABLE OG_NEW_NOC
ADD CONSTRAINT OG_NEW_NOC_NEW FOREIGN KEY
(
  OG_NEW_ID 
)
REFERENCES OG_NEW
(
  OG_NEW_ID 
)
ENABLE;

ALTER TABLE OG_NEW_NOC
ADD CONSTRAINT OG_NEW_NOC_NOC FOREIGN KEY
(
  OG_NOC_ID 
)
REFERENCES OG_NOC
(
  OG_NOC_ID 
)
ENABLE;

ALTER TABLE OG_PARTICIPANT
ADD CONSTRAINT OG_PARTICIPANT_FK_PERSON FOREIGN KEY
(
  OG_PARTICIPANT_ID 
)
REFERENCES OG_PERSON
(
  OG_PERSON_ID 
)
ON DELETE SET NULL ENABLE;

ALTER TABLE OG_PARTICIPANT
ADD CONSTRAINT OG_PARTICIPANT_ROLE FOREIGN KEY
(
  OG_ROLE_ID 
)
REFERENCES OG_ROLE
(
  OG_ROLE_ID 
)
ENABLE;

ALTER TABLE OG_PARTICIPANT
ADD CONSTRAINT OG_PERSON_GENDER FOREIGN KEY
(
  OG_GENDER_ID 
)
REFERENCES OG_GENDER
(
  OG_GENDER_ID 
)
ENABLE;

ALTER TABLE OG_PARTICIPANT
ADD CONSTRAINT OG_PERSON_NATIONALITY FOREIGN KEY
(
  OG_NATIONALITY_ID 
)
REFERENCES OG_NATIONALITY
(
  OG_NATIONALITY_ID 
)
ENABLE;

ALTER TABLE OG_PARTICIPANT
ADD CONSTRAINT OG_PERSON_NOC FOREIGN KEY
(
  OG_NOC_ID 
)
REFERENCES OG_NOC
(
  OG_NOC_ID 
)
ENABLE;

ALTER TABLE OG_PERSON
ADD CONSTRAINT OG_PERSON_GENDER FOREIGN KEY
(
  OG_GENDER_ID 
)
REFERENCES OG_GENDER
(
  OG_GENDER_ID 
)
ENABLE;

ALTER TABLE OG_PERSON
ADD CONSTRAINT OG_PERSON_NATIONALITY FOREIGN KEY
(
  OG_NATIONALITY_ID 
)
REFERENCES OG_NATIONALITY
(
  OG_NATIONALITY_ID 
)
ENABLE;

ALTER TABLE OG_PERSON
ADD CONSTRAINT OG_PERSON_NOC FOREIGN KEY
(
  OG_NOC_ID 
)
REFERENCES OG_NOC
(
  OG_NOC_ID 
)
ENABLE;

ALTER TABLE OG_REFEREE
ADD CONSTRAINT OG_PERSON_GENDER FOREIGN KEY
(
  OG_GENDER_ID 
)
REFERENCES OG_GENDER
(
  OG_GENDER_ID 
)
ENABLE;

ALTER TABLE OG_REFEREE
ADD CONSTRAINT OG_PERSON_NATIONALITY FOREIGN KEY
(
  OG_NATIONALITY_ID 
)
REFERENCES OG_NATIONALITY
(
  OG_NATIONALITY_ID 
)
ENABLE;

ALTER TABLE OG_REFEREE
ADD CONSTRAINT OG_PERSON_NOC FOREIGN KEY
(
  OG_NOC_ID 
)
REFERENCES OG_NOC
(
  OG_NOC_ID 
)
ENABLE;

ALTER TABLE OG_REFEREE
ADD CONSTRAINT OG_REFEREE_CATEGORY_REFEREE FOREIGN KEY
(
  OG_CATEGORY_REFEREE_ID 
)
REFERENCES OG_CATEGORY_REFEREE
(
  OG_CATEGORY_REFEREE_ID 
)
ENABLE;

ALTER TABLE OG_REFEREE
ADD CONSTRAINT OG_REFEREE_FK_PERSON FOREIGN KEY
(
  OG_REFEREE_ID 
)
REFERENCES OG_PERSON
(
  OG_PERSON_ID 
)
ON DELETE SET NULL ENABLE;

ALTER TABLE OG_RESULT
ADD CONSTRAINT OG_RESULT_MATCH FOREIGN KEY
(
  OG_MATCH_ID 
)
REFERENCES OG_MATCH
(
  OG_MATCH_ID 
)
ENABLE;

ALTER TABLE OG_STATISTIC_PARTICIPANT
ADD CONSTRAINT OG_STATISTIC_PARTIC_PARTIC FOREIGN KEY
(
  OG_PARTICIPANT_ID 
)
REFERENCES OG_PARTICIPANT
(
  OG_PARTICIPANT_ID 
)
ENABLE;

ALTER TABLE OG_STATISTIC_TEAM
ADD CONSTRAINT OG_STATISTIC_TEAM_TEAM FOREIGN KEY
(
  OG_TEAM_ID 
)
REFERENCES OG_TEAM
(
  OG_TEAM_ID 
)
ENABLE;

ALTER TABLE OG_STAT_MATCH_PARTIC
ADD CONSTRAINT OG_MATCH_TEAM_ACTION FOREIGN KEY
(
  OG_ACTION_ID 
)
REFERENCES OG_ACTION
(
  OG_ACTION_ID 
)
ENABLE;

ALTER TABLE OG_STAT_MATCH_PARTIC
ADD CONSTRAINT OG_MATCH_TEAM_MATCH FOREIGN KEY
(
  OG_MATCH_ID 
)
REFERENCES OG_MATCH
(
  OG_MATCH_ID 
)
ENABLE;

ALTER TABLE OG_STAT_MATCH_PARTIC
ADD CONSTRAINT OG_MATCH_TEAM_PARTICIPANT FOREIGN KEY
(
  OG_PARTICIPANT_ID 
)
REFERENCES OG_PARTICIPANT
(
  OG_PARTICIPANT_ID 
)
ENABLE;

ALTER TABLE OG_STAT_MATCH_PARTIC
ADD CONSTRAINT OG_MATCH_TEAM_TEAM FOREIGN KEY
(
  OG_TEAM_ID 
)
REFERENCES OG_TEAM
(
  OG_TEAM_ID 
)
ENABLE;

ALTER TABLE OG_TEAM
ADD CONSTRAINT OG_TEAM_AWAY_COLOUR FOREIGN KEY
(
  OG_COLOUR_ID_HOME 
)
REFERENCES OG_COLOUR
(
  OG_COLOUR_ID 
)
ENABLE;

ALTER TABLE OG_TEAM
ADD CONSTRAINT OG_TEAM_GENDER FOREIGN KEY
(
  OG_GENDER_ID 
)
REFERENCES OG_GENDER
(
  OG_GENDER_ID 
)
ENABLE;

ALTER TABLE OG_TEAM
ADD CONSTRAINT OG_TEAM_GROUP FOREIGN KEY
(
  ID_GROUP 
)
REFERENCES OG_GROUP
(
  OG_GROUP_ID 
)
ENABLE;

ALTER TABLE OG_TEAM
ADD CONSTRAINT OG_TEAM_HOME_COLOUR FOREIGN KEY
(
  OG_COLOUR_ID_AWAY 
)
REFERENCES OG_COLOUR
(
  OG_COLOUR_ID 
)
ENABLE;

ALTER TABLE OG_TEAM
ADD CONSTRAINT OG_TEAM_NATIONALITY FOREIGN KEY
(
  OG_NATIONALITY_ID 
)
REFERENCES OG_NATIONALITY
(
  OG_NATIONALITY_ID 
)
ENABLE;

ALTER TABLE OG_TEAM
ADD CONSTRAINT OG_TEAM_NOC FOREIGN KEY
(
  OG_NOC_ID 
)
REFERENCES OG_NOC
(
  OG_NOC_ID 
)
ENABLE;

ALTER TABLE OG_TEAM_PARTIC
ADD CONSTRAINT OG_TEAM_PARTIC_PARTIC FOREIGN KEY
(
  OG_PARTICIPANT_ID 
)
REFERENCES OG_PARTICIPANT
(
  OG_PARTICIPANT_ID 
)
ENABLE;

ALTER TABLE OG_TEAM_PARTIC
ADD CONSTRAINT OG_TEAM_PARTIC_TEAM FOREIGN KEY
(
  OG_TEAM_ID 
)
REFERENCES OG_TEAM
(
  OG_TEAM_ID 
)
ENABLE;

COMMENT ON TABLE OG_ACTION IS 'UML to Offline Database Transform: Table OG_ACTION created from UML class "OgAction"
Primary key constraint OG_ACTION_PK created by default';

COMMENT ON TABLE OG_CATEGORY IS 'UML to Offline Database Transform: Table OG_CATEGORY created from UML class "OgCategory"
Primary key constraint OG_CATEGORY_PK created by default';

COMMENT ON TABLE OG_CATEGORY_REFEREE IS 'UML to Offline Database Transform: Table OG_CATEGORY_REFEREE created from UML class "OgCategoryReferee"
Primary key constraint OG_CATEGORY_REFEREE_PK created by default';

COMMENT ON TABLE OG_COLOUR IS 'UML to Offline Database Transform: Table OG_COLOUR created from UML class "OgColour"
Primary key constraint OG_COLOUR_PK created by default';

COMMENT ON TABLE OG_GENDER IS 'UML to Offline Database Transform: Table OG_GENDER created from UML class "OgGender"
Primary key constraint OG_GENDER_PK created by default';

COMMENT ON TABLE OG_GROUP IS 'UML to Offline Database Transform: Table OG_GROUP created from UML class "OgGroup"
Primary key constraint OG_GROUP_PK created by default
Foreign key constraint OG_GROUP_TEAM1 created for UML association "OgGroupTeam1"
Foreign key constraint OG_GROUP_TEAM2 created for UML association "OgGroupTeam2"
Foreign key constraint OG_GROUP_TEAM3 created for UML association "OgGroupTeam3"
Foreign key constraint OG_GROUP_TEAM4 created for UML association "OgGroupTeam4"';

COMMENT ON TABLE OG_MATCH IS 'UML to Offline Database Transform: Table OG_MATCH created from UML class "OgMatch"
Primary key constraint OG_MATCH_PK created by default
Foreign key constraint OG_MATCH_MEDAL created for UML association "OgMatchMedal"
Foreign key constraint OG_MATCH_PHASE created for UML association "OgMatchPhase"
Foreign key constraint OG_MATCH_REFEREE created for UML association "OgMatchReferee"
Foreign key constraint OG_MATCH_STADIUM created for UML association "OgMatchStadium"
Foreign key constraint OG_MATCH_STATUS created for UML association "OgMatchStatus"
Foreign key constraint OG_MATCH_TEAM1 created for UML association "OgMatchTeam1"
Foreign key constraint OG_MATCH_TEAM2 created for UML association "OgMatchTeam2"';

COMMENT ON TABLE OG_MEDAL IS 'UML to Offline Database Transform: Table OG_MEDAL created from UML class "OgMedal"
Primary key constraint OG_MEDAL_PK created by default';

COMMENT ON TABLE OG_MEDAL_STANDING IS 'UML to Offline Database Transform: Table OG_MEDAL_STANDING created from UML class "OgMedalStanding"
Primary key constraint OG_MEDAL_STANDING_PK created by default
Foreign key constraint OG_MEDAL_STANDING_NATIONALITY created for UML association "OgMedalStandingNationality"';

COMMENT ON TABLE OG_NATIONALITY IS 'UML to Offline Database Transform: Table OG_NATIONALITY created from UML class "OgNationality"
Primary key constraint OG_NATIONALITY_PK created by default';

COMMENT ON TABLE OG_NEW IS 'UML to Offline Database Transform: Table OG_NEW created from UML class "OgNew"
Primary key constraint OG_NEW_PK created by default';

COMMENT ON TABLE OG_NEW_NOC IS 'UML to Offline Database Transform: Table OG_NEW_NOC created from UML class "OgNewNoc"
Primary key constraint OG_NEW_NOC_PK created by default
Foreign key constraint OG_NEW_NOC_NEW created for UML association "OgNewNocNew"
Foreign key constraint OG_NEW_NOC_NOC created for UML association "OgNewNocNoc"';

COMMENT ON TABLE OG_NOC IS 'UML to Offline Database Transform: Table OG_NOC created from UML class "OgNoc"
Primary key constraint OG_NOC_PK created by default';

COMMENT ON TABLE OG_PARTICIPANT IS 'UML to Offline Database Transform: Table OG_PARTICIPANT created from UML class "OgParticipant"
Primary key constraint OG_PARTICIPANT_PK created by default
Foreign key constraint OG_PERSON_GENDER created for UML association "OgPersonGender"
Foreign key constraint OG_PERSON_NATIONALITY created for UML association "OgPersonNationality"
Foreign key constraint OG_PERSON_NOC created for UML association "OgPersonNoc"
Foreign key constraint OG_PARTICIPANT_ROLE created for UML association "OgParticipantRole"';

COMMENT ON TABLE OG_PERSON IS 'UML to Offline Database Transform: Table OG_PERSON created from UML class "OgPerson"
Primary key constraint OG_PERSON_PK created by default
Foreign key constraint OG_PERSON_GENDER created for UML association "OgPersonGender"
Foreign key constraint OG_PERSON_NATIONALITY created for UML association "OgPersonNationality"
Foreign key constraint OG_PERSON_NOC created for UML association "OgPersonNoc"';

COMMENT ON TABLE OG_PHASE IS 'UML to Offline Database Transform: Table OG_PHASE created from UML class "OgPhase"
Primary key constraint OG_PHASE_PK created by default';

COMMENT ON TABLE OG_REFEREE IS 'UML to Offline Database Transform: Table OG_REFEREE created from UML class "OgReferee"
Primary key constraint OG_REFEREE_PK created by default
Foreign key constraint OG_PERSON_GENDER created for UML association "OgPersonGender"
Foreign key constraint OG_PERSON_NATIONALITY created for UML association "OgPersonNationality"
Foreign key constraint OG_PERSON_NOC created for UML association "OgPersonNoc"
Foreign key constraint OG_REFEREE_CATEGORY_REFEREE created for UML association "OgRefereeCategoryReferee"';

COMMENT ON TABLE OG_RESULT IS 'UML to Offline Database Transform: Table OG_RESULT created from UML class "OgResult"
Primary key constraint OG_RESULT_PK created by default
Foreign key constraint OG_RESULT_MATCH created for UML association "OgResultMatch"';

COMMENT ON TABLE OG_ROLE IS 'UML to Offline Database Transform: Table OG_ROLE created from UML class "OgRole"
Primary key constraint OG_ROLE_PK created by default';

COMMENT ON TABLE OG_STADIUM IS 'UML to Offline Database Transform: Table OG_STADIUM created from UML class "OgStadium"
Primary key constraint OG_STADIUM_PK created by default';

COMMENT ON TABLE OG_STATISTIC_PARTICIPANT IS 'UML to Offline Database Transform: Table OG_STATISTIC_PARTICIPANT created from UML class "OgStatisticParticipant"
Primary key constraint OG_STATISTIC_PARTICIPANT_PK created by default
Foreign key constraint OG_STATISTIC_PARTIC_PARTIC created for UML association "OgStatisticParticPartic"';

COMMENT ON TABLE OG_STATISTIC_TEAM IS 'UML to Offline Database Transform: Table OG_STATISTIC_TEAM created from UML class "OgStatisticTeam"
Primary key constraint OG_STATISTIC_TEAM_PK created by default
Foreign key constraint OG_STATISTIC_TEAM_TEAM created for UML association "OgStatisticTeamTeam"';

COMMENT ON TABLE OG_STATUS IS 'UML to Offline Database Transform: Table OG_STATUS created from UML class "OgStatus"
Primary key constraint OG_STATUS_PK created by default';

COMMENT ON TABLE OG_STAT_MATCH_PARTIC IS 'UML to Offline Database Transform: Table OG_STAT_MATCH_PARTIC created from UML class "OgStatMatchPartic"
Primary key constraint OG_STAT_MATCH_PARTIC_PK created by default
Foreign key constraint OG_MATCH_TEAM_ACTION created for UML association "OgMatchTeamAction"
Foreign key constraint OG_MATCH_TEAM_MATCH created for UML association "OgMatchTeamMatch"
Foreign key constraint OG_MATCH_TEAM_PARTICIPANT created for UML association "OgMatchTeamParticipant"
Foreign key constraint OG_MATCH_TEAM_TEAM created for UML association "OgMatchTeamTeam"';

COMMENT ON TABLE OG_TEAM IS 'UML to Offline Database Transform: Table OG_TEAM created from UML class "OgTeam"
Primary key constraint OG_TEAM_PK created by default
Foreign key constraint OG_TEAM_AWAY_COLOUR created for UML association "OgTeamAwayColour"
Foreign key constraint OG_TEAM_GENDER created for UML association "OgTeamGender"
Foreign key constraint OG_TEAM_HOME_COLOUR created for UML association "OgTeamHomeColour"
Foreign key constraint OG_TEAM_NATIONALITY created for UML association "OgTeamNationality"
Foreign key constraint OG_TEAM_NOC created for UML association "OgTeamNoc"';

COMMENT ON TABLE OG_TEAM_PARTIC IS 'UML to Offline Database Transform: Table OG_TEAM_PARTIC created from UML class "OgTeamPartic"
Primary key constraint OG_TEAM_PARTIC_PK created by default
Foreign key constraint OG_TEAM_PARTIC_PARTIC created for UML association "OgTeamParticPartic"
Foreign key constraint OG_TEAM_PARTIC_TEAM created for UML association "OgTeamParticTeam"';

COMMENT ON COLUMN OG_ACTION.OG_ACTION_ID IS 'UML to Offline Database Transform: Column OG_ACTION_ID created as default primary key column';

COMMENT ON COLUMN OG_ACTION.ACTION IS 'UML to Offline Database Transform: Column ACTION created from UML attribute "action" in UML class "OgAction"';

COMMENT ON COLUMN OG_CATEGORY.OG_CATEGORY_ID IS 'UML to Offline Database Transform: Column OG_CATEGORY_ID created as default primary key column';

COMMENT ON COLUMN OG_CATEGORY.CATEGORY IS 'UML to Offline Database Transform: Column CATEGORY created from UML attribute "category" in UML class "OgCategory"';

COMMENT ON COLUMN OG_CATEGORY_REFEREE.OG_CATEGORY_REFEREE_ID IS 'UML to Offline Database Transform: Column OG_CATEGORY_REFEREE_ID created as default primary key column';

COMMENT ON COLUMN OG_CATEGORY_REFEREE.CATEGORY_REFEREE IS 'UML to Offline Database Transform: Column CATEGORY_REFEREE created from UML attribute "categoryReferee" in UML class "OgCategoryReferee"';

COMMENT ON COLUMN OG_COLOUR.OG_COLOUR_ID IS 'UML to Offline Database Transform: Column OG_COLOUR_ID created as default primary key column';

COMMENT ON COLUMN OG_COLOUR.COLOUR IS 'UML to Offline Database Transform: Column COLOUR created from UML attribute "colour" in UML class "OgColour"';

COMMENT ON COLUMN OG_GENDER.OG_GENDER_ID IS 'UML to Offline Database Transform: Column OG_GENDER_ID created as default primary key column';

COMMENT ON COLUMN OG_GENDER.GENDER IS 'UML to Offline Database Transform: Column GENDER created from UML attribute "gender" in UML class "OgGender"';

COMMENT ON COLUMN OG_GROUP.OG_GROUP_ID IS 'UML to Offline Database Transform: Column OG_GROUP_ID created as default primary key column';

COMMENT ON COLUMN OG_GROUP.GROUPNAME IS 'UML to Offline Database Transform: Column GROUPNAME created from UML attribute "groupname" in UML class "OgGroup"';

COMMENT ON COLUMN OG_GROUP.OG_TEAM_ID IS 'UML to Offline Database Transform: Column OG_TEAM_ID created as default foreign key column for foreign key "OG_GROUP_TEAM1"';

COMMENT ON COLUMN OG_GROUP.OG_TEAM_ID1 IS 'UML to Offline Database Transform: Column OG_TEAM_ID1 created as default foreign key column for foreign key "OG_GROUP_TEAM2"';

COMMENT ON COLUMN OG_GROUP.OG_TEAM_ID2 IS 'UML to Offline Database Transform: Column OG_TEAM_ID2 created as default foreign key column for foreign key "OG_GROUP_TEAM3"';

COMMENT ON COLUMN OG_GROUP.OG_TEAM_ID3 IS 'UML to Offline Database Transform: Column OG_TEAM_ID3 created as default foreign key column for foreign key "OG_GROUP_TEAM4"';

COMMENT ON COLUMN OG_MATCH.OG_MATCH_ID IS 'UML to Offline Database Transform: Column OG_MATCH_ID created as default primary key column';

COMMENT ON COLUMN OG_MATCH.STARTDATE IS 'UML to Offline Database Transform: Column STARTDATE created from UML attribute "startdate" in UML class "OgMatch"';

COMMENT ON COLUMN OG_MATCH.ENDDATE IS 'UML to Offline Database Transform: Column ENDDATE created from UML attribute "enddate" in UML class "OgMatch"';

COMMENT ON COLUMN OG_MATCH.WINNER IS 'UML to Offline Database Transform: Column WINNER created from UML attribute "winner" in UML class "OgMatch"';

COMMENT ON COLUMN OG_MATCH.OG_MEDAL_ID IS 'UML to Offline Database Transform: Column OG_MEDAL_ID created as default foreign key column for foreign key "OG_MATCH_MEDAL"';

COMMENT ON COLUMN OG_MATCH.OG_PHASE_ID IS 'UML to Offline Database Transform: Column OG_PHASE_ID created as default foreign key column for foreign key "OG_MATCH_PHASE"';

COMMENT ON COLUMN OG_MATCH.REFEREE1 IS 'UML to Offline Database Transform: Column REFEREE1 created as default foreign key column for foreign key "OG_MATCH_REFEREE"';

COMMENT ON COLUMN OG_MATCH.OG_STADIUM_ID IS 'UML to Offline Database Transform: Column OG_STADIUM_ID created as default foreign key column for foreign key "OG_MATCH_STADIUM"';

COMMENT ON COLUMN OG_MATCH.OG_STATUS_ID IS 'UML to Offline Database Transform: Column OG_STATUS_ID created as default foreign key column for foreign key "OG_MATCH_STATUS"';

COMMENT ON COLUMN OG_MATCH.OG_TEAM_ID IS 'UML to Offline Database Transform: Column OG_TEAM_ID created as default foreign key column for foreign key "OG_MATCH_TEAM1"';

COMMENT ON COLUMN OG_MATCH.OG_TEAM_ID1 IS 'UML to Offline Database Transform: Column OG_TEAM_ID1 created as default foreign key column for foreign key "OG_MATCH_TEAM2"';

COMMENT ON COLUMN OG_MEDAL.OG_MEDAL_ID IS 'UML to Offline Database Transform: Column OG_MEDAL_ID created as default primary key column';

COMMENT ON COLUMN OG_MEDAL.MEDAL IS 'UML to Offline Database Transform: Column MEDAL created from UML attribute "medal" in UML class "OgMedal"';

COMMENT ON COLUMN OG_MEDAL_STANDING.OG_MEDAL_STANDING_ID IS 'UML to Offline Database Transform: Column OG_MEDAL_STANDING_ID created as default primary key column';

COMMENT ON COLUMN OG_MEDAL_STANDING.ID_NATIONALITY IS 'UML to Offline Database Transform: Column ID_NATIONALITY created from UML attribute "idNationality" in UML class "OgMedalStanding"';

COMMENT ON COLUMN OG_MEDAL_STANDING.GOLD IS 'UML to Offline Database Transform: Column GOLD created from UML attribute "gold" in UML class "OgMedalStanding"';

COMMENT ON COLUMN OG_MEDAL_STANDING.SILVER IS 'UML to Offline Database Transform: Column SILVER created from UML attribute "silver" in UML class "OgMedalStanding"';

COMMENT ON COLUMN OG_MEDAL_STANDING.BRONZE IS 'UML to Offline Database Transform: Column BRONZE created from UML attribute "bronze" in UML class "OgMedalStanding"';

COMMENT ON COLUMN OG_MEDAL_STANDING.OG_NATIONALITY_ID IS 'UML to Offline Database Transform: Column OG_NATIONALITY_ID created as default foreign key column for foreign key "OG_MEDAL_STANDING_NATIONALITY"';

COMMENT ON COLUMN OG_NATIONALITY.OG_NATIONALITY_ID IS 'UML to Offline Database Transform: Column OG_NATIONALITY_ID created as default primary key column';

COMMENT ON COLUMN OG_NATIONALITY.NATIONALITY IS 'UML to Offline Database Transform: Column NATIONALITY created from UML attribute "nationality" in UML class "OgNationality"';

COMMENT ON COLUMN OG_NEW.OG_NEW_ID IS 'UML to Offline Database Transform: Column OG_NEW_ID created as default primary key column';

COMMENT ON COLUMN OG_NEW.TITLE IS 'UML to Offline Database Transform: Column TITLE created from UML attribute "title" in UML class "OgNew"';

COMMENT ON COLUMN OG_NEW.HEADER IS 'UML to Offline Database Transform: Column HEADER created from UML attribute "header" in UML class "OgNew"';

COMMENT ON COLUMN OG_NEW.CONTENT IS 'UML to Offline Database Transform: Column CONTENT created from UML attribute "content" in UML class "OgNew"';

COMMENT ON COLUMN OG_NEW.DATE_HOUR IS 'UML to Offline Database Transform: Column DATE_HOUR created from UML attribute "dateHour" in UML class "OgNew"';

COMMENT ON COLUMN OG_NEW.IMG IS 'UML to Offline Database Transform: Column IMG created from UML attribute "img" in UML class "OgNew"';

COMMENT ON COLUMN OG_NEW_NOC.OG_NEW_NOC_ID IS 'UML to Offline Database Transform: Column OG_NEW_NOC_ID created as default primary key column';

COMMENT ON COLUMN OG_NEW_NOC.OG_NEW_ID IS 'UML to Offline Database Transform: Column OG_NEW_ID created as default foreign key column for foreign key "OG_NEW_NOC_NEW"';

COMMENT ON COLUMN OG_NEW_NOC.OG_NOC_ID IS 'UML to Offline Database Transform: Column OG_NOC_ID created as default foreign key column for foreign key "OG_NEW_NOC_NOC"';

COMMENT ON COLUMN OG_NOC.OG_NOC_ID IS 'UML to Offline Database Transform: Column OG_NOC_ID created as default primary key column';

COMMENT ON COLUMN OG_NOC.NOC IS 'UML to Offline Database Transform: Column NOC created from UML attribute "noc" in UML class "OgNoc"';

COMMENT ON COLUMN OG_PARTICIPANT.OG_PARTICIPANT_ID IS 'UML to Offline Database Transform: Column OG_PARTICIPANT_ID created as default primary key column';

COMMENT ON COLUMN OG_PARTICIPANT.NAME IS 'UML to Offline Database Transform: Column NAME created from UML attribute "name" in UML class "OgPerson"';

COMMENT ON COLUMN OG_PARTICIPANT.SURNAME IS 'UML to Offline Database Transform: Column SURNAME created from UML attribute "surname" in UML class "OgPerson"';

COMMENT ON COLUMN OG_PARTICIPANT.BIRTHDATE IS 'UML to Offline Database Transform: Column BIRTHDATE created from UML attribute "birthdate" in UML class "OgPerson"';

COMMENT ON COLUMN OG_PARTICIPANT.WEIGHT IS 'UML to Offline Database Transform: Column WEIGHT created from UML attribute "weight" in UML class "OgParticipant"';

COMMENT ON COLUMN OG_PARTICIPANT.HEIGHT IS 'UML to Offline Database Transform: Column HEIGHT created from UML attribute "height" in UML class "OgParticipant"';

COMMENT ON COLUMN OG_PARTICIPANT.PERSON IS 'UML to Offline Database Transform: Column PERSON created from UML attribute "person" in UML class "OgParticipant"';

COMMENT ON COLUMN OG_PARTICIPANT.OG_GENDER_ID IS 'UML to Offline Database Transform: Column OG_GENDER_ID created as default foreign key column for foreign key "OG_PERSON_GENDER"';

COMMENT ON COLUMN OG_PARTICIPANT.OG_NATIONALITY_ID IS 'UML to Offline Database Transform: Column OG_NATIONALITY_ID created as default foreign key column for foreign key "OG_PERSON_NATIONALITY"';

COMMENT ON COLUMN OG_PARTICIPANT.OG_NOC_ID IS 'UML to Offline Database Transform: Column OG_NOC_ID created as default foreign key column for foreign key "OG_PERSON_NOC"';

COMMENT ON COLUMN OG_PARTICIPANT.OG_ROLE_ID IS 'UML to Offline Database Transform: Column OG_ROLE_ID created as default foreign key column for foreign key "OG_PARTICIPANT_ROLE"';

COMMENT ON COLUMN OG_PERSON.OG_PERSON_ID IS 'UML to Offline Database Transform: Column OG_PERSON_ID created as default primary key column';

COMMENT ON COLUMN OG_PERSON.NAME IS 'UML to Offline Database Transform: Column NAME created from UML attribute "name" in UML class "OgPerson"';

COMMENT ON COLUMN OG_PERSON.SURNAME IS 'UML to Offline Database Transform: Column SURNAME created from UML attribute "surname" in UML class "OgPerson"';

COMMENT ON COLUMN OG_PERSON.BIRTHDATE IS 'UML to Offline Database Transform: Column BIRTHDATE created from UML attribute "birthdate" in UML class "OgPerson"';

COMMENT ON COLUMN OG_PERSON.OG_GENDER_ID IS 'UML to Offline Database Transform: Column OG_GENDER_ID created as default foreign key column for foreign key "OG_PERSON_GENDER"';

COMMENT ON COLUMN OG_PERSON.OG_NATIONALITY_ID IS 'UML to Offline Database Transform: Column OG_NATIONALITY_ID created as default foreign key column for foreign key "OG_PERSON_NATIONALITY"';

COMMENT ON COLUMN OG_PERSON.OG_NOC_ID IS 'UML to Offline Database Transform: Column OG_NOC_ID created as default foreign key column for foreign key "OG_PERSON_NOC"';

COMMENT ON COLUMN OG_PHASE.OG_PHASE_ID IS 'UML to Offline Database Transform: Column OG_PHASE_ID created as default primary key column';

COMMENT ON COLUMN OG_PHASE.PHASE IS 'UML to Offline Database Transform: Column PHASE created from UML attribute "phase" in UML class "OgPhase"';

COMMENT ON COLUMN OG_REFEREE.OG_REFEREE_ID IS 'UML to Offline Database Transform: Column OG_REFEREE_ID created as default primary key column';

COMMENT ON COLUMN OG_REFEREE.NAME IS 'UML to Offline Database Transform: Column NAME created from UML attribute "name" in UML class "OgPerson"';

COMMENT ON COLUMN OG_REFEREE.SURNAME IS 'UML to Offline Database Transform: Column SURNAME created from UML attribute "surname" in UML class "OgPerson"';

COMMENT ON COLUMN OG_REFEREE.BIRTHDATE IS 'UML to Offline Database Transform: Column BIRTHDATE created from UML attribute "birthdate" in UML class "OgPerson"';

COMMENT ON COLUMN OG_REFEREE.OG_GENDER_ID IS 'UML to Offline Database Transform: Column OG_GENDER_ID created as default foreign key column for foreign key "OG_PERSON_GENDER"';

COMMENT ON COLUMN OG_REFEREE.OG_NATIONALITY_ID IS 'UML to Offline Database Transform: Column OG_NATIONALITY_ID created as default foreign key column for foreign key "OG_PERSON_NATIONALITY"';

COMMENT ON COLUMN OG_REFEREE.OG_NOC_ID IS 'UML to Offline Database Transform: Column OG_NOC_ID created as default foreign key column for foreign key "OG_PERSON_NOC"';

COMMENT ON COLUMN OG_REFEREE.OG_CATEGORY_REFEREE_ID IS 'UML to Offline Database Transform: Column OG_CATEGORY_REFEREE_ID created as default foreign key column for foreign key "OG_REFEREE_CATEGORY_REFEREE"';

COMMENT ON COLUMN OG_RESULT.OG_RESULT_ID IS 'UML to Offline Database Transform: Column OG_RESULT_ID created as default primary key column';

COMMENT ON COLUMN OG_RESULT.HOME_TEAM IS 'UML to Offline Database Transform: Column HOME_TEAM created from UML attribute "homeTeam" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.AWAY_TEAM IS 'UML to Offline Database Transform: Column AWAY_TEAM created from UML attribute "awayTeam" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES1_HOME IS 'UML to Offline Database Transform: Column RES1_HOME created from UML attribute "res1Home" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES1_AWAY IS 'UML to Offline Database Transform: Column RES1_AWAY created from UML attribute "res1Away" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES2_HOME IS 'UML to Offline Database Transform: Column RES2_HOME created from UML attribute "res2Home" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES2_AWAY IS 'UML to Offline Database Transform: Column RES2_AWAY created from UML attribute "res2Away" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_ET1_HOME IS 'UML to Offline Database Transform: Column RES_ET1_HOME created from UML attribute "resEt1Home" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_ET1_AWAY IS 'UML to Offline Database Transform: Column RES_ET1_AWAY created from UML attribute "resEt1Away" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_ET2_HOME IS 'UML to Offline Database Transform: Column RES_ET2_HOME created from UML attribute "resEt2Home" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_ET2_AWAY IS 'UML to Offline Database Transform: Column RES_ET2_AWAY created from UML attribute "resEt2Away" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_TOTAL_HOME IS 'UML to Offline Database Transform: Column RES_TOTAL_HOME created from UML attribute "resTotalHome" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_TOTAL_AWAY IS 'UML to Offline Database Transform: Column RES_TOTAL_AWAY created from UML attribute "resTotalAway" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_PEN_HOME IS 'UML to Offline Database Transform: Column RES_PEN_HOME created from UML attribute "resPenHome" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.RES_PEN_AWAY IS 'UML to Offline Database Transform: Column RES_PEN_AWAY created from UML attribute "resPenAway" in UML class "OgResult"';

COMMENT ON COLUMN OG_RESULT.OG_MATCH_ID IS 'UML to Offline Database Transform: Column OG_MATCH_ID created as default foreign key column for foreign key "OG_RESULT_MATCH"';

COMMENT ON COLUMN OG_ROLE.OG_ROLE_ID IS 'UML to Offline Database Transform: Column OG_ROLE_ID created as default primary key column';

COMMENT ON COLUMN OG_ROLE.ROLE IS 'UML to Offline Database Transform: Column ROLE created from UML attribute "role" in UML class "OgRole"';

COMMENT ON COLUMN OG_STADIUM.OG_STADIUM_ID IS 'UML to Offline Database Transform: Column OG_STADIUM_ID created as default primary key column';

COMMENT ON COLUMN OG_STADIUM.NAME IS 'UML to Offline Database Transform: Column NAME created from UML attribute "name" in UML class "OgStadium"';

COMMENT ON COLUMN OG_STADIUM.CAPACITY IS 'UML to Offline Database Transform: Column CAPACITY created from UML attribute "capacity" in UML class "OgStadium"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.OG_STATISTIC_PARTICIPANT_ID IS 'UML to Offline Database Transform: Column OG_STATISTIC_PARTICIPANT_ID created as default primary key column';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.PJ IS 'UML to Offline Database Transform: Column PJ created from UML attribute "pj" in UML class "OgStatisticParticipant"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.TIT IS 'UML to Offline Database Transform: Column TIT created from UML attribute "tit" in UML class "OgStatisticParticipant"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.MJUG IS 'UML to Offline Database Transform: Column MJUG created from UML attribute "mjug" in UML class "OgStatisticParticipant"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.G IS 'UML to Offline Database Transform: Column G created from UML attribute " G" in UML class "OgStatisticParticipant"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.ASIST IS 'UML to Offline Database Transform: Column ASIST created from UML attribute "asist" in UML class "OgStatisticParticipant"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.FC IS 'UML to Offline Database Transform: Column FC created from UML attribute "fc" in UML class "OgStatisticParticipant"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.FS IS 'UML to Offline Database Transform: Column FS created from UML attribute "fs" in UML class "OgStatisticParticipant"';

COMMENT ON COLUMN OG_STATISTIC_PARTICIPANT.OG_PARTICIPANT_ID IS 'UML to Offline Database Transform: Column OG_PARTICIPANT_ID created as default foreign key column for foreign key "OG_STATISTIC_PARTIC_PARTIC"';

COMMENT ON COLUMN OG_STATISTIC_TEAM.OG_STATISTIC_TEAM_ID IS 'UML to Offline Database Transform: Column OG_STATISTIC_TEAM_ID created as default primary key column';

COMMENT ON COLUMN OG_STATISTIC_TEAM.NMATCH IS 'UML to Offline Database Transform: Column NMATCH created from UML attribute "nmatch" in UML class "OgStatisticTeam"';

COMMENT ON COLUMN OG_STATISTIC_TEAM.NMATCH_WINS IS 'UML to Offline Database Transform: Column NMATCH_WINS created from UML attribute "nmatchWins" in UML class "OgStatisticTeam"';

COMMENT ON COLUMN OG_STATISTIC_TEAM.NMATCH_EQ IS 'UML to Offline Database Transform: Column NMATCH_EQ created from UML attribute "nmatchEq" in UML class "OgStatisticTeam"';

COMMENT ON COLUMN OG_STATISTIC_TEAM.GF IS 'UML to Offline Database Transform: Column GF created from UML attribute "gf" in UML class "OgStatisticTeam"';

COMMENT ON COLUMN OG_STATISTIC_TEAM.GC IS 'UML to Offline Database Transform: Column GC created from UML attribute "gc" in UML class "OgStatisticTeam"';

COMMENT ON COLUMN OG_STATISTIC_TEAM.OG_TEAM_ID IS 'UML to Offline Database Transform: Column OG_TEAM_ID created as default foreign key column for foreign key "OG_STATISTIC_TEAM_TEAM"';

COMMENT ON COLUMN OG_STATUS.OG_STATUS_ID IS 'UML to Offline Database Transform: Column OG_STATUS_ID created as default primary key column';

COMMENT ON COLUMN OG_STATUS.STATUS IS 'UML to Offline Database Transform: Column STATUS created from UML attribute "status" in UML class "OgStatus"';

COMMENT ON COLUMN OG_STAT_MATCH_PARTIC.OG_STAT_MATCH_PARTIC_ID IS 'UML to Offline Database Transform: Column OG_STAT_MATCH_PARTIC_ID created as default primary key column';

COMMENT ON COLUMN OG_STAT_MATCH_PARTIC.MATCH IS 'UML to Offline Database Transform: Column MATCH created from UML attribute "match" in UML class "OgStatMatchPartic"';

COMMENT ON COLUMN OG_STAT_MATCH_PARTIC.MINUTE IS 'UML to Offline Database Transform: Column MINUTE created from UML attribute "minute" in UML class "OgStatMatchPartic"';

COMMENT ON COLUMN OG_STAT_MATCH_PARTIC.OG_ACTION_ID IS 'UML to Offline Database Transform: Column OG_ACTION_ID created as default foreign key column for foreign key "OG_MATCH_TEAM_ACTION"';

COMMENT ON COLUMN OG_STAT_MATCH_PARTIC.OG_MATCH_ID IS 'UML to Offline Database Transform: Column OG_MATCH_ID created as default foreign key column for foreign key "OG_MATCH_TEAM_MATCH"';

COMMENT ON COLUMN OG_STAT_MATCH_PARTIC.OG_PARTICIPANT_ID IS 'UML to Offline Database Transform: Column OG_PARTICIPANT_ID created as default foreign key column for foreign key "OG_MATCH_TEAM_PARTICIPANT"';

COMMENT ON COLUMN OG_STAT_MATCH_PARTIC.OG_TEAM_ID IS 'UML to Offline Database Transform: Column OG_TEAM_ID created as default foreign key column for foreign key "OG_MATCH_TEAM_TEAM"';

COMMENT ON COLUMN OG_TEAM.OG_TEAM_ID IS 'UML to Offline Database Transform: Column OG_TEAM_ID created as default primary key column';

COMMENT ON COLUMN OG_TEAM.ID_GROUP IS 'UML to Offline Database Transform: Column ID_GROUP created from UML attribute "idGroup" in UML class "OgTeam"';

COMMENT ON COLUMN OG_TEAM.OG_COLOUR_ID_HOME IS 'UML to Offline Database Transform: Column OG_COLOUR_ID created as default foreign key column for foreign key "OG_TEAM_AWAY_COLOUR"';

COMMENT ON COLUMN OG_TEAM.OG_GENDER_ID IS 'UML to Offline Database Transform: Column OG_GENDER_ID created as default foreign key column for foreign key "OG_TEAM_GENDER"';

COMMENT ON COLUMN OG_TEAM.OG_COLOUR_ID_AWAY IS 'UML to Offline Database Transform: Column OG_COLOUR_ID1 created as default foreign key column for foreign key "OG_TEAM_HOME_COLOUR"';

COMMENT ON COLUMN OG_TEAM.OG_NATIONALITY_ID IS 'UML to Offline Database Transform: Column OG_NATIONALITY_ID created as default foreign key column for foreign key "OG_TEAM_NATIONALITY"';

COMMENT ON COLUMN OG_TEAM.OG_NOC_ID IS 'UML to Offline Database Transform: Column OG_NOC_ID created as default foreign key column for foreign key "OG_TEAM_NOC"';

COMMENT ON COLUMN OG_TEAM_PARTIC.DORSAL IS 'UML to Offline Database Transform: Column DORSAL created from UML attribute "dorsal" in UML class "OgTeamPartic"';

COMMENT ON COLUMN OG_TEAM_PARTIC.OG_PARTICIPANT_ID IS 'UML to Offline Database Transform: Column OG_PARTICIPANT_ID created as default foreign key column for foreign key "OG_TEAM_PARTIC_PARTIC"';

COMMENT ON COLUMN OG_TEAM_PARTIC.OG_TEAM_ID IS 'UML to Offline Database Transform: Column OG_TEAM_ID created as default foreign key column for foreign key "OG_TEAM_PARTIC_TEAM"';
