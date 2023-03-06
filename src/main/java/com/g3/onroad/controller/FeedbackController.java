package com.g3.onroad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g3.onroad.dto.UserFeedbackDetails;
import com.g3.onroad.entity.Feedback;
import com.g3.onroad.exception.InvalidUserRoleException;
import com.g3.onroad.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
@CrossOrigin("http://localhost:4200")
public class FeedbackController {
	
	@Autowired
	private FeedbackService feedbackService;
	

	@PostMapping("/saveFeedback")
	public ResponseEntity<?> saveFeedback(@RequestBody Feedback feedback) throws InvalidUserRoleException {
		ResponseEntity<?> entity = null;
		int userfeedbackId = feedbackService.saveFeedback(feedback);
		if (userfeedbackId !=0) {
			entity = new ResponseEntity<String>("feedback saved succesfully", HttpStatus.OK);
		} else{
			entity = new ResponseEntity<String>("something went wrong", HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	@GetMapping("/fetchfeedback")
	public List<UserFeedbackDetails> feedbackDetails() {
		return feedbackService.feedbackDetails();
	}
}
