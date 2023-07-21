package classex;

import java.awt.Checkbox;
import java.util.Scanner;



// 외부에서 요청 처리
public class Memberservice {
	static int max = 10;		// 게시글 최대 10개 제한
	static Member[] memberList = new Member[max];
	static Scanner sc = new Scanner(System.in);
	
	
	public static void inputData() {
		System.out.println("회원입력");
		System.out.println("ID:");
		String id = MemberMain.sc.next();
		System.out.println("PWD:");
		String pwd=MemberMain.sc.next();
		
		
		Member member = new Member(id,pwd);
		
		int index = getIndex();
		member.setMemberNo(index+1);
		
		if(index<max) {
			memberList[index] = member;
		System.out.println("#회원입력이 완료되었습니다.");			
		}
		else {
			System.out.println("회원 목록이 꽉찼습니다.");
		}
	
	}
	
	public static int getIndex() {
		int index = max;
		
		for (int i = 0; i < memberList.length; i++) {
			if(memberList[i] == null) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void searchData() {
		System.out.println("회원조회");
		System.out.print("회원 번호 :");
		int memberNo = MemberMain.sc.nextInt();
		
		if( check(memberNo) ) {
			return;
		}
		Member member = memberList[memberNo-1];
		if( member == null) {
			System.out.println("회원이 존재하지 않습니다.");
		}
		else {
			System.out.println(member);
		}
	
	}

		public static void deleteData() {
			System.out.println("회원삭제");
			
			System.out.println("삭제할 회원 번호: ");
			int memberNo = sc.nextInt();
			
			if(check(memberNo)) {
				return;
			}
			memberList[memberNo-1] = null;
			System.out.println("회원이 삭제되었습니다.");
		}
		public static boolean check(int memberNo) {
			if (memberNo <=0 || memberNo >max) {
				System.out.println("1~10명 까지만 입력가능합니다.");
				return true;
			}
			return false;
		}
	
	public static void upData() {
		System.out.print("수정할 회원 번호: ");
		int memberNo = sc.nextInt();
		sc.nextLine();
		if (check(memberNo)) {
			return;
		}
		if(memberList[memberNo-1]==null) {
			System.out.println("등록된 회원이 존재하지 않습니다.");
		return;
		}
		System.out.println("## 회원정보 변경");
		Member member = inputdata();
		
		String updataId = member.getId();
		String updataPwd = member.getPwd();
		
		memberList[memberNo-1].setId(updataId);
		memberList[memberNo-1].setPwd(updataPwd);
		System.out.println("# 회원정보가 변경되었습니다.");
		
		
	}

	private static Member inputdata() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void totalData() {
	System.out.println("#회원 관리 목록");
	for (Member member : memberList) {
		System.out.println(member);
		
	}
	}
}
