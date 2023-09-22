package com.example.quizapp.dao;

import com.example.quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Questions, Integer>
{
   List<Questions> findByCategory(String category);

   @Query(value = "SELECT * FROM questions q where category=:category ORDER BY RAND() LIMIT :numQ",nativeQuery = true)
   List<Questions> findRandomQuestionsByCategory(String category, int numQ);
}
