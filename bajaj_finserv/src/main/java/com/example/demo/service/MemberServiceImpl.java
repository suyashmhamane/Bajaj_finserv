package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MemberRepo;
import com.example.demo.pojo.Member;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {
public MemberServiceImpl() {
	
	System.out.println("in cons of "+getClass());
}
	@Autowired
	MemberRepo member;
	
	@Override
	public List<Member> getMembers() {
		return member.findAll();
		
	}

	@Override
	public Member addMember(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public Member addMember(Member newMember) {
		// TODO Auto-generated method stub
		return member.save(newMember);
	}

	
	  @Override 
	  public Member getOneMember(int id) {
	  
	 Optional <Member> mem = member.findById(id);
	      Member mem1= null;
	      if(mem.isPresent())
	      {
	    	  mem1=mem.get();
	    	  return mem1;
	      }
	      else
	      {
	    	  System.out.println("member doesnt exist");
	    	  return null;
	      }
	  }

	@Override
	public String updateMember(Member newMember) {
	 
		Member mem=member.getById(newMember.getId());
	   if(mem!=null)
	   {
		   System.out.println("In put method");
		   mem.setAddress(newMember.getAddress());
		   mem.setEmail(newMember.getEmail());
		   mem.setMobile(newMember.getMobile());
		   mem.setName(newMember.getName());
		   mem.setPassword(newMember.getPassword());
		   member.save(mem);
		   return "member details updated";
         }
	   else
		return "member doesn't exist";
	}

	@Override
	public String deleteMember(Integer id) {
		Member mem=getOneMember(id);
		member.delete(mem);
		return " member deleted";
		 
	}
	*/
	

}
