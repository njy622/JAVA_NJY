package Day21.IOTest02;
// 강사님 교재 12강 p.22
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SystemInOut {

	public static void main(String[] args) {
		//입출력 스트림
		InputStream is = System.in;
		OutputStream os = System.out;
	
		try {
			char ch = (char)is.read();  //정수형 처리됨/ 읽음
			os.write(ch);	//출력
			os.flush();		// 버퍼를 비워야 출력이됨 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	}
}
