package com.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dto.Member;


@Repository
public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Override
	public int memberNewPwdUpdate(Map<String, String> cP) {
		return sqlSession.update("member.memberNewPwdUpdate", cP);
	}

	@Override
	public String memberIdFind(String memberEmail) {
		return sqlSession.selectOne("member.memberIdFind",memberEmail);
	}

	@Override
	public Member memberFind(Map<String, String> findMember) {
		return sqlSession.selectOne("member.memberFind",findMember);
	}

	@Override
	public Member memberLogin(String memberId) {
		return sqlSession.selectOne("member.login",memberId);
	}

	@Override
	public int memberEnroll(Member m) {
		return sqlSession.insert("member.insertMember",m);
	}


	@Override
	public int checkId(String memberId) {
		return sqlSession.selectOne("member.checkId", memberId);
	}

	@Override
	public int memberUpdate(Member m) {
		return sqlSession.update("member.memberUpdate",m);
	}

	@Override
	public int memberWithdrawal(String memberNo) {
		return sqlSession.update("member.memberWithdrawal",memberNo);
	}



	@Override
	public int memberPwdUpdate(Member m) {
		return sqlSession.update("member.memberPwdUpdate",m);
	}


	@Override
	public int checkEmail(String memberEmail) {
		return sqlSession.selectOne("member.checkEmail", memberEmail);
	}

	@Override
	public int changeProfile(Member m) {
		return sqlSession.update("member.changeProfile", m);
	}
	
	@Override
	public Member memberEmailFind(String memberEmail) {
		return sqlSession.selectOne("member.memberEmailFind", memberEmail);
	}
}
