package org.Super.day09.member.controller;

import java.util.ArrayList;
import java.util.List;

import org.Super.day09.member.model.Member;

public class MemberController {
	//Member List를 저장소로 가지고 있으며 추가, 수정, 삭제, 출력하는 메소드 작성
	//addMember, updateMember, deleteMember, findMember, findAllMember
	List<Member> memberList = new ArrayList<Member>();
	
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	public boolean updateMember(String memberId, String newPassword, String newEmail, String newPhoneNumber) {
	    for (Member member : memberList) {
	        if (member.getMemberID().equals(memberId)) {
	            // 해당 아이디를 가진 회원을 찾음
	            // 업데이트할 정보로 회원 객체를 수정
	            member.setmemberPw(newPassword);
	            member.setmemberEmail(newEmail);
	            member.setmemberPhone(newPhoneNumber);
	            return true;
	        }
	    }
	    return false;
	}
	
	public void deleteMember(Member member) {
		memberList.remove(member);
	}
	
	public Member findMember(String memberID) {
		for (Member member : memberList) {
	        if (member.getMemberID().equals(memberID)) {
	            // 해당 아이디를 가진 회원을 찾음
	            return member;
	        }
	    }
	    // 찾지 못한 경우
	    return null;
	}
	
	public List<Member> findAllMember() {
		return memberList;
	}
}
