CREATE TABLE party (
  party_id          INTEGER PRIMARY KEY AUTO_INCREMENT,
  party_letter      VARCHAR(1) NOT NULL,
  party_name        VARCHAR(50) NOT NULL);

CREATE TABLE candidate (
  candidate_id      INTEGER PRIMARY KEY AUTO_INCREMENT,
  candidate_name    VARCHAR(50) NOT NULL,
  party_id          int NOT NULL);