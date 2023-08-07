package ㄴ_자바_손정대강사님.Day17;

import java.util.Scanner;

public class 선생님문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String subject = "";
		System.out.println("과목을 선택하세요");
		System.out.println("1.자바 2.JSP 3.AI 4.스프링");
		System.out.println("과목선택 : ");
		int num = sc.nextInt();

		if (1 <= num && num <= 4) {
			if (num == 1)
				subject = "자바";
			else if (num == 2)
				subject = "JSP";
			else if (num == 3)
				subject = "AI";
			else if (num == 4)
				subject = "스프링";
		} else {
			System.out.print("1~4번중에 골라주세요");
			return;
	}
		if(subject!=null)
		System.out.print("과목:" + subject);
	}
}
