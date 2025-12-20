package com.nhat.QuizApplication.service;

import com.nhat.QuizApplication.dao.QuestionDao;
import com.nhat.QuizApplication.dao.Quiz;
import com.nhat.QuizApplication.dao.QuizDao;
import com.nhat.QuizApplication.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    private QuizDao quizDao;

    @Autowired
    private QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
        List<Question> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setQuestions(questions);
        quiz.setTitle(title);
        quizDao.save(quiz);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }
}
