package com.example.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.cdi.Eager;

@Data
@Entity

public class Questions
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(insertable = false, updatable = false)


    @jakarta.persistence.Id
    private Integer id;
    private String QuestionTitle;
    private String option1;
    private String Option2;
    private String Option3;
    private String Option4;
    private String rightAnswer;
    private String category;
    private String difficultyLevel;



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
