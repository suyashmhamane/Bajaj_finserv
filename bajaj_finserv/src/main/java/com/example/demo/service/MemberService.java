package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Member;

public interface MemberService {

	public List<Member> getMembers();
	public Member addMember(Member member);
	//public Member getOneMember(int id);
	//public String updateMember(Member newMember);
	//public String deleteMember(Integer id);
}
