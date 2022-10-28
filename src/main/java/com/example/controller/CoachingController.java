package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.form.CoachingForm;

@Controller
@RequestMapping
public class CoachingController {

	//Q1-1
	@GetMapping("/index")
	public String index(@RequestParam("food") String food
						,@RequestParam("drink") String drink
						,Model model)
	{
		model.addAttribute("food", food);
		model.addAttribute("drink", drink);

		return "index";
	}


	//Q2-2
	@GetMapping("/form/{routeParam}")
	public String form (@PathVariable String routeParam
						,CoachingForm coachingForm,Model model)
	{
		return "form";
	}


	//Q3-1
    @PostMapping("/create")
    public String create(CoachingForm coachingForm,Model model) {
    	model.addAttribute("data", coachingForm.getData());
        return "complete";
    }


}
