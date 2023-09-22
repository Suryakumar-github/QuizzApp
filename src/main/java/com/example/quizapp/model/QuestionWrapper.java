package com.example.quizapp.model;

import lombok.Data;

@Data
public class QuestionWrapper {
    private Integer id;
    private String QuestionTitle;
    private String option1;
    private String Option2;
    private String Option3;
    private String Option4;

    public QuestionWrapper(Integer id, String questionTitle, String option1, String option2, String option3, String option4) {
        this.id = id;
        QuestionTitle = questionTitle;
        this.option1 = option1;
        Option2 = option2;
        Option3 = option3;
        Option4 = option4;
    }
}

