CREATE TABLE answer (
                        id SERIAL PRIMARY KEY,
                        answer_text_question VARCHAR(255) NOT NULL,
                        good_answer BOOLEAN,
                        question_id BIGINT,
                        FOREIGN KEY (question_id) REFERENCES question(id)
);