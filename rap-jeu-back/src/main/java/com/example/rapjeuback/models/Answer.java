package com.example.rapjeuback.models;


import javax.persistence.*;

@Entity
@Table(name="answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "answer_text_question")
    private String answerTextQuestion;

    @Column(name = "good_answer")
    private boolean goodAnswer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Answer() {
        // Default constructor
    }

    // Getter and Setter for the 'id' field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for the 'answerTextQuestion' field
    public String getAnswerTextQuestion() {
        return answerTextQuestion;
    }

    public void setAnswerTextQuestion(String answerTextQuestion) {
        this.answerTextQuestion = answerTextQuestion;
    }

    // Getter and Setter for the 'goodAnswer' field
    public boolean isGoodAnswer() {
        return goodAnswer;
    }

    public void setGoodAnswer(boolean goodAnswer) {
        this.goodAnswer = goodAnswer;
    }

    // Getter and Setter for the relationship with the question
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}