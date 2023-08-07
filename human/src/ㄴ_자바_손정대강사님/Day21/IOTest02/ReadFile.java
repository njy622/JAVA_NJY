package ㄴ_자바_손정대강사님.Day21.IOTest02;

import java.io.*;

public class ReadFile {
	public static void main(String[] args) {
		File file = new File("d:\\temp\\write.txt");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s=in.readLine();
			while(s!=null) {
				System.out.println("read: "+s);
				s=in.readLine();
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Found");
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	
	}

}
