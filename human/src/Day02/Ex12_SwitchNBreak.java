package Day02;

import java.util.Scanner;

public class Ex12_SwitchNBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		// 입력받은 정수를 5로 나눈 나머지
		// 2보다 작으면 "*" 출력
		// 그렇지 않으면 "**" 출력
		// - switch
		// if 문으로 할시 > if(num % 5<) System.out.println("*)
		
						
			
		switch ( num % 5 ) {
		case 0:
		case 1:
			System.out.println("*");
			break;
//		case 2:
//		case 3:
//		case 4:System.out.println("**");
//		break;
	
		default:
			System.out.println("**");
			break;
		}
		
		
		
		sc.close();
	}

}
