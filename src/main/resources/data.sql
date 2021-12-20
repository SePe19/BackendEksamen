--PARTY
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (1, "A", "Socialdemokratiet");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (2, "B", "Radikale Venstre");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (3, "C", "Det Konservative Folkeparti");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (4, "D", "Nye Borgerlige");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (5, "F", "SF - Socialistisk Folkeparti");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (6, "H", "Forenet Frederikssund");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (7, "N", "Fjordlandslisten");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (8, "O", "Dansk Folkeparti");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (9, "P", "Anja Bisp Pedersen");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (10, "V", "Venstre, Danmarks Liberale Parti");
INSERT INTO `party` (`party_id`, `party_letter`, `party_name`) VALUES (11, "Ø", "Enhedslisten - De Rød-Grønne");


--CANDIDATE
--Candidates for (A) Socialdemokratiet
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (1, "Tina Tving Stauning", 1);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (2, "Jesper Wittenburg", 1);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (3, "Susanne Bettina Jørgensen", 1);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (4, "Kenneth Jensen", 1);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (5, "Anne-Lise Kuhre", 1);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (6, "Poul Erik Skov Christensen", 1);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (7, "Lars Jepsen", 1);

--Candidates for (B) Det Radikale Venstre
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (8, "Søren Weimann", 2);

--Candidates for (C) Det Konservative Folkeparti
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (9, "Niels Martin Viuff", 3);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (10, "Therese Hejnfelt", 3);

--Candidates for (D) Nye Borgerlige
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (11, "Maibritt Møller Nielsen", 4);

--Candidates for (F) Socialistisk Folkeparti
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (12, "Anna Poulsen", 5);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (13, "Ole Frimann Hansen", 5);

--Candidates for (N) Fjordlandslisten
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (14, "Kirsten Weiland", 7);

--Candidates for (O) Dansk Folkeparti
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (15, "Inge Messerschmidt", 8);

--Candidates for (V) Venstre
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (16, "John Schmidt Andersen", 10);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (17, "Hans Andersen", 10);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (18, "Anne Sofie Uhrskov", 10);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (19, "Michael Tøgersen", 10);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (20, "Jørgen Bech", 10);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (21, "Charlotte Drue Aagaard", 10);
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (22, "Morten Skovgaard", 10);

--Candidates for (Ø) Enhedslisten
INSERT INTO `candidate` (`candidate_id`, `candidate_name`, `party_id`) VALUES (23, "Rasmus Petersen", 11);