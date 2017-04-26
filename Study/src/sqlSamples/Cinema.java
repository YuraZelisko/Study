drop database if exists my_sql;
create database my_sql;

use my_sql;

create table dist_company(
	id int primary key auto_increment,
    name varchar(40),
    film_mane varchar(30)
);

create table city(
	id int primary key auto_increment,
    name varchar(60)
);

create table cinema(
	id int primary key auto_increment,
    name varchar(40),
    description text,
    address varchar(100)
);

create table tikets(
	id int primary key auto_increment,
	hall_name varchar(20),
	place int
);

create table personal(
	id int primary key auto_increment,
	curr_position varchar(45),
	name varchar(30),
	birth datetime
);

create table film(
	id int primary key auto_increment,
	film_name varchar(50),
	film_genre varchar(15),
	film_desc text
);

create table hall(
	id int primary key auto_increment,
    hall_name varchar(20),
    places int
);


#one to one
alter table personal 
	add constraint 
    foreign key(id)
    references cinema(id);
    
    

#one to many
alter table tikets
	add column id_cinema int;
    
alter table tikets
	add constraint
    foreign key(id_cinema)
    references cinema(id);
    
alter table hall
	add column id_cinema int;
    
alter table hall
	add constraint
    foreign key(id_cinema)
    references cinema(id);
    
alter table hall
	add column id_film int;
    
alter table hall
	add constraint
    foreign key(id_film)
    references film(id);    
    
    

# many to many

create table city_cinema(
	id_city int,
    id_cinema int
);
alter table city_cinema
	add constraint
    foreign key(id_city)
    references city(id);


alter table city_cinema
	add constraint
    foreign key(id_cinema)
    references cinema(id);
    
create table cinema_film(
	id_film int,
    id_cinema int
);
alter table cinema_film
	add constraint
    foreign key(id_film)
    references film(id);


alter table cinema_film
	add constraint
    foreign key(id_cinema)
    references cinema(id);
    

create table cinema_dist_company(
	id_dist_company int,
    id_cinema int
);
alter table cinema_dist_company
	add constraint
    foreign key(id_dist_company)
    references dist_company(id);


alter table cinema_dist_company
	add constraint
    foreign key(id_cinema)
    references cinema(id);
    
create table film_dist_company(
	id_dist_company int,
    id_film int
);
alter table film_dist_company
	add constraint
    foreign key(id_dist_company)
    references dist_company(id);


alter table film_dist_company
	add constraint
    foreign key(id_film)
    references film(id);