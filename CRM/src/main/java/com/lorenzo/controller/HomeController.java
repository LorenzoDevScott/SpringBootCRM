package com.lorenzo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lorenzo.models.Ticket;
import com.lorenzo.repo.TicketRepo;

@Controller
public class HomeController {
	
	@Autowired
	TicketRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/createTicket")
	public String createTicket(Ticket ticket) {
		repo.save(ticket);
		return "home.jsp";
	}
	
	@RequestMapping("/getTicket")
	public ModelAndView getTicket(@RequestParam int tid) {
		ModelAndView mv = new ModelAndView("showTicket.jsp");
		Ticket ticket = repo.findById(tid).orElse(new Ticket());
		System.out.println(repo.findByRepairType("TBD"));
		mv.addObject(ticket);
		return mv;
	}
}
