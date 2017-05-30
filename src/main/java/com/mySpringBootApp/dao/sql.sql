DROP DATABASE IF EXISTS opinion;
CREATE DATABASE opinion DEFAULT CHARACTER SET 'utf8';
USE opinion;
CREATE TABLE users
(
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 feedback TEXT
  );

INSERT INTO users (feedback) VALUES ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt, ante pulvinar pulvinar commodo, quam erat laoreet erat, nec placerat ipsum purus ac erat. Proin vehicula volutpat auctor. Suspendisse tempus pulvinar dignissim. ");
INSERT INTO users (feedback) VALUES ("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam tincidunt, ante pulvinar pulvinar commodo, quam erat laoreet erat, nec placerat ipsum purus ac erat. Proin vehicula volutpat auctor. Suspendisse tempus pulvinar dignissim. ");