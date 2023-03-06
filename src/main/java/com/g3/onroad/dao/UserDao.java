package com.g3.onroad.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.g3.onroad.entity.User;
@Repository
public interface UserDao extends JpaRepository<User,Integer> {

	@Query(value="SELECT * FROM User WHERE mobile=:mobile AND password=:password",nativeQuery=true)
	 User fetchUser(long mobile,String password);
	
	User findByEmail(String email);

	User findByUserId(int userId);

	User findByMobile(long mobile);

}
