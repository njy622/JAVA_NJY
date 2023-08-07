package 공부.프로그래머스.코딩기초트레이닝.Day03;

public class Q4 {
	   public int solution(int a, int b) {
		    
	        String str = String.valueOf(a)+String.valueOf(b);
	        String str2 = String.valueOf(b)+String.valueOf(a);
	        int c = Integer.valueOf(str);
	        int d = Integer.valueOf(str2);
	        if(c>d) {
	        	return c;
	        }
	        else {
	        	return d;
	        }
	        	
	    }
	   public static void main(String[] args) {
		Q4 s = new Q4();
		s.solution(99, 1);
		System.out.println(s.solution(99,12));
	}
}