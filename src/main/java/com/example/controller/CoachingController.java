package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.form.CoachingForm;

@Controller
@RequestMapping
public class CoachingController {

	@GetMapping("/index")
    public String index(@RequestParam("food") String food
    	    ,@RequestParam("drinlk")String drinlk) {

    	//model.addAttribute("message",text);
    	return "index";
    }

	@GetMapping("/form/{routeParam}")
	public String form (@PathVariable Integer num, Model model)
	{
		CoachingForm coachingForm = new CoachingForm();
		model.addAttribute("coachingForm", coachingForm);
		return "coachingForm/data";
	}

    @PostMapping("/create")
    public String create(CoachingForm coachingForm) {
    	CoachingForm coachingForm
    	String date =
        return "";
    }

}
