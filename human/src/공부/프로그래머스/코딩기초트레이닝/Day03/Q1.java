package 공부.프로그래머스.코딩기초트레이닝.Day03;


public class Q1 {
    public String solution(String str1, String str2) {
        String answer = "";
        
        for (int i = 0; i < str1.length(); i++) {
			answer = answer+str1.charAt(i)+str2.charAt(i);
			
		}
        return answer;
			}
    public static void main(String[] args) {
		Q1 s = new Q1();
		
		System.out.println(s.solution("aaaaa","bbbbb"));
	}
}
