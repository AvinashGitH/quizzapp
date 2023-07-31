package com.Quizz.quizapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Quizz.quizapp.service.QuestionService;

@RestController  /*accept the request and this controller will 
work with question controller only*/

@RequestMapping("/question") // we will mention the path , whatever request is coming for the controller it is handled

public class QuestionController {
	@Autowired
	QuestionService questionService;
@GetMapping("/allQuestions")
public String getAllQuestions() {
		return questionService.getAllQuestions();
	
}
}
