package ㄴ_자바_손정대강사님.Day14.상속_this;

public class University extends Student {
	public int courses;
	
	public University(String name, int grade,int courses) {
	super();
	this.name=name;
	this.grade=grade;
	this.courses=courses;
	}
	public University() {
		this("java",3,20);
	}
	public int getCourses() {
		return courses;
	}
}
