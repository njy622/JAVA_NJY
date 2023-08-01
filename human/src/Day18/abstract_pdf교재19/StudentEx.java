package Day18.abstract_pdf교재19;

public class StudentEx {
	public static void main(String[] args) {
//		Student s = new Student();
		Student st= new University("남지영",3,30,"손정대");
		Elementary m = new Elementary("주세희", 3, "한성호");
			
		
		System.out.println("학생 이름 : "+st.getName());
		System.out.println(st.getTeacher());
		System.out.println(m.getTeacher());
	}
}
