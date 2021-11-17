package com.springmvc6;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;  


public class Customer {  
  
	@Size(min=1,max=20) 
    private String name; 
	
	@NotEmpty
	@Email
    private String email; 
	
	@Size(min=10,message="important")
    private String contact; 
	
	@Size(min=1,message="Which city")
    private String city; 
	
	@Size(min=6,message="required")
    private String pass;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}  
      
}