package com.dao;

import java.util.List;
import java.util.Map;

import com.dto.Member;

public interface MemberDao {
	Member memberLogin(String memberId);
	int memberEnroll(Member m);
	int checkId(String memberId);
	int memberUpdate(Member m);
	int memberWithdrawal(String memberNo);
	int memberPwdUpdate(Member m);
	String memberIdFind(String memberEmail);
	Member memberFind(Map<String,String> findMember);
	int memberNewPwdUpdate(Map<String,String> cP);
	int checkEmail(String memberEmail);

	int changeProfile(Member m);
	
	Member memberEmailFind(String memberEmail);

}
