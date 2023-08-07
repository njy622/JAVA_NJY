package ㄴ_자바_손정대강사님.Day22.야구게임;

import java.io.*;
import java.util.*;

public class StrikeGame {
	static int com_val[]=new int[3];
	//컴퓨터가 가지는 세수를 저장하는 배열
	public static void main(String[] args) {
		boolean result = false;
		int try_count=1; //도전횟수
		com_val=init(); // 컴퓨터의 볼 카운트 초기화한다.
		for (int i = 0; i < 3; i++) {
			System.out.println("컴퓨터 값 : "+com_val[i]);
		}
		System.out.println("========= BaseBall Game~!! ==========");
		System.out.println("총 10 번의 기회 중 "+try_count+"회 도전");
		System.out.println("세 수를 연속하여 입력하세요. \n 예) 123");
		System.out.println("숫자 입력 : ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		String s;
		s= in.readLine();
		while(s!=null) {
			System.out.println("입력값 : "+s);
			result=compare(s);  //입력한 값과 컴퓨터의 값을 비교한다.
			if(result==true) {
				System.out.println("정답입니다.!");
				break;
			}else {
				try_count++;
				if(try_count>=10) {
					System.out.println("도전 실패입니다. \n 다시 도전(Y), 종료(N)");
					System.exit(1);
			}
			System.out.println("총 10 번의 기회 중 "+try_count+"회 도전");
			System.out.println("세 수를 연속하여 입력하세요. \n 예) 123");
			System.out.println("숫자 입력 : ");
			s=in.readLine();
			}//end if
		}// end while
			in.close();
		}catch (IOException e) {
		System.out.println("IOException");
		}
	}
	// 프로그램 실행 시 컴퓨터의 볼 카운트를 초기화하는 메소드
	private static int[] init() {
		int[] val = new int[3];
		int num = 0;
		int count=0;
		
	label1:
		while(count<3) {
			//1~9 사이의 자연수를 구한다.
			num=(int)(Math.random()*1000)%9+1;
			for (int i = 0; i < 3; i++) {
				if(num==val[i])
					continue label1;
			}
			val[count]=num;
			count++;
			num=0;
			}
		return val;
	}
	//컴퓨터의 볼 카운트와 사용자가 입력한 볼 카운트를 비교하는 메소드
	private static boolean compare(String str) {
		int ball=0, strike =0;  //볼카운트
		boolean result = false;
		int num=0;
		char ch = 0;
		
		for (int i = 0; i < 3; i++) {
			ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			for (int j = 0; j < 3; j++) {
				if(num==com_val[j]&& i!=j)
					ball++;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			ch=str.charAt(i);
			num=Integer.parseInt(Character.toString(ch));
			if(num==com_val[i])
				strike++;
		}
		//세 숫자를 다 맞추었을 경우
		if(strike==3)
			result=true;
		displayCount(ball,strike);  //볼카운트를 표시한다.
		return result;
			}
	private static void displayCount(int ball, int strike) {
		System.out.println(ball+" ball , "+strike+" strike");
		
	}
		
	}
				
