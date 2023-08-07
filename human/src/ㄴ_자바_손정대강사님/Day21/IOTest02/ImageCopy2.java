package ㄴ_자바_손정대강사님.Day21.IOTest02;

import java.io.*;

public class ImageCopy2 {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\human\\Documents\\mnm.png");
			FileInputStream in = new FileInputStream(file);
			FileOutputStream out = new FileOutputStream("C:\\Users\\human\\Documents\\mnm.jpg");
			int data;
			System.out.println("파일 크기는 :"+file.length());
			
			long begin = System.currentTimeMillis();
			
			byte[] buffer = new byte[100];
//		byte[] buffer = new byte[1024*8];
			
			while(true) {
				int count=in.read(buffer);//버퍼에 읽어들인 문자개수
				if(count==-1)  //버퍼의 마지막에 도달했는지 체크
					break;
				
				out.write(buffer,0,count);
			}
			in.close();
			out.close();
			System.out.println("이미지를 복사했습니다");
			
			long end = System.currentTimeMillis();
			System.out.println("복사 시간은 :"+(end-begin)+"ms입니다.");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}

	}
