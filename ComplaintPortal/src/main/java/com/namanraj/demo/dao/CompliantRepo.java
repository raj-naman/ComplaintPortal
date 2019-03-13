package com.namanraj.demo.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.namanraj.demo.model.Complaint;

public interface CompliantRepo extends JpaRepository<Complaint , Integer> 
{
	List<Complaint> findByCtype(String ctype);
	
	@Query(value = "SELECT * FROM complaint t WHERE t.ctype = 'mess'", nativeQuery=true)
	List<Complaint> findByFcom();
	
	@Query(value = "SELECT * FROM complaint t WHERE t.ctype = 'sac'", nativeQuery=true)
	List<Complaint> findBySac();
	
	@Query(value = "SELECT * FROM complaint t WHERE t.ctype = 'sac'", nativeQuery=true)
	List<Complaint> findByWarden();
	
	@Query(value = "SELECT * FROM complaint t WHERE t.ctype = 'sport'", nativeQuery=true)
	List<Complaint> findByScom();
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "UPDATE complaint t set t.status = ?1 , t.message = ?2 WHERE t.id=?3 ", nativeQuery=true)
	int updateComplaint(String status , String message ,  int id);


}
