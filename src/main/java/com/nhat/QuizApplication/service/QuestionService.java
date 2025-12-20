package com.nhat.QuizApplication.service;


import com.nhat.QuizApplication.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepo questionRepo;

    public String getAllQuestions() {
        return questionRepo.findAll();
    }
}
