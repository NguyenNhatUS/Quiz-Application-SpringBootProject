package com.nhat.QuizApplication.dao;

import com.nhat.QuizApplication.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT * FROM Question q WHERE q.category = :category", nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);
}
