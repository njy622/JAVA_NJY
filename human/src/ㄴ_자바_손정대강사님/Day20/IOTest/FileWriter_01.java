package ㄴ_자바_손정대강사님.Day20.IOTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriter_01 {

	public static void main(String[] args) {
//		System.out.println(new InputStreamReader(System.in));
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter fout = null;
		int c=0;
		try {
//			fout = new FileWriter("d:\\temp\\test.txt");
			fout = new FileWriter("test.txt");  // 이렇게하면 프로젝트 안에..생김
			while((c=in.read())!=-1) {
				fout.write(c);  // 출력
			}
			in.close();
			fout.close();	// 순서대로 닫아주기!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
// 입력하고 그만 입력하고 싶으면 ctrl + z  => 파일 경로 들어가면 txt파일 안에 해당 문자 들어옴
