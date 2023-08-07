package ㄴ_자바_손정대강사님.Day21.IOTest02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest {

	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		//버퍼는 줄바꿈이 일어난다! 뒤에 엔터를 치기 때문이다 !! 
		String mesg = null;
		System.out.println("Exit : ctrl+Z");
	
		try {
			mesg = in.readLine();   //readLine 자체가 String 타입
			while(mesg!=null) {		// 계속 입력받을거야(반복문 while 작성)
				System.out.println("읽기 : "+mesg);
				mesg = in.readLine();  // 이거 안써주면 무한루프됨!!
			}
			in.close();  // 안에부터 먼저 종료하며 바깥으로 나가면서 종료하는 순서로해야함
			ir.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
