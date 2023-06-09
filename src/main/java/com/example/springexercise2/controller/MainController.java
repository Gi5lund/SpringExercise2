package com.example.springexercise2.controller;

import com.example.springexercise2.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController
	{
		@Autowired
		ItemService itemService;
		@GetMapping("/")
		public String home(Model model){
			model.addAttribute("items",itemService.fetchAllItems());
			return "index";
		}
	}
