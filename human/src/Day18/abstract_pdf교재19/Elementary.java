package Day18.abstract_pdf교재19;

public class Elementary extends Student{

	public Elementary(String name, int grade, String teacher) {
		super(name,grade,teacher);
	}

	// 상위 클래스의 추상 메서드를 반드시 구현한다.
	@Override
	public String getTeacher() {
		return "담임선생님 : " + super.teacher;
	}
	
	
	
}
