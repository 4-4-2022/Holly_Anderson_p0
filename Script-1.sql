--BANK
--todo - autoincrement ID, engine=innodb?? 
drop table Users;
create table Users(
	User_ID int primary key,
	FirstName varchar(20),
	LastName varchar(20),
	Pass varchar(30) 
	);
	
drop table Accounts;
create table Accounts(
	Acct_ID int primary key,
	Acct_type varchar (15),
	Acct_balance decimal
	);
	
drop table Mappings;
create table Mappings(
	MapID int primary key,
	UserID int references Users(User_ID) on delete cascade,
	AcctID int references Accounts(Acct_ID) on delete cascade
	);
	
--PLANTS DB 
/* Different sublanguages help us create different tasks - first we'll use DDL.
*  This pertains to creation of structures/objects that will organize our data. E.G. table
* 
* Making a table for - (String plantName, short price, String sun, boolean isHydroponic, boolean isSeed)
* The 'if not exists' clause is optional 
* 
*Constraints -- e.g not null, unique -- check the data
*/ 
drop table plant;
create table plant(
	plant_name varchar unique not null, 
	plant_price numeric not null check (plant_price >= 0),
	plant_sun varchar,
	plant_is_hydroponic boolean,
	plant_is_seed boolean
);

drop table greenhouse;
create table greenhouse(
-- Note that a primary key constraint specifies that a column is unique and not null.
	greenhouse_id integer primary key,
	greenhouse_name varchar unique not null,
	greenhouse_street varchar not null,
	greenhouse_state varchar not null,
	greenhouse_zip_code varchar not null
);


select greenhouse_id from greenhouse;

-- In order to model a "many to many" relationship, we actually need a join table (also called a bridge table).
drop table if exists plant_greenhouse;
create table plant_greenhouse(
	plant_name varchar references plant(plant_name),
	greenhouse_id integer references greenhouse(greenhouse_id),
	-- You can add constraints at the end of a table rather than inline. We will add a primary
	-- key constraint to this table below. It will be a composite primary key.
	primary key(plant_name, greenhouse_id)
);
/* cant drop a table and recreate it (drop again) without consequences - we could lose data 
 * e.g. alteration is obsolete 
 * alter table if exists plant alter column plant_sun set data type text; */

--DML - CRUD
select plant_name, plant_price, plant_sun from plants

-- Creating Records
insert into plant values('Monstera', 10, 'Indirect Sun', false, false), ('Pothos', 5, 'Indirect Sun', true, false),
('Spinach', 2, 'Full Sun', false, true), ('Gardenia', 7, 'Full Sun', false, false);

insert into greenhouse values(1, 'Rainbow Gardens', 'Bandera Road', 'TX', '78250'), (2, 'Helios Haven', 'Braun Road', 'OK', '87709');

insert into plant_greenhouse values('Monstera', 2);
insert into plant_greenhouse values('Pothos', 1);
insert into plant_greenhouse values('Spinach', 2);
insert into plant_greenhouse values('Gardenia', 1);

-- Updating a record - be careful to use a where clause
update plant set plant_price = 13 where plant_name = 'Monstera';

-- Deleting a record - be careful to use a where clause
--delete from plant where plant_name = 'Pothos'

--TCL - finalizing or reverting changes to our schema
--Proper = always commit changes - it's possible to revert them

commit;
