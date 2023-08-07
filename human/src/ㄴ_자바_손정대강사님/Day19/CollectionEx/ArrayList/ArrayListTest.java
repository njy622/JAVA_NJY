package ㄴ_자바_손정대강사님.Day19.CollectionEx.ArrayList;

import java.util.*;

import ㄴ_자바_손정대강사님.Day19.CollectionEx.Set.MyStudent.MyStudent;

public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(new Integer(178));
		list.add(new MyStudent());
		list.add(new Float(4.56F));
		list.add("Hello");
		list.add(new Integer(178));
		
		//String name = list.get(0); // 오류발생
		String name = (String)list.get(0);
		Integer i1 = (Integer)list.get(1);
		MyStudent s = (MyStudent)list.get(2);
		System.out.println("name : "+name);
		System.out.println("i1 : "+i1);
		System.out.println(s);
		System.out.println();
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list);
		}
	}

