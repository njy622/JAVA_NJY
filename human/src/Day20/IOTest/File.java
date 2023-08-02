package Day20.IOTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File {

	public static void main(String[] args) {
		FileReader in = null;  //객체이기때문에 null로 입력함 사람이 읽을 수 있는 문자로 입력받아올것이다
		int n = 0;
		try {
			in = new FileReader("C:\\Windows\\system.ini"); // 생성자메소드를 통해 파일에 접근한다.(파일을 열어라!)
			//in이라는 FileReader 객체에는 system.ini 파일이 들어있다.

//			n = in.read(); >while 안에 n이 들어가는 것이 아닌 전체를 넣어줌!
			while((n = in.read())!=-1){
				System.out.print((char)n);
				}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("해당 경로에 파일이 없음"+e.getMessage());
			// 파일이 없을수도 있기때문에 해당 예외사항을 넣어줌
		} catch (IOException e) {
			// 파일이 있더라도 파일을 읽고쓰는 입출력데이터가 없을수도있다(예외작성)
			System.out.println("파일 입력 오류:"+e.getMessage());
		}
		
	}
}
