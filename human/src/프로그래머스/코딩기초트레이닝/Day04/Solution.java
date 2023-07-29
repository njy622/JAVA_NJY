package 프로그래머스.코딩기초트레이닝.Day04;

public class Solution {
	 public int solution(int a, int b, boolean flag) {
	        int answer = 0;
	        if(flag)
	        	answer = a+b;
	        else
	        	answer =a-b;
	        return answer;
	    }
	}