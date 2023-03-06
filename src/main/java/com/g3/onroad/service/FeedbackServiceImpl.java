package com.g3.onroad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g3.onroad.dao.FeedbackDao;
import com.g3.onroad.dto.UserFeedbackDetails;
import com.g3.onroad.entity.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDao fDao;
	
	@Override
	public int saveFeedback(Feedback feedback) {
		Feedback feedbackId = fDao.save(feedback);
		return feedbackId.getFeedbackId();
	}

	@Override
	public List<UserFeedbackDetails> feedbackDetails() {
		
		List<Object[]> feedbacklist = fDao.fetchfeedbackdata();
		List<UserFeedbackDetails> list = new ArrayList<UserFeedbackDetails>();
		for(Object[] ob:feedbacklist) {
			UserFeedbackDetails userDetails = new UserFeedbackDetails();
			userDetails.setName((String) ob[0]);
			userDetails.setFeedback((String) ob[1]);
			userDetails.setUserType((String) ob[2]);
			userDetails.setFid((int) ob[3]);
			list.add(userDetails);
			
		}
		return list;
	}

}
