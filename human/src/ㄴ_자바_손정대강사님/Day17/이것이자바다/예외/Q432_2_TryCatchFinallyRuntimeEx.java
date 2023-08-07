package ㄴ_자바_손정대강사님.Day17.이것이자바다.예외;

import java.util.Scanner;

public class Q432_2_TryCatchFinallyRuntimeEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[2];
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("실행 매개값의 수가 부족합니다.");
				System.out.println("[실행 방법]");
				System.out.println("java TryCatchFinallyRuntimeExample num1 num2");
				return;
			}
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+"+data2 + "+"+"="+ result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
			}finally {
				System.out.println("다시 실행하세요.");
			}
		
		
	}

}
