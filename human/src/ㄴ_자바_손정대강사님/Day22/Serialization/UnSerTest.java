package ㄴ_자바_손정대강사님.Day22.Serialization;

import java.io.*;
import java.util.*;
//역직렬화
public class UnSerTest {

	public static void main(String[] args) {
		try {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("d:\\temp\\serial.ser")));
		ArrayList<Employee> list = (ArrayList<Employee>)ois.readObject();
		//<Employee> 빼도 실행 잘됨
		
		Iterator<Employee> ite = list.iterator();  //반복자! 객체를 가지고있는곳은 다 쓸수있음
		//<Employee> 빼도 실행 잘됨
		System.out.println("사원 정보 출력\n");
		while(ite.hasNext()) {
			Employee p = (Employee)ite.next();  
			System.out.println("이름 : "+p.getName());
			System.out.println("주민번호 : "+p.getJumin());
			System.out.println("주소 : "+p.getAddr());
			System.out.println("전화번호 : "+p.getPhone());
		}
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
