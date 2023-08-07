package ㄴ_자바_손정대강사님.Day19.CollectionEx.Set.MyStudent;

public class MyStudent {

	private String name;
	private int grade;
	
	public MyStudent() {
		this("이순신",2);
	}

	public MyStudent(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", grade=" + grade + "]";
	}
	
	
}
