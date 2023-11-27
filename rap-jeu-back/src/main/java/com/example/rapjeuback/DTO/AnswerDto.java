package com.example.rapjeuback.DTO;

import com.example.rapjeuback.models.Answer;

public class AnswerDto {
    private Long id;
    private String answerTextQuestion;
    private boolean goodAnswer;

    private int question;

    public AnswerDto() {
    }

    public AnswerDto(String answerTextQuestion, boolean goodAnswer, int question) {
        this.answerTextQuestion = answerTextQuestion;
        this.goodAnswer = goodAnswer;
        this.question = question;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuestion() {
        return question;
    }

    public String getAnswerTextQuestion() {
        return answerTextQuestion;
    }

    public void setAnswerTextQuestion(String answerTextQuestion) {
        this.answerTextQuestion = answerTextQuestion;
    }

    public boolean isGoodAnswer() {
        return goodAnswer;
    }

    public void setGoodAnswer(boolean goodAnswer) {
        this.goodAnswer = goodAnswer;
    }

    public static AnswerDto fromEntity(Answer answer) {
        AnswerDto answerDto = new AnswerDto();
        answerDto.setId(answer.getId());
        answerDto.setAnswerTextQuestion(answer.getAnswerTextQuestion());
        answerDto.setGoodAnswer(answer.isGoodAnswer());
        return answerDto;
    }
}