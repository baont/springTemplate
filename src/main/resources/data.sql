DROP TABLE IF EXISTS UserDetails;

CREATE TABLE UserDetails (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  firstName VARCHAR(250) NOT NULL,
  lastName VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  birth TIMESTAMP DEFAULT NULL
);

INSERT INTO UserDetails (firstName, lastName, email, birth) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist', '2000-01-01 00:00:00'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur', '2000-01-02 01:00:00'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate', '2000-01-03 02:00:00');