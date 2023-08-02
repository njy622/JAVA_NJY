package Day20.IOTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerStream {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintWriter out=null;
		double sum=0.;
		try {
			//저장
			out = new PrintWriter(new FileWriter("d:\\temp\\scanner.txt"));
			out.write("9.7");
			out.write("123.456");
			out.flush();
			
			sc=new Scanner(new BufferedReader(new FileReader("d:\\temp\\scanner.txt")));
			//파일에 접근할거야! 반복!
			while(sc.hasNext()) {  //hasNext 읽을 데이터가 더 있다.
				if(sc.hasNextDouble())
					sum+=sc.nextDouble();
				else
					sc.next(); //대기하는 상태(잠시 기다리세용)
			}
			System.out.println("합계 : "+sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) out.close();
				if(sc!=null) sc.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
