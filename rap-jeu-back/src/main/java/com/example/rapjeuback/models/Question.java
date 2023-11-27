package com.example.rapjeuback.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_text")
    private String questionText;

    private String photo;

    @Column(name = "point")
    private int point;

    private String type;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Answer> answers;



    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", questionText='" + questionText + '\'' +
                ", photo='" + photo + '\'' +
                ", point=" + point +
                ", type='" + type + '\'' +
                '}';
    }

    public Question() {
        // Default constructor
    }

    // Getter and Setter for the 'id' field
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for the 'questionText' field
    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    // Getter and Setter for the 'photo' field
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    // Getter and Setter for the 'point' field
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    // Getter and Setter for the 'type' field
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static final class QuestionBuilder {
        private Long id;
        private String questionText;
        private String photo;
        private int point;
        private String type;

        private QuestionBuilder() {
        }

        public static QuestionBuilder aQuestion() {
            return new QuestionBuilder();
        }

        public QuestionBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public QuestionBuilder withQuestionText(String questionText) {
            this.questionText = questionText;
            return this;
        }

        public QuestionBuilder withPhoto(String photo) {
            this.photo = photo;
            return this;
        }

        public QuestionBuilder withPoint(int point) {
            this.point = point;
            return this;
        }

        public QuestionBuilder withType(String type) {
            this.type = type;
            return this;
        }

        public Question build() {
            Question question = new Question();
            question.setId(id);
            question.setQuestionText(questionText);
            question.setPhoto(photo);
            question.setPoint(point);
            question.setType(type);
            return question;
        }
    }
    public List<Answer> getAnswers() {
        return answers;
    }
}
