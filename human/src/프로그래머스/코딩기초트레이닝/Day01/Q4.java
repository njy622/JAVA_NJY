package 프로그래머스.코딩기초트레이닝.Day01;

import java.util.Scanner;

public class Q4 {
	
	// 대문자 변환 toUpperCase()
	// 소문자 변환 toLowerCase()
	// 
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = "";
        
        for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
        	if(Character.isUpperCase(c))
        		b+=Character.toLowerCase(c);
			else
				b+=Character.toUpperCase(c);
		}
        System.out.println(b);
	}
}
