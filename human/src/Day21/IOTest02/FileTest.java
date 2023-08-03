package Day21.IOTest02;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File(".","FileTest.java");
		System.out.println("파일의 경로는 ?"+ file.getPath());
		System.out.println("파일의 이름은 ?"+ file.getName());
		System.out.println("파일의 상위디렉터리는 ?"+ file.getParent());
		System.out.println("파일의 절대경로는 ?"+ file.getAbsolutePath());
		System.out.println("파일의 절대경로냐 ?"+ file.isAbsolute());
		System.out.println("파일이 존재하냐 ?"+ file.exists());
		System.out.println("파일이냐 ?"+ file.isFile());
		System.out.println("디렉터리이냐 ?"+ file.isDirectory());
		System.out.println("파일을 읽을 수 있냐 ?"+ file.canRead());
		System.out.println("파일을 쓸 수 있냐 ?"+ file.canWrite());
		System.out.println("파일의 바이트 크기는 ?"+ file.length());
		System.out.println("파일이냐 ?"+ file.isFile());
		boolean b = new File("."+File.separator+"hello").mkdir();
		//boolean b = new File("./hello").mkdir();
		//boolean b = new File(".\\hello").mkdir();
		
		String[] listing = new File(".").list();
		System.out.println("현재 디렉터리 내용은?");
		for (int i = 0; i < listing.length; i++) {
			System.out.println(listing[i]);
		}
	}
}
