package Day21.IOTest02;

import java.io.*;

public class BufferedStreamTest {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
	
		
		int data=-1;
		long start=0, end=0;
		
		fis = new FileInputStream("C:\\Users\\human\\Documents\\mnm.png");
		fos = new FileOutputStream("d:\\temp\\mnm.png");
		start=System.currentTimeMillis();
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		fos.flush();
		fis.close();
		fos.close();
		end=System.currentTimeMillis();
		System.out.println("사용하지 않았을때 : "+(end-start)+"ms");
		
		fis = new FileInputStream("C:\\Users\\human\\Documents\\mnm_copy.png");
		bis = new BufferedInputStream(fis); 
		fos = new FileOutputStream("d:\\temp\\mnm_copy.png");
		bos = new BufferedOutputStream(fos);
		start = System.currentTimeMillis();
		while((data=bis.read())!=-1) {
			bos.write(data);
		}
		bos.flush();
		bis.close();
		bos.close();
		
	
		
	}
	

}
