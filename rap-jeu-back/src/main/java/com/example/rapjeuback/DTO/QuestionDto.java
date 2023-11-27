package com.example.rapjeuback.DTO;

public class QuestionDto {
    private String questionText;
    private int point;
    private String photo;
    private String type;

    public QuestionDto(String photo, String questionText, int point, String type) {
        this.questionText = questionText;
        this.point = point;
        this.photo = photo;
        this.type = type;
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

    public String gettype() {
        return type;
    }
}
