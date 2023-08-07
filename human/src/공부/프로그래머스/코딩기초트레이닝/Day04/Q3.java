package 공부.프로그래머스.코딩기초트레이닝.Day04;

public class Q3 {
	public int solution(int n) {
		 	int answer =0;
		 	if(n%2==1) {
		 		for (int i = 1; i <= n; i+=2) 
		 			answer+=i;
		 			
			}else {
				for (int j = 2; j <= n; j+=2) 
					 answer+=j*j;
			}
			return answer;
			}

	public static void main(String[] args) {
		Q3 s = new Q3();
		System.out.println(s.solution(10));
	}
}