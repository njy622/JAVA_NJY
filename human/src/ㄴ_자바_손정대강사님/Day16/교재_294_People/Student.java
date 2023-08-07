package ㄴ_자바_손정대강사님.Day16.교재_294_People;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo=studentNo;
	}

}
