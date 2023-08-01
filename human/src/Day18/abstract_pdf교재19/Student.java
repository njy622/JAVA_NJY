package Day18.abstract_pdf교재19;

public abstract class Student {
	
	String name;
	int grade;
	String teacher;
	
	public Student() {
		System.out.println("Student 생성자 호출");
	}
	
	
	
	public Student(String name, int grade, String teacher) {
		this.name = name;
		this.grade = grade;
		this.teacher = teacher;
	}



	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public String getStudInfo() {
		System.out.println("Student 클래스의 getStudInfo() 메소드 호출");
		return "이름은 : " +name + ", 학년은 " + grade;
	}
	public abstract String getTeacher(); // 학생 담당 선생님 이름을 구하는 추상 메소드
}