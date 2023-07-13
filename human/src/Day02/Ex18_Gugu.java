package Day02;

import java.util.Scanner;

public class Ex18_Gugu {

	public static void main(String[] args) {
		// 구구단 ( 1~9단)
		// 원하는 단을 입력하여 아래와 같이 구구단 수식을 출력하시오.
		// 입력 : 3
		// 출력 
		// 3*1=3
		// 3*2=6
		// 3*3=9
		// ...
		//3*9=27
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 :");
		int input = sc.nextInt();
		//  int = 1;i<9
		// 9회 반복
		// (입력 단) X(반복변수:1~9)= 결과
		
		for (int i =1; i <= 9; i++) {
			int result = input * i;
			System.out.println(input + "*" + i + "=" + result );
			
		}
		sc.close();
				
	}
}
