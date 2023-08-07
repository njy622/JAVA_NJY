package ㄴ_자바_손정대강사님.Day19.CollectionEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); 	//객체생성
		
		list.add("java");
		list.add("JDBC");
		list.add("Servelt");  //  add : 값 추가
		int size= list.size(); // size : 저장된 값의 개수를 확인할때
		System.out.println("총 객체수 : "+size);
		System.out.println();

		String web = list.get(2);  // 3번째 문자열 불러오자 불러올때는 타입도 맞춰서
		System.out.println("3번째 : "+web);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}
}
