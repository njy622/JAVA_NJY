package classex.arrayex.student;

import java.util.Scanner;

public class Student3 {

//	Java Programming
//	점수:
//	배열 초기값
//	학생  1:  87
//	학생  2:  68
//	학생  3:  94
//	학생  4: 100
//	학생  5:  83
//	학생  6:  78
//	학생  7:  85
//	학생  8:  91
//	학생  9:  76
//	학생 10:  87
//
//	과목평균84.90
//	최저점수 68
//	최고점수 100
//
//	점수분포:
//	00-09: 
//	10-19: 
//	20-29: 
//	30-39: 
//	40-49: 
//	50-59: 
//	60-69: *
//	70-79: **
//	80-89: ****
//	90-99: **
//	  100: *
	// ArrayChart ac= new ArrauChart();
	// ac.displayMessage(); → java Programming
	// ▶ public void displayMessage(){
	//   System.out.println("Java Programming");
	// } 
	// ac.processGrades();
	// public void processGrades(){
	//	배열 초기값 선언
	//	학생 점수 출력
	//  평균 메소드() → getAverage()
	// getMaximum()
	// getMinimum()
	// 챠트 출력 → outputBarChart();
	// }
	
	public static void main(String[] args) {
		ArrayChart ac = new ArrayChart();				
		ac.displayMessage();
	    ac.processGrades();


	}
	
	public void displayMessage() {
		System.out.println("Java Programming");
	
	}
	
	
	public void ProcessGrade() {
		//배열 초기값 선언
		
		int arr[] = {87,68,94,100,83,78,85,91,76,87};
		
		//평균, 최저, 최고
		
	
		//학생점수 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println("학생 "+ (i+1)+ " : " + arr[i]);
		}
		}
		
		public float getAverage(int arr[]) {
			int sum = 0;
			double avg = 0;
			int max = arr[0];
			int min = arr[0];
			
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			
			avg = sum/arr.length;
			System.out.println("과목평균 : "+ avg);
			
			public void getMaximum(arr) {
				for (int j = 0; j < arr.length; j++) {
					if (max<arr[i]) 
						max=arr[i];
					if (min>arr[i]) 
						min=arr[i];
				}
				System.out.println("최저점수 : "+min);
				System.out.println("최고점수 : "+max);
				
				}
			
				}
			public void outputBarDhart();
			for (int i = 0; i < arr.length; i++) {
				for (int j = -(i-1); j < arr.length; j++) {
					System.out.println(i+"-"+j +" : ");
			}
			
				public void main(String[] args) {
					int[] arr = {87,68,94,100,83,78,85,91,76,87};
					Scanner sc = new Scanner(System.in);
					int N=1;
					System.out.print("80-89 : ");
					
					public void
					for (int i = 0; i < arr.length; i++) {
						if(arr[i]>=80 && arr[i]<90) {
							arr[i] = N;
							N = arr.length;
						for (int j = 0; j < N/10; j++) {
							System.out.print("*");
					}
			}
		}
		
		
		
			 
	
}
}
		}
	}
}

	

	
		
		
			
		
			
		
		
		
	
