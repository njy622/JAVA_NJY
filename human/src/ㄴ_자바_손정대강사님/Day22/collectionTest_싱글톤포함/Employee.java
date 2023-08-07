package ㄴ_자바_손정대강사님.Day22.collectionTest_싱글톤포함;

//List : 순서있는 값
// Map : 키와 값		사원을 구분하는 사원번호가 Key(같은 사원번호 XX)

public class Employee {
	private int ssn;			//사번
	private String name;		//사원명
	private MyDate birthDate;	//생년월일
	private double salary;		//급여
	
	//ArrayList 사용 생성자 메소드
	public Employee(String name, MyDate birthDate, double salary) {
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	//Map 사용 생성자 메소드
	public Employee(int ssn, String name, MyDate birthDate, double salary) {
		this.ssn = ssn;
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate() {
		this.birthDate = birthDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return  name + birthDate + salary;
	}
	
}
