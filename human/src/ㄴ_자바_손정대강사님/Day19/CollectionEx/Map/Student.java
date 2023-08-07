package ㄴ_자바_손정대강사님.Day19.CollectionEx.Map;

public class Student {
	
	public int sno;
	public String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno==student.sno) && (name.equals(student.name));
		}else
		return false;
	}
	
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	
	
}
