package com.example.rapjeuback.DTO;

public class QuestionDto {
    private String questionText;
    private int point;
    private String photo;
    private String questionType;

    public QuestionDto(String questionText, int point, String photo, String questionType) {
        this.questionText = questionText;
        this.point = point;
        this.photo = photo;
        this.questionType = questionType;
    }

    public String getQuestionText() {
        return questionText;
    }

    public int getPoint() {
        return point;
    }

    public String getPhoto() {
        return photo;
    }

    public String getQuestionType() {
        return questionType;
    }
}
