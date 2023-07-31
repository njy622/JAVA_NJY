package Day18.abstract_pdf교재19;

public class University implements Student1 {

	String name;
	
	@Override
	public void getStudInfo() {
		System.out.println("학생 이름: "+ name);
	}

	@Override
	public void getTeacher() {
		System.out.println("지도 교수님 : "+ name);
	}
	
}
