DROP TABLE BOOK_ITEM IF EXISTS;
DROP TABLE BOOK_LIST IF EXISTS;
DROP TABLE BOOKS IF EXISTS;


CREATE TABLE books (
book_id VARCHAR(60) PRIMARY KEY,
isbn VARCHAR(50),
author VARCHAR(50),
title VARCHAR(60),
category VARCHAR(50),
book_length INTEGER,
description VARCHAR(1500),

);



	CREATE TABLE book_list (
	id VARCHAR(50) PRIMARY KEY
	);
	
	CREATE TABLE book_item (
	id VARCHAR(75),
	book_id VARCHAR(60) FOREIGN KEY REFERENCES books(book_id),
	book_list_id VARCHAR(50) FOREIGN KEY REFERENCES book_list(id),
	CONSTRAINT BOOK_ITEM_PK PRIMARY KEY (id,book_list_id)
	);




