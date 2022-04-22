package com.ja.finalproject.member.mapper;

import com.ja.finalproject.vo.MemberVo;

public interface MemberSQLMapper {
	
	//return 타입 : insert,update,delete - void , select - Vo
	
	public void joinMember(MemberVo vo); //insert...
	public MemberVo getMemberByIdAndPw(MemberVo abc); //select...
	
	public MemberVo getMemberByNo(int no);
	
}
