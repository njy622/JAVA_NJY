package Day21.IOTest02;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {
		File file = new File("d:\\temp\\write.txt");
		FileReader fr =null;
		
		try {
			fr = new FileReader(file);
			int readChar;
			while((readChar=fr.read())!=-1){
				System.out.print((char)readChar);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		try {
		if(fr!=null) fr.close();
			// TODO Auto-generated catch block
		}catch(IOException e) {
		e.printStackTrace();
		}
	}
	}
}
