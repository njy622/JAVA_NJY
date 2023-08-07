package ㄴ_자바_손정대강사님.Day20.IOTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileStream {

	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in=new FileInputStream("D:\\temp\\input.ini"); // 읽어오는 객체(Scanner처럼)
			out = new FileOutputStream("D:\\temp\\output.ini"); // 출력할 내용을 만듦
			int c= 0;
			while((c=in.read())!=-1)  //읽어옴
				out.write(c);		// 저장은 이렇게!
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
				try {
					if(in!=null)in.close();
					if(out!=null)out.close();
				} catch (Exception e) {
					// TODO :handle exception
					e.printStackTrace();
				}
		}
	}
}