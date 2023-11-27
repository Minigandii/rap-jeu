package com.example.rapjeuback.DTO;

import com.example.rapjeuback.models.Answer;

public class AnswerDto {
    private Long id;
    private String answerTextQuestion;
    private boolean goodAnswer;

    // Vous pouvez également inclure d'autres propriétés si nécessaire

    public AnswerDto() {
        // Constructeur par défaut
    }

    public AnswerDto(Long id, String answerTextQuestion, boolean goodAnswer) {
        this.id = id;
        this.answerTextQuestion = answerTextQuestion;
        this.goodAnswer = goodAnswer;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // Méthode de conversion d'une entité Answer vers un DTO AnswerDto
    public static AnswerDto fromEntity(Answer answer) {
        AnswerDto answerDto = new AnswerDto();
        answerDto.setId(answer.getId());
        answerDto.setAnswerTextQuestion(answer.getAnswerTextQuestion());
        answerDto.setGoodAnswer(answer.isGoodAnswer());
        // Vous pouvez ajouter d'autres propriétés si nécessaire
        return answerDto;
    }
}