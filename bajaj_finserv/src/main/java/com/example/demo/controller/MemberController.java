package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Member;
import com.example.demo.pojo.Person;
import com.example.demo.service.MemberService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/bajaj")
public class MemberController {
	public MemberController() {
		// TODO Auto-generated constructor stub
		System.out.println("in cons of " + getClass());
	}

	@Autowired
	MemberService memberServicee;

	@GetMapping("/members")

	public ResponseEntity<List<Member>>  getAllMembers() {

		List<Member> list= memberServicee.getMembers();
		return new ResponseEntity<List<Member>>(list,HttpStatus.OK);

	}

	@PostMapping("/members")

	public ResponseEntity<Person> addMember(@RequestBody Member newMember) {

		Person p = memberServicee.addMember(newMember);
		return new ResponseEntity<Person>(p,HttpStatus.CREATED);

	}

	
	/*  @GetMapping("/members/{id}")
	  
	  public ResponseEntity<Member> getMemberById(@PathVariable int id) 
	  {
		  Member mem = memberServicee.getOneMember(id);
		  return new ResponseEntity<Member>(mem,HttpStatus.OK);
	  
	  }
	 
	  @PutMapping("/members")
	  public ResponseEntity<String>  updateMember(@RequestBody Member newMember)
	  {
		  String str = memberServicee.updateMember(newMember);
		  return new ResponseEntity<String>(str,HttpStatus.OK);
		  
		  
	  }

	  @DeleteMapping("/members/{id}")
	  public ResponseEntity<String> deleteMember(@PathVariable Integer id)
	  {
		  String str = memberServicee.deleteMember(id);
		  return new ResponseEntity<String>(str,HttpStatus.OK);
	  }
	  */
	  
}
