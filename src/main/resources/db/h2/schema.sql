DROP TABLE user IF EXISTS;

CREATE TABLE user (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30)
);
