CREATE TABLE IF NOT EXISTS pet (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name VARCHAR (255) NOT NULL,
  dateOfBirth VARCHAR (255) NOT NULL,
  breed VARCHAR (255) NOT NULL,
  primary key (id)
);