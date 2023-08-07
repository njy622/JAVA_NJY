package ㄴ_자바_손정대강사님.Day18.abstract_pdf교재19;

public class University extends Student {

	private int courses;
	public University(String name, int grade, int courses, String teacher) {
		super(name,grade,teacher);
		System.out.println("University 생성자 호출");
		this.courses = courses;
	}
	
	public String getStudeInfo() {
		System.out.println("University 클래스의 getStudInfo 메소드 호출");
		return "이름 : " + name + ", 학년 : "+grade+ ", 신청학점 : "+courses;
				
	}
	
	@Override
	public String getTeacher() {
		return "지도 교수님 : " + super.teacher;
	}
	
	
	
}
