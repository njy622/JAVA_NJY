package Day19.CollectionEx.Set.MyStudent;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<MyStudent> set = new HashSet<MyStudent>();
		set.add(new MyStudent());
		set.add(new MyStudent("java",3));
		Object [] obj = set.toArray();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println(set);
		
			
		
		/*Set set = new HashSet();
		set.add("Hello");
		set.add(new Integer(178));
		set.add(new Float(4.56F));
		set.add(300);
		set.add(12.345F);
		set.add(new MyStudent());	// 매개변수가 없는  생성자메소드를 호출하면
									// this("이순신",2); 출력됨 
		set.add(new MyStudent("java", 3));		// 매개변수 있는것은 java가 나옴
		
		Object [] obj =set.toArray();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(obj[i]);
		}
		System.out.println(set);*/
	}
}
