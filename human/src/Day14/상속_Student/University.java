package Day14.상속_Student;

public class University extends Student{

	private int courses; // 학점
	public University(String name, int grade, int courses) {
		super( name, grade);
		System.out.println("University 생성자 호출");
		this.courses = courses;
//		name = name;			부모꺼! 부모가 하자 !
//		grade = grade;		
//		courses = courses;		/자식꺼는 this로 !
	}
	
	// 학점을 출력하는 메소드
	public int getCourses() {
		return courses;
	}
}
