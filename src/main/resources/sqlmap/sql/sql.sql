CREATE DATABASE GeomexBoard;

CREATE TABLE users (
	id VARCHAR(20) PRIMARY KEY CHECK (id SIMILAR TO '[a-z0-9-_]+'),
	password VARCHAR(20) NOT NULL,
	name VARCHAR(20) NOT NULL UNIQUE,
	date TIMESTAMP DEFAULT NOW()
);

CREATE SEQUENCE articles_id_seq START 1;

CREATE TABLE articles (
	id INTEGER PRIMARY KEY DEFAULT nextval('articles_id_seq'),
	user_id VARCHAR(20) REFERENCES users(id) NOT NULL,
	title VARCHAR(100) NOT NULL CHECK (char_length(title) > 0),
	content TEXT NOT NULL CHECK (char_length(content) > 0),
	date TIMESTAMP DEFAULT NOW()
);

CREATE SEQUENCE comments_id_seq START 1;

CREATE TABLE comments (
	id INTEGER PRIMARY KEY DEFAULT nextval('comments_id_seq'),
	user_id VARCHAR(20) REFERENCES users(id) NOT NULL,
	article_id INTEGER REFERENCES articles(id) NOT NULL,
	content TEXT NOT NULL CHECK (char_length(content) > 0),
	date TIMESTAMP DEFAULT NOW()
);