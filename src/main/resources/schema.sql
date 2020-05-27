CREATE TABLE Recipe(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  recipeName VARCHAR(250) NOT NULL,
  creationTs VARCHAR(30),
  serveCount int NOT NULL,
  description VARCHAR(250) DEFAULT NULL,
  dishType VARCHAR (30),
 instructions VARCHAR(250),
 ingredients VARCHAR(250)
);

INSERT INTO Recipe (recipeName, creationTs, serveCount, description, dishType, instructions, ingredients) VALUES
  ('pav bhaji','', '2', 'the best', 'veg', 'the best',''),
  ('dal bati','', '2', 'the best', 'veg', 'the best',''),
  ('pur bhaji', '', '2', 'the best', 'nveg', 'the best', '');
