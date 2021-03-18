CREATE TABLE IF NOT EXISTS programming_languages (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(200) NOT NULL
);

INSERT INTO programming_languages (name) VALUES
  ('Python'),
  ('Java'),
  ('JavaScript'),
  ('Swift'),
  ('Ruby');

CREATE TABLE developer (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(200) NOT NULL
);

INSERT INTO developer (name) VALUES
  ('Fowler'),
  ('Josh'),
  ('Roshi'),
  ('Neumann'),
  ('Yukihiro');
  
CREATE TABLE programming_languages_developer (
  id_developer int(6) unsigned NOT NULL,
  id_programming_language int(3) unsigned NOT NULL,
   PRIMARY KEY (id_developer, id_programming_language),
   FOREIGN KEY (id_developer)
      REFERENCES developer(id)
      ON UPDATE CASCADE ON DELETE RESTRICT,
  FOREIGN KEY (id_programming_language)
      REFERENCES programming_languages(id)
      ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT INTO programming_languages_developer (id_developer, id_programming_language) VALUES
  ('1', '2'),
  ('2', '2'),
  ('3', '2'),
  ('3', '1'),
  ('4', '1'),
  ('4', '2'),
  ('4', '3'),
  ('4', '4'),
  ('5', '5');
