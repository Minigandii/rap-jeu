CREATE TABLE question (
                          id SERIAL PRIMARY KEY,
                          question_text VARCHAR(255) NOT NULL,
                          photo VARCHAR(255),
                          point INT,
                          type VARCHAR(255)
);
