package com.g3.onroad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.g3.onroad.entity.Request;

@Repository
public interface RequestDao extends JpaRepository<Request, String> {

}
