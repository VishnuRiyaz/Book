package com.Project.Book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Project.Book.model.Bookshop;
import com.Project.Book.service.Bookservice;




@Controller
public class Bookcontroller {
	
   @Autowired
   private Bookservice service;
   @GetMapping("/index")
	public String home() {
		return "index";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/book")
	public String blog() {
		return "book";
	}
	@GetMapping("/contact")
	public String shop() {
		return "contact";
	}
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	@PostMapping("/save")
	public String Addsaree(@ModelAttribute Bookshop s) {
		service.save(s);
		return "redirect:/index";
	}
	@GetMapping("/shop")
	public ModelAndView getAllShop() {
		List<Bookshop>list=service.getAllShop();
		return new ModelAndView("booklist","shop",list);
	}
	@PostMapping("/list")
	public String addBook(@ModelAttribute Bookshop b) {
		service.getAllShop();
		return "redirect:/shop";
	}
	
	@RequestMapping("/deleteBook/{name}")
	public String deleteBook(@PathVariable("name")int id) {
		service.deletecode(id);
		return "redirect:/index";
	}
	
}
