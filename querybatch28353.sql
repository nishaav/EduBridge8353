-- I need to update the average rating of the product whenever a new review 
-- will be getting received
create database e_commerce;
use e_commerce;

-- create the product table
create table product
	(	p_id int primary key auto_increment,
		p_name varchar(50),
        p_price int,
        p_description varchar(255),
        p_qty int,
        p_left_in_stock int,
        p_rating decimal(10,2)
    ); 
create table product_sold
	(	ps_id int primary key auto_increment,
		p_id int,
        dos date,
        Foreign key (p_id) references product(p_id)
    ); 




insert into product(p_name,p_price, p_description,p_qty) values
('HP Laptop',45000,'HP LAPTOP Great Deal Offer',5),
('Boat Airdops',2100,'Boat Airdops on discounted price',43),
('Iphone 13',80000,'Iphone 13 pro',20),
('Smart watch',5000,'Boat Xtend',8),
('HP Laptop Charger',400,'charger',7);

create table reviews
(
	r_id int primary key auto_increment,
    p_id int,
    review varchar(200),
    rating int,
	Foreign key (p_id) references product(p_id)
);
desc reviews;
drop table reviews;
-- creating an after insert trigger

drop table product;

select * from product;

CREATE TRIGGER update_rating
AFTER INSERT ON reviews
FOR EACH ROW
UPDATE product set p_rating=(SELECT AVG(rating) FROM reviews WHERE reviews.p_id=NEW.p_id ) 
WHERE product.p_id=NEW.p_id;
-- INSERTING REVIEWS
insert into reviews(p_id,review,rating)values(1,'GOOD',4);
insert into reviews(p_id,review,rating)values(1,'EXCELLENT',5);
insert into reviews(p_id,review,rating)values(1,'POOR',2);



CREATE TRIGGER inventory_left_trg
AFTER 





select * from product;
select * from reviews;
desc product;