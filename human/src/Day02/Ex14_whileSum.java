package Day02;

public class Ex14_whileSum {

	public static void main(String[] args) {
		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+...+99+100 = 5050
		int sum = 0;
		int a = 1;
		
		while(a <= 100 ) {
			sum += a++;  // sum = sum +a;
						 //a = a + 1;
			// sum = sum + a
			//  1	  0    1
			//  ?	  1  +  2
			
		}
		System.out.println("합계 : " + sum);
	}
}
