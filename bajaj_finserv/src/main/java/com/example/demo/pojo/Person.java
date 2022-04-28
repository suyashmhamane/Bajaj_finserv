package com.example.demo.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	

	
	@Column(length = 30)
	private String is_success;
	@Column(length = 30)
	private String email;
	@Column(length = 30)
	private String user_id;
	@Column(length = 10)
	private String roll_number;
	@Column(length = 30)
	private String numbers;
	@Column(length = 30)
	private String alphabets;
	
	
	
	public String getis_success() {
		return is_success;
	}
	public void setis_success(String is_success) {
		this.is_success = is_success;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getuser_id() {
		return user_id;
	}
	public void setuser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getroll_number() {
		return roll_number;
	}
	public void setroll_number(String roll_number) {
		this.roll_number = roll_number;
	}
	public String getnumbers() {
		return numbers;
	}
	public void setnumbers(String numbers) {
		this.numbers = numbers;
	}
	public String getalphabets() {
		return alphabets;
	}
	public void setalphabets(String alphabets) {
		this.alphabets = alphabets;
	}
	

	

}
