package com.namanraj.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	/*--------- View and add status in Food Complaint ---------------*/
	
	@GetMapping("/foodcomplaint/{compid}")
	//@ResponseBody
	public ModelAndView foodComplaint(@PathVariable("compid") int compid) {

		Complaint complaint = repo.findById(compid).orElse(new Complaint());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewComplaint.jsp");
		mv.addObject("complaint" , complaint);
		return mv;
	}
	
	@GetMapping("foodcomplaint/view/{compid}")
	//@ResponseBody
	public ModelAndView updateFoodComplaint(@PathVariable("compid") int compid , @RequestParam("status") String status ,
			@RequestParam("message") String message) {

		int id = repo.updateComplaint(status , message , compid);
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("redirect:/fcomplist");
		return mv;
	}
	
	/*--------- View and add status in Sac Complaint ---------------*/

	
	@GetMapping("/saccomplaint/{compid}")
	//@ResponseBody
	public ModelAndView sacComplaint(@PathVariable("compid") int compid) {

		Complaint complaint = repo.findById(compid).orElse(new Complaint());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sacComplaint.jsp");
		mv.addObject("complaint" , complaint);
		return mv;
	}
	
	@GetMapping("saccomplaint/view/{compid}")
	//@ResponseBody
	public ModelAndView updateSacComplaint(@PathVariable("compid") int compid , @RequestParam("status") String status ,
			@RequestParam("message") String message) {

		int id = repo.updateComplaint(status , message , compid);
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("redirect:/saccomplist");
		return mv;
	}
	
	/*--------- View and add status in Warden Complaint ---------------*/

	
	@GetMapping("/wardencomplaint/{compid}")
	//@ResponseBody
	public ModelAndView wardenComplaint(@PathVariable("compid") int compid) {

		Complaint complaint = repo.findById(compid).orElse(new Complaint());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("wardenComplaint.jsp");
		mv.addObject("complaint" , complaint);
		return mv;
	}
	
	@GetMapping("wardencomplaint/view/{compid}")
	//@ResponseBody
	public ModelAndView updateWardenComplaint(@PathVariable("compid") int compid , @RequestParam("status") String status ,
			@RequestParam("message") String message) {

		int id = repo.updateComplaint(status , message , compid);
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("redirect:/wardencomplist");
		return mv;
	}
	
	/*--------- View and add status in Sports Complaint ---------------*/

	
	@GetMapping("/sportcomplaint/{compid}")
	//@ResponseBody
	public ModelAndView sportComplaint(@PathVariable("compid") int compid) {

		Complaint complaint = repo.findById(compid).orElse(new Complaint());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sportComplaint.jsp");
		mv.addObject("complaint" , complaint);
		return mv;
	}
	
	@GetMapping("sportcomplaint/view/{compid}")
	//@ResponseBody
	public ModelAndView updateSportComplaint(@PathVariable("compid") int compid , @RequestParam("status") String status ,
			@RequestParam("message") String message) {

		int id = repo.updateComplaint(status , message , compid);
		ModelAndView mv = new ModelAndView();
	    mv.setViewName("redirect:/sportscomplist");
		return mv;
	}
	
}
	