package Day05;

import java.util.Scanner;

/*
  		######### 메 뉴 판 ##########
  		1. 교촌 치킨 - 허니콤보 치킨
  		2. 처갓집 - 양념 치킨
  		3. 굿후렌드 - 후라이드 치킨
  		4. 후라이드잘하는집 - 후라이드 치킨
  		5. 보드람 - 후라이드 치킨
  		6. 굽네치킨 - 볼케이노
  		7. BBQ - 황금올리브 반반 치킨
  		0. 종료
  		########## 입력 : 
  		
  		메뉴 번호에 따라 메뉴 변수에 해당하는 메뉴를 저장해주고,
  		"(해당메뉴) 이 주문되었습니다." 라고 출력하시오.
  		0을 입력하기 전까지 반복하고,
  		0을 입력하면 반복을 종료합니다.
  		종료 시, "?개의 주문을 완료합니다." 라고 출력하시오.
 */
public class Ex05_method_ChickenMenu2 {

	public static void main(String[] args) {
		
		// 변수 선언
		int menuNo = 0;			// 메뉴번호
		String menuName = "";	// 메뉴이름
		int count = 0;			// 주문개수
		
		Scanner sc = new Scanner(System.in);
		
		do { 
		
			// *메소드 호출
			//  메소드명( 인자1, 인자2 );
			// 메뉴판 출력
			System.out.println("########## 메 뉴 판 ##########");
			System.out.println("1.교촌 치킨 - 허니콤보 치킨");
			System.out.println("2. 처갓집 - 양념 치킨");
			System.out.println("3. 굿후렌드 - 후라이드 치킨");
			System.out.println("4. 후라이드잘하는집 - 후라이드 치킨");
			System.out.println("5. 보드람 - 후라이드 치킨");
			System.out.println("6. 굽네치킨 - 볼케이노");
			System.out.println("7. BBQ - 황금올리브 반반 치킨");
			System.out.println("0. 종료");
			System.out.print("########## 입력 : ");
			
			menuNo = sc.nextInt();
			// 종료 조건
			if (menuNo == 0)  break;
			
			// 메뉴 선택
			switch (menuNo) {
			case 1: menuName = "교촌치킨 - 허니콤보 치킨"; break;
			case 2: menuName = "처갓집 - 양념 치킨"; break;
			case 3: menuName = "굿후렌드 - 후라이드 치킨"; break;
			case 4: menuName = "후라이드잘하는집 - 후라이드 치킨"; break;
			case 5: menuName = "보드람 - 후라이드 치킨"; break;
			case 6: menuName = "굽네치킨 - 볼케이노"; break;
			case 7: menuName = "BBQ - 황금올리브 반반 치킨"; break;
			default : menuName = "종료"; break;
			}
			// 주문 메세지
			// 유효성 검사
			// - 메뉴번호는 0~7번까지만 가능
			if(menuNo >= 0 && menuNo <= 7) {
			System.out.println(menuName + "(이/가) 주문되었습니다.");
			count++;
			}
			else {
				System.out.println("0~7번 사이의 정수를 입력해주세요.");
			}
		} while (true);							
		
		// 주문 완료 메세지
		System.out.println(count + " 개의 주문을 완료하였습니다.");
		sc.close();
	}

}
