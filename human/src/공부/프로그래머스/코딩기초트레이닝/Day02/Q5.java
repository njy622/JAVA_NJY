package 공부.프로그래머스.코딩기초트레이닝.Day02;



public class Q5 {

	public String solution(String my_string, String overwrite_string, int s) {
	    String answer = "";
	     answer = my_string.substring(0, s);
	     answer += overwrite_string;
	     answer +=my_string.substring(s+overwrite_string.length(),my_string.length());
	        
	     return answer;
	     
 }

		
	}


