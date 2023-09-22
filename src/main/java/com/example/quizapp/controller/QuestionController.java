package com.example.quizapp.controller;

import com.example.quizapp.model.Questions;
import com.example.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Question")
public class QuestionController
{
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Questions>> getAllQuestions(){
        return  questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public  ResponseEntity<List<Questions>> getQuestionsByCategory(@PathVariable String category){
        return  questionService.getQuestionsByCategory(category);
    }
    @PostMapping("add")

    public ResponseEntity<String> addQuestions(@RequestBody Questions questions){
        return questionService.addQuestions(questions);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<String> updateQuestions(@RequestBody Questions questions, @PathVariable Integer id){
        return questionService.updateQuestions(questions);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteQuestions(@PathVariable Integer id){
        return questionService.deleteQuestions(id);
    }


}
