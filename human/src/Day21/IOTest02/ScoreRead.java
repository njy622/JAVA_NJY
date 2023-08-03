package Day21.IOTest02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

//파일에서 시험 점수를 읽어서 총점과 평균을 구하는 예제
public class ScoreRead {
	public static void main(String[] args) {
		int totalScore = 0;
		int count=0;
		float average=0.0f;
		File file = new File("D:\\temp\\scoreData.txt");
		
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s;
			s=in.readLine();
		if(s!=null) {
			System.out.println("시험 점수 : "+s);
			StringTokenizer st = new StringTokenizer(s,",");
			while(st.hasMoreTokens()) {
				totalScore+=Integer.parseInt(st.nextToken());
				count++;
			}
				
				
				System.out.println("총점 : "+totalScore);
				System.out.println("시험 본 사람 : "+count+"명");
				
				average = (float)totalScore/count;
				System.out.println(average);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}

}
}
