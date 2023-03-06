package com.g3.onroad.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.g3.onroad.dto.UserFeedbackDetails;
import com.g3.onroad.entity.Feedback;
@Service
public interface FeedbackService {

	int saveFeedback(Feedback feedback);
	
	List<UserFeedbackDetails> feedbackDetails();
}
