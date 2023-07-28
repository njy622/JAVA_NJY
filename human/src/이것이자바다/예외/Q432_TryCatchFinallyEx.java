package 이것이자바다.예외;

public class Q432_TryCatchFinallyEx {
	
	public static void main(String[] args) {
		try {
		Class clazz = Class.forName("Java.lang.String2");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
