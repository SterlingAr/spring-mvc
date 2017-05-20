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

