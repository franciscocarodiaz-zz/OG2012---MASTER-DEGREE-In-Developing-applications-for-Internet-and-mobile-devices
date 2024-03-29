
/*Data insert into Action table*/

INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (0,'Gol');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (1,'Minutos_jugados');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (2,'Falta_favor');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (3,'Falta_contra');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (4,'Penalty');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (5,'Tarjeta_amarilla');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (6,'Tarjeta_roja');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (7,'TIRO A PUERTA');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (8,'GOL-PENALTY');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (9,'FUERA DE JUEGO');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (10,'SUSTITUIDO-SALE DEL CAMPO');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (11,'SUSTITUYE-ENTRA EN EL CAMPO');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (12,'LESIONADO');
INSERT INTO OG_ACTION (ACTION_ID, ACTION) VALUES (13,'MIN DE DESCUENTO');




/*Data insert into category referee table*/

INSERT INTO OG_CATEGORY_REFEREE (CATEGORY_REFEREE_ID, CATEGORY_REFEREE) VALUES (0,'Arbitro_principal');
INSERT INTO OG_CATEGORY_REFEREE (CATEGORY_REFEREE_ID, CATEGORY_REFEREE) VALUES (1,'Juez_linea');
INSERT INTO OG_CATEGORY_REFEREE (CATEGORY_REFEREE_ID, CATEGORY_REFEREE) VALUES (2,'Cuarto_arbitro');




/*Data insert into colour table*/

INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (0,'Rojo');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (1,'Amarillo');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (2,'Azul');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (3,'Blanco');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (4,'Negro');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (5,'Verde');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (6,'Lila');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (7,'Naranja');
INSERT INTO OG_COLOUR (COLOUR_ID, COLOUR) VALUES (8,'Rosa');








/*Data insert into NOC table*/

INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (0,'Spain');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (1,'Russia');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (2,'Germany');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (3,'Holland');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (4,'Portugal');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (5,'Italy');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (6,'France');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (7,'China');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (8,'Japon');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (9,'Mexico');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (10,'Brasil');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (11,'USA');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (12,'Argentina');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (13,'Uruguay');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (14,'Paraguay');
INSERT INTO OG_NOC (NOC_ID, NOC) VALUES (15,'Colombia');






/*Data insert into Nationality table*/

INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (0,'Espana');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (1,'Rusia');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (2,'Alemania');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (3,'Holanda');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (4,'Portugal');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (5,'Italia');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (6,'Francia');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (7,'China');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (8,'Japon');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (9,'Mexico');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (10,'Brasil');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (11,'USA');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (12,'Argentina');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (13,'Uruguay');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (14,'Paraguay');
INSERT INTO OG_NATIONALITY (NATIONALITY_ID, NATIONALITY) VALUES (15,'Colombia');










/*Data insert into gender table*/

INSERT INTO OG_GENDER (GENDER_ID, GENDER) VALUES (0,'Masculino');
INSERT INTO OG_GENDER (GENDER_ID, GENDER) VALUES (1,'Femenino');






/*Data insert into team table*/
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (0,0,0,0,0,2);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (1,1,0,1,3,2);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (2,2,0,2,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (3,3,0,3,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (4,4,0,4,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (5,5,0,5,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (6,6,0,6,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (7,7,0,7,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (8,8,0,8,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (9,9,0,9,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (10,10,0,10,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (11,11,0,11,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (12,12,0,12,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (13,13,0,13,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (14,14,0,14,,);
INSERT INTO OG_TEAM (TEAM_ID, NOC, GENDER, NATIONALITY, HOME_COLOUR, AWAY_COLOUR) VALUES (15,15,0,15,,);





/*Data insert into group table*/

INSERT INTO OG_GROUP (GROUP_ID, GROUPNAME, ID_TEAM_1, ID_TEAM_2, ID_TEAM_3, ID_TEAM_4) VALUES (0,'A',0,1,2,3);
INSERT INTO OG_GROUP (GROUP_ID, GROUPNAME, ID_TEAM_1, ID_TEAM_2, ID_TEAM_3, ID_TEAM_4) VALUES (1,'B',4,5,6,7);
INSERT INTO OG_GROUP (GROUP_ID, GROUPNAME, ID_TEAM_1, ID_TEAM_2, ID_TEAM_3, ID_TEAM_4) VALUES (2,'C',8,9,10,11);
INSERT INTO OG_GROUP (GROUP_ID, GROUPNAME, ID_TEAM_1, ID_TEAM_2, ID_TEAM_3, ID_TEAM_4) VALUES (3,'D',12,13,14,15);