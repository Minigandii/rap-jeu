CREATE TABLE rapper (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        nickname VARCHAR(255),
                        nb_album INT,
                        nb_feat INT,
                        nb_gold_disc INT,
                        nb_platinum_disc INT
);

INSERT INTO rapper (name, nickname, nb_album, nb_feat, nb_gold_disc, nb_platinum_disc) VALUES
                                                       ('Rapper1', 'Nick1', 3, 10, 2, 1),
                                                       ('Rapper2', 'Nick2', 5, 8, 1, 0),
                                                       ('Rapper3', 'Nick3', 7, 15, 4, 2),
                                                       ('Rapper4', 'Nick4', 2, 5, 0, 0),
                                                       ('Rapper5', 'Nick5', 4, 12, 3, 1),
                                                       ('Rapper6', 'Nick6', 6, 20, 5, 3),
                                                       ('Rapper7', 'Nick7', 8, 7, 2, 0),
                                                       ('Rapper8', 'Nick8', 1, 3, 0, 0),
                                                       ('Rapper9', 'Nick9', 10, 18, 6, 4),
                                                       ('Rapper10', 'Nick10', 9, 25, 7, 5);
