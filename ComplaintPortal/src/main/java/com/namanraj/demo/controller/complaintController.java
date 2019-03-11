package com.namanraj.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.namanraj.demo.dao.CompliantRepo;
import com.namanraj.demo.model.Complaint;

@RestController
public class complaintController 
{
	@Autowired
	CompliantRepo repo;
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("complaint.jsp");
		return mv;
	}
	
	@PostMapping("/addComplaint")
	//@JsonFormat(shape=JsonFormat.Shape.ARRAY)

	public Complaint addComplaint(@RequestBody Complaint complaint) {
		repo.save(complaint);
		return complaint;
	}
	
	@GetMapping(path="/complaints")
	public List<Complaint> getComplaints() {
		return (List<Complaint>) repo.findAll();
	}

}
