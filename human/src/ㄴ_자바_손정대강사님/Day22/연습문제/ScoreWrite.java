package ㄴ_자바_손정대강사님.Day22.연습문제;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//열명의 시험 점수를 입력 받아서 파일에 저장하는 예제
public class ScoreWrite {
	
	public static void main(String[] args) {
		int count=1; 		//몇 번 입력했는지를 카운트하는 변수
		String scoreData="";
		String s= null;
		File file = new File("d:\\temp\\scoreData.txt");
		try {
			
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new FileWriter(file,false));
		do {
			System.out.println(count+ " 번째 점수를 입력하세요");
			s=in.readLine();
			
			if(isRealNumber(s)) {  //입력한 데이터가 숫자인지를 체크한다.
				if(count!=10) {
					scoreData+=s+",";
				} else {
					scoreData+=s;
				}
				count++;
			}else {
				System.out.println("숫자만 입력 가능합니다.");
			}
		}while(count <=10);
			
			out.print(scoreData);
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("IOException");
		}
		System.out.println("시험점수를 파일로 출력합니다.");
		}
	public static boolean isRealNumber(String str) {
		String numeral="";
		String patternStr = "^[0-9]*$";  //	숫자를 패턴으로 지정
		Pattern pattern = Pattern.compile(patternStr);
		Matcher matcher = null;
		matcher = pattern.matcher(str);
		while(matcher.find()) {
			numeral+=matcher.group(0);
		}
		if(numeral!=null && !(numeral.length()==0)) {
			return true;
		}else {
			return false;
		}
	}
	

}
