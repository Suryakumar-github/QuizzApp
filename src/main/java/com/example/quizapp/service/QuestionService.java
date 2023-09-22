package com.example.quizapp.service;

import com.example.quizapp.model.Questions;
import com.example.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService
{
    @Autowired
   QuestionDao questionDao;
    public ResponseEntity<List<Questions>> getAllQuestions() {
        try {
            return new ResponseEntity<>( questionDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>( new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity <List<Questions>>getQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<String> addQuestions(Questions questions)
    {
        questionDao.save(questions);
       try {
           return new ResponseEntity<>( "Question is Added Successfully",HttpStatus.CREATED);
       }catch (Exception e){
           e.printStackTrace();
       }
        return new ResponseEntity<>( "Question is not added",HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> updateQuestions(Questions questions) {
        questionDao.save(questions);
        try {
            return new ResponseEntity<>("Question is Updated",HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Question is Not Updated",HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> deleteQuestions(Integer id) {
        questionDao.deleteById(id);
        try {
            return new ResponseEntity<>("Question is Deleted",HttpStatus.ACCEPTED);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Question is Not Deleted",HttpStatus.BAD_REQUEST);
    }
}
