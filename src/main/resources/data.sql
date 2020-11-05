INSERT INTO Character (id, name, description, modified) VALUES
	(1, 'Hulk', 'Green muscle guy that smashes everything', CURRENT_TIMESTAMP()),
	(2, 'IronMan', 'Genious Playboy Filantropist Billionarie', CURRENT_TIMESTAMP()),
	(3, 'Thanos', 'The Crazy Titan', CURRENT_TIMESTAMP()),
	(4, 'Spider-Man', 'Your friendly neighborhood', CURRENT_TIMESTAMP());

INSERT INTO Comic (id, title, description) VALUES
	(1, 'Avengers: Endgame (2019)', 'Avengers back in time to undo the huge mess Thanos did'),
	(2, 'Civil War (2016)', 'Cap and Ironman dig into a crazy fight'),
	(3, 'IronMan (2008)', 'The first movie of MCU');
	
INSERT INTO Event (id, title, description) VALUES
	(1, 'Secret Invasion', 'The shape-shifting Skrulls have been infiltrating the Earth for years, replacing many of Marvels heroes with impostors, setting the stage for an all-out invasion.');

INSERT INTO Serie (id, title, description, start_year, end_year, rating) VALUES
	(1, 'Superior Spider-Man Vol. 2: Otto-matic (2019)', '', 2019, 2019, 'AAA'),
	(2, '2099 Alpha (2019)', '2099 Alpha (2019) Description', 2019, 2019, 'AAA');
	
INSERT INTO Character_Comic(character_id, comic_id) VALUES
	(1, 1),
	(2, 1),
	(2, 2),
	(2, 3),
	(3, 1);
	
INSERT INTO Character_Event(character_id, event_id) VALUES
	(1, 1),
	(2, 1),
	(3, 1);
	
INSERT INTO Comic_Event(comic_id, event_id) VALUES
	(1, 1);
	
INSERT INTO Character_Serie(character_id, serie_id) VALUES
	(1, 1),
	(1, 2);
	
INSERT INTO Comic_Serie(comic_id, serie_id) VALUES
	(1, 1),
	(2, 1),	
	(1, 2),
	(2, 2);
	
INSERT INTO Event_Serie(event_id, serie_id) VALUES
	(1, 1),
	(1, 2);	
	
	