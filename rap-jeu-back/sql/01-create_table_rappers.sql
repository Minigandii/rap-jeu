CREATE TABLE rapper (
                        id SERIAL PRIMARY KEY,
                        name VARCHAR(255) NOT NULL,
                        nickname VARCHAR(255),
                        nb_album INT,
                        nb_feat INT,
                        nb_gold_disc INT,
                        nb_platinum_disc INT
);