package classex.arrayex;

import java.util.Scanner;

public class Test2 {
	
	// 값입력:
			// 300
			// 200
			// 600
			// 790
			// 900
			// Maximum Value : 900
			// Minimum Value : 200
			// 
	
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int N = sc.nextInt();
		int arr4[] = new int[N];	
		
		for (int i = 0; i < arr4.length; i++) 
			arr4[i] = sc.nextInt();
			
	 int max1 = arr4[0];
	 int min1 = arr4[0];
		
		for (int i = 0; i < arr4.length; i++) {
			if(max1 < arr4[i])
				max1 = arr4[i];
			if(min1 > arr4[i])
				min1 = arr4[i];
		}
		System.out.println("max : "+max1 + ", min : " + min1);
}
		
	
}
