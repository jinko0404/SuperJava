package org.Super.day09.member.view;

import java.util.List;
import java.util.Scanner;

import org.Super.day09.member.controller.MemberController;
import org.Super.day09.member.model.Member;

public class MemberView {
	MemberController mController;

	public MemberView() {
		mController = new MemberController();
	}
	
	public void startProgram() {
		end:
		while(true) {
			int choice = printMenu();
			switch(choice) {
			case 1 : 
				this.inputMember();
				break;
			case 2 : 
				this.modifyMember();
				break;
			case 3 : 
				this.removeMember();
				break;
			case 4 : 
				this.printOneMember();
				break;
			case 5 : 
				this.printAllmembers();
				break;
			case 6 : 
				System.out.println("프로그램이 종료되었습니다.");
				break end;
			default : 
				System.out.println("1 ~ 6 사이의 수를 입력해주세요.");
				break;
			}
		}
	}
	public int printMenu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		//============회원 관리 프로그램============
		System.out.println("============회원 관리 프로그램============");
		//1. 회원 정보 등록
		System.out.println("1. 회원 정보 등록");
		//2. 회원 정보 수정
		System.out.println("2. 회원 정보 수정");
		//3. 회원 정보 삭제
		System.out.println("3. 회원 정보 삭제");
		//4. 회원 정보 출력(이름)
		System.out.println("4. 회원 정보 출력(이름)");
		//5. 회원 전체 정보 출력
		System.out.println("5. 회원 전체 정보 출력");
		//6. 프로그램 종료
		System.out.println("6. 프로그램 종료");
		//선택 : 1
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void inputMember() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		//=====회원 정보 등록=====
		System.out.println("=====회원 정보 등록=====");
		//아이디 : khuser01
		System.out.print("아이디 : ");
		member.setMemberID(sc.next());
		//비밀번호 : pass01
		System.out.print("비밀번호 : ");
		member.setmemberPw(sc.next());
		//이름 : 홍길동
		System.out.print("이름 : ");
		member.setmemberName(sc.next());
		//이메일 : khuser01@kh.com
		System.out.print("이메일 : ");
		member.setmemberEmail(sc.next());
		//전화번호 : 01012341234
		System.out.print("전화번호 : ");
		member.setmemberPhone(sc.next());
		//정보를 저장중입니다...
		System.out.println("정보를 저장중입니다...");
		//저장완료!
		System.out.println("저장완료!");
		mController.addMember(member);
	}
	
	public void modifyMember() {
		
		Member m = new Member();
		Scanner sc = new Scanner(System.in);
		//=====회원 정보 수정=====
		System.out.println("=====회원 정보 수정=====");
		//아이디를 입력해주세요 : khuser01
		System.out.print("아이디를 입력해주세요 : ");
		String MemberID = sc.next();
		m = mController.findMember(MemberID);
		if(m != null) {
			//수정할 정보를 입력해주세요
			System.out.println("수정할 정보를 입력해주세요");
			//비밀번호 : pass11
			System.out.println("비밀번호 : ");
			String newPW = sc.next();
			//이메일 : khuser01@naver.com
			System.out.println("이메일 : ");
			String newEmail = sc.next();
			//전화번호 : 01012341234
			System.out.println("전화번호 : ");
			String newPhone = sc.next();
			//정보를 수정중입니다...
			System.out.println("정보를 수정중입니다...");
			mController.updateMember(MemberID, newPW, newEmail, newPhone);
			//수정완료!
			System.out.println("수정완료!");
		}
		else {
			System.out.println("회원 정보가 존재하지 않습니다.");
		}
		
		//=====회원 정보 수정=====
		//아이디를 입력해주세요 : khuser01
		//회원정보가 존재하지 않습니다.
	}
	
	public void removeMember() {
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		//=====회원 정보 삭제=====
		System.out.println("=====회원 정보 삭제=====");
		//삭제할 회원의 아이디를 입력해주세요 : khuser01
		System.out.print("삭제할 회원의 아이디를 입력해주세요 : ");
		String MemberID = sc.next();
		m = mController.findMember(MemberID);
		if(m != null) {
			System.out.println("정보를 삭제중입니다...");
			mController.deleteMember(m);
			System.out.println("삭제완료!");
		}
		else {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
		//정보를 삭제중입니다...
		//삭제완료!
		
		//=====회원 정보 삭제=====
		//삭제할 회원의 아이디를 입력해주세요 : khuser01
		//회원정보가 존재하지 않습니다.
	}
	
	public void printOneMember() {
		Scanner sc = new Scanner(System.in);
		Member m = new Member();
		//======회원 정보 출력(아이디)======
		System.out.println("======회원 정보 출력(아이디)======");
		//검색할 회원 아이디를 입력해주세요 : khuser01
		System.out.println("검색할 회원 아이디를 입력해주세요 : ");
		String MemberID = sc.next();
		m = mController.findMember(MemberID);
		if(m != null) {
			System.out.println("아이디 : " + m.getMemberID() + ", 이름 : " + m.getmemberName() + ", 이메일 : " + m.getmemberEmail()
			+ ", 폰번호 : " + m.getmemberPhone());
		}
		else {
			System.out.println("회원 정보를 찾을 수 없습니다.");
		}
		//아이디 : khuser01, 이름 : 홍길동, 이메일 : khuser01@naver.com, 폰번호 : 01012341234
	}
	
	public void printAllmembers() {
		List<Member> member = mController.findAllMember();
		System.out.println("======회원 전체 정보 출력======");
		for(int i = 0; i < member.size(); i++) {
			System.out.println("아이디 : " + member.get(i).getMemberID() + ", 이름 : " + member.get(i).getmemberName() + ", 이메일 : " + member.get(i).getmemberEmail()
			+ ", 폰번호 : " + member.get(i).getmemberPhone());
		}
		//======회원 전체 정보 출력======
		//아이디 : khuser01, 이름 : 홍길동, 이메일 : khuser01@naver.com, 폰번호 : 01012341234
		//아이디 : khuser02, 이름 : 일용자, 이메일 : khuser02@naver.com, 폰번호 : 01012351235
		//아이디 : khuser03, 이름 : 이용자, 이메일 : khuser03@naver.com, 폰번호 : 01012361236
		//아이디 : khuser04, 이름 : 삼용자, 이메일 : khuser04@naver.com, 폰번호 : 01012371237
		//아이디 : khuser05, 이름 : 사용자, 이메일 : khuser05@naver.com, 폰번호 : 01012381238
		//아이디 : khuser06, 이름 : 오용자, 이메일 : khuser06@naver.com, 폰번호 : 01012391239
	}

}






