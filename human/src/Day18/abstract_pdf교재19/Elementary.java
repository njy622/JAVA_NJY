package Day18.abstract_pdf교재19;

public class Elementary implements Student1{

	String name;
	
	@Override
	public void getStudInfo() {
		System.out.println("학생 이름 :"+name);
	}

	@Override
	public void getTeacher() {
		System.out.println(" 담당 선생님 : "+ name);
	}

	
	
	
	
	
	
}
