package ㄴ_자바_손정대강사님.Day21.IOTest02;

import java.io.InputStream;
import java.io.PrintStream;

//강사님 교재 페이지 12장 25
public class SystemInOUt3 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		PrintStream ps = System.out; // 콘솔로 문자열을 출력하기 위해서 PrintStream 객체를 얻는다.
		
		byte[] datas = new byte[100];
		
		System.out.print("이름 : ");
		int nameLen = is.read(datas);
		String name = new String(datas,0,nameLen-2);
		// 문자열 입력이 끝나면 이문자를 여기서 저기까지 끝입니다 알리는게 엔터값 2개가 들어가는데
		// 출력해도 안나오니, -2를 해줘서 엔터값을 불러오는걸 없앰!

		System.out.print("하고 싶은말 : ");
		int commLen = is.read(datas);
		String comment = new String(datas,0,commLen-2);
		
		ps.println("입력한 이름 : "+name);
		ps.println("입력한 하고 싶은말 : "+comment);
		
		System.out.println("입력한 이름 : "+name);
		System.out.println("입력한 하고 싶은말 : "+comment);
		
		
	}
}
