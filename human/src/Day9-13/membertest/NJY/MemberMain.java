package classex.membertest.NJY;

import java.util.Scanner;

	public class MemberMain {
		static Scanner sc = new Scanner(System.in);
		
		public static void showMenu() {
			 System.out.println("1.회원입력\n2.회원조회\n3.회원삭제\n4.회원변경\n5.전체출력\n6.종료");
			 System.out.print("메뉴선택: ");
		}
		public static void main(String[] args) {
			int sel =0;				//지역변수 (중괄호 바깥으로 나올 수 없다)
			while(true) {
				showMenu();
				//입력받기
				sel = sc.nextInt();
				switch(sel) {
				case 1 : 
					Memberservice.inputData();	// 해당 데이터는 서비스 클래스에 있음 /static일때 클래스명을 표시함! 클래스명  표시되어있으면 static!
				break;
				
				case 2 :
					Memberservice.searchData();
//					System.out.println("회원조회");
				break;
				
				case 3 : 
					Memberservice.deleteData();
//					System.out.println("회원삭제");
				break;
				
				case 4 : 
					Memberservice.upData();
//					System.out.println("회원변경");
				break;
				
				case 5 : 
					Memberservice.totalData();
//					System.out.println("전체조회");
				break;
				
				case 6:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					
					sc.close();
					
				}
			}
		}
	

			
		}