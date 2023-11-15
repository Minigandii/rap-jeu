CREATE TABLE question (
                          id SERIAL PRIMARY KEY,
                          question_text VARCHAR(255) NOT NULL,
                          photo VARCHAR(255),
                          point INT,
                          type VARCHAR(255)
);

INSERT INTO question (question_text, photo, point, type) VALUES
                                                             ('Question1?', NULL, 10, 'Multiple Choice'),
                                                             ('Question2?', 'photo2.jpg', 15, 'True/False'),
                                                             ('Question3?', 'photo3.jpg', 8, 'Multiple Choice'),
                                                             ('Question4?', NULL, 12, 'True/False'),
                                                             ('Question5?', 'photo5.jpg', 20, 'Multiple Choice'),
                                                             ('Question6?', 'photo6.jpg', 5, 'True/False'),
                                                             ('Question7?', NULL, 15, 'Multiple Choice'),
                                                             ('Question8?', 'photo8.jpg', 10, 'True/False'),
                                                             ('Question9?', 'photo9.jpg', 18, 'Multiple Choice'),
                                                             ('Question10?', NULL, 25, 'True/False');
