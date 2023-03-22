package com.project.naeil.member.dao;

import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.project.naeil.member.vo.MemberVO;

public interface MemberDAO {
	//로그인
	public MemberVO login(Map loginMap) throws DataAccessException;
	//회원가입
	public void insertNewMember(MemberVO memberVO) throws DataAccessException;
	//아이디 중복검사
	public String selectOverlappedID(String id) throws DataAccessException;
	
	//카카오 이메일 검사
	public String checkEmail(String kakaoNewEmail) throws DataAccessException;
	
	public MemberVO email(String kakaoNewEmail) throws DataAccessException;
	
}
