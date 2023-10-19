package com.Project.Book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.Book.dao.BookRepo;
import com.Project.Book.model.Bookshop;


@Service
public class Bookservice {
	@Autowired
	private BookRepo brepo;
	public void save(Bookshop s) {
		brepo.save(s);
	}
	
	public List<Bookshop> getAllShop(){
		return brepo.findAll();
	}

	public void deletecode(int id) {
		brepo.deleteById(id);
	}
	public Bookshop update(int id) {
		return brepo.findById(id).get();
		
	}
	
}
