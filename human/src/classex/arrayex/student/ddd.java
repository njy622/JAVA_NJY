package classex.arrayex.student;

import java.util.Scanner;

public class ddd {
	public static void main(String[] args) {
		int[] arr = {87,68,94,100,83,78,85,91,76,87};
		Scanner sc = new Scanner(System.in);
		int N =0;
	
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=80 && arr[i]<90)
				N = arr[i].length;
		}
		for (int i = 0; i < N; i++) {
			System.out.print("*");
		}
		
		System.out.println();

		}
		
	}
