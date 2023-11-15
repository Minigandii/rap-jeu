CREATE TABLE answer (
                        id SERIAL PRIMARY KEY,
                        answer_text_question VARCHAR(255) NOT NULL,
                        good_answer BOOLEAN,
                        question_id BIGINT,
                        FOREIGN KEY (question_id) REFERENCES question(id)
);

INSERT INTO answer (answer_text_question, good_answer, question_id) VALUES
                                                                        ('Answer1', true, 1),
                                                                        ('Answer2', false, 1),
                                                                        ('Answer3', true, 2),
                                                                        ('Answer4', false, 2),
                                                                        ('Answer5', true, 3),
                                                                        ('Answer6', false, 3),
                                                                        ('Answer7', true, 4),
                                                                        ('Answer8', false, 4),
                                                                        ('Answer9', true, 5),
                                                                        ('Answer10', false, 5);
