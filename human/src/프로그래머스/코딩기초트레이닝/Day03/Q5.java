package 프로그래머스.코딩기초트레이닝.Day03;

public class Q5 {
	public int solution(int a, int b) {
        
        String str = String.valueOf(a)+String.valueOf(b);
        int c = Integer.valueOf(str);
        int d = 2*a*b;
        if(c>d)
        	return c;
        else
        	return d;
        
    }
}