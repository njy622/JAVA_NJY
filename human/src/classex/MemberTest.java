package classex;

public class MemberTest {
	// 속성, 메소드
	public static void main(String[]args) {
		
		//객체생성
		Member member = new Member();		// 객체는 유일성(하나밖에 없다!/한번만쓰기!)
//		클래스    객체		번지	생성자메소드(멤버변수를 초기화한다.) 
						// 모든 클래스는 생성자메소드가 있다.
		System.out.println("1번:"+member.toString());		//Heap 할당 //toString = 오버라이딩 되는것 
//		member.name="java";				// 은닉화(private 선언한 id는
//										// member.id로 접근 불가
//		System.out.println(member.name); // 중괄호 안에 있는 건 무조건 지역변수
		String name= "자바";		
		System.out.println(name);
		// //////////////////////////////////
		member.setId("자바...");				// 자바를 ATM 입금
		member.setPwd("자바");
		System.out.println("2번:"+member);	// toString 생략가능 
		String id = member.getId();			// 자바만큼 ATM 출금가능 
		System.out.println(id);				// 자바만큼 출금했다는 표시(통장 출금내역)
		Member member2= new Member("java","java"); //set메소드와 같다(멤버ex의 String id, pw에 데이터가 들어감.) 인터넷뱅킹으로 이미 입금된 상태

		String id2 = member2.getId();			  //  출금가능
		String pwd2 = member2.getPwd();			  // set메소드 this가 set소드 안에 있음으로 >출력시엔 get
		System.out.println("id="+id2+",pwd="+pwd2);				  //  출금내역  표시 
		System.out.printf("id=%10s,pwd=%10s",id2,pwd2);		//%10 앞에공백 10칸/ %-10 뒤에 공백 10칸
		///////////////////////////////////////////////
		Address addr = new Address ("서울","영등포구","영등");
		Member member = new Member("java2","java2",addr);
		String city = Address.getCity;
		String gu = Address.getGu
		String dong = Address.getDong;
		System.out.println();
		
		
		/////////////////////////////////////
//		member.setPwd(" ");
//		String pwd = member.getPwd();
//		System.out.println(pwd);
//		
//		member.setName(" ");
//		String name = member.getName();
//		System.out.println(name);
//		
//		member.setEmail(" ");
//		String email = member.getEmail();
//		System.out.println(pwd);
//		
//		
		
	
	}
}
