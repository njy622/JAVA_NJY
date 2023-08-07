package 공부.프로그래머스.코딩기초트레이닝.Day04;

public class Q2 {
	public int solution(int number, int n, int m) {
        int answer = number%n==0 && number%m==0 ? 1:0;
        return answer;
    }
}