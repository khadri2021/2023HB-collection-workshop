drop table rivers;
drop table capitals;
drop table country;

create table country(COUNTRY_ID int primary key,COUNTRY_NAME varchar(30));
create table rivers(COUNTRY_ID int,RIVER_NAME varchar(30),key (COUNTRY_ID),constraint foreign key(COUNTRY_ID) references country(COUNTRY_ID));
create table capitals(COUNTRY_ID int,STATE_NAME varchar(30),CAPITAL_NAME varchar(30),key (COUNTRY_ID),constraint foreign key(COUNTRY_ID) references country(COUNTRY_ID));

select * from country;
select * from rivers;
select * from capitals;