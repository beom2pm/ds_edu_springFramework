package com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MemberDao;
import com.dto.Member;




@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDao dao;
	
	@Override
	public int memberNewPwdUpdate(Map<String, String> cP) {
		return dao.memberNewPwdUpdate(cP);
	}

	@Override
	public Member memberFind(Map<String, String> findMember) {
		return dao.memberFind(findMember);
	}

	@Override
	public String memberIdFind(String memberEmail) {
		return dao.memberIdFind(memberEmail);
	}

	@Override
	public Member memberLogin(String memberId) {
		return dao.memberLogin(memberId);
	}

	@Override
	public int memberEnroll(Member m) {
		return dao.memberEnroll(m);
	}


	@Override
	public int checkId(String memberId) {
		return dao.checkId(memberId);
	}

	@Override
	public int memberUpdate(Member m) {
		return dao.memberUpdate(m);
	}

	@Override
	public int memberWithdrawal(String memberNo) {
		return dao.memberWithdrawal(memberNo);
	}


	@Override
	public int memberPwdUpdate(Member m) {
		return dao.memberPwdUpdate(m);
	}


	@Override
	public int checkEmail(String memberEmail) {
		return dao.checkEmail(memberEmail);
	}

	@Override
	public int changeProfile(Member m) {
		return dao.changeProfile(m);
	}
	

	@Override
	public Member memberEmailFind(String memberEmail) {
		return dao.memberEmailFind(memberEmail);
	}

	
	
}
