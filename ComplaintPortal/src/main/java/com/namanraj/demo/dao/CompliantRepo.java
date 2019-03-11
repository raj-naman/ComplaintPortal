package com.namanraj.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.namanraj.demo.model.Complaint;

public interface CompliantRepo extends CrudRepository<Complaint , Integer> 
{

}
