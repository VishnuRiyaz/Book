package com.Project.Book.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bookshop {
	@Id
	
	int id;
	String name;
	String phone;
	String email;
	String message;
	 	public Bookshop(int id,String name,String phone,String email,String message) {
	 		this.id=id;
	 		this.name=name;
	 		this.phone=phone;
	 		this.email=email;
	 		this.message=message;
	 	}
	 	public Bookshop() {
	 		super();
	 	}
	 	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
	 	

}

