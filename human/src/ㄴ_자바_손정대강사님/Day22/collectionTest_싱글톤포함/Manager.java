package ㄴ_자바_손정대강사님.Day22.collectionTest_싱글톤포함;

public class Manager extends Employee {
	private String dept;	//부서
	private int deptno;		//부서번호
	
	
	
	
	public Manager(String name, MyDate birthDate, double salary, String dept, int deptno) {
		super(name, birthDate, salary);
		this.dept = dept;
		this.deptno = deptno;
	}




	public String getDept() {
		return dept;
	}




	public void setDept(String dept) {
		this.dept = dept;
	}




	public int getDeptno() {
		return deptno;
	}




	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}




	@Override
	public String toString() {
		return super.toString()+ dept + deptno;
	}
	
	
}
