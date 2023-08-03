package Day21.IOTest02;

import java.io.IOException;
import java.io.InputStream;

public class SystemInOUt2 {

	public static void main(String[] args) throws Exception {
		System.out.println("==메뉴==");
		System.out.println("1.셔츠");
		System.out.println("2.아우터");
		System.out.println("3.바지");
		System.out.println("4.수트");
		System.out.println("상품을 선택하세요");
	
		InputStream in = System.in;    // 1바이트 개념인 아스키 코드값 (키보드 입력 스트림얻기)
		char inChar = (char)in.read();
		
		switch (inChar) {
		case '1':
			System.out.println("셔츠를 선택하셨습니다.");
			break;
		case '2':
			System.out.println("아우터를 선택하셨습니다..");
			break;
		case '3':
			System.out.println("바지를 선택하셨습니다.");
			break;
		case '4':
			System.out.println("수트를 선택하셨습니다.");
			break;
		}
		
	}
}
