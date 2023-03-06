package com.g3.onroad.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.g3.onroad.entity.Feedback;



@Repository
public interface FeedbackDao extends JpaRepository<Feedback,Integer> {
	@Query(value="select u.name,f.feedback,f.usertype,f.fid from feedback f inner join user_road u on f.uid=u.user_id;",nativeQuery=true)
	List<Object[]> fetchfeedbackdata();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
