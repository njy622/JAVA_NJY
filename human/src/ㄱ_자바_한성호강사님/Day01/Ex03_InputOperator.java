package ㄱ_자바_한성호강사님.Day01;

import java.util.Scanner;

public class Ex03_InputOperator {
	
	// main : ctrl + space
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("z : ");
		int z = sc.nextInt();
		
		// 합계, 평균
		int sum = x + y + z;
		int avg = sum / 3;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		// avg int(정수)형 변수라서 소수부분을 표현할 수 없다.
		// 평균을 소수점까지 표현하려면 실수형 변수를 사용해야한다.
		sc.close();
	}

}
