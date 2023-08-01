package Day19.CollectionEx.Set;
// 이것이자바다 p.737
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {


	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();  // 순서가 없다
		
		
		// 추가
		set.add("java");
		set.add("jdbc");
		set.add("servlet");
		set.add("spring");
		
		
		//검색
		//반복자를 반복할 객체명.iterator
		Iterator<String> it = set.iterator(); 
		while(it.hasNext()) {
			String elment =it.next();
			System.out.println(elment); // 실행하면 순서없이 막출력됨 :)
		}
		
		//삭제
		set.remove("jdbc");	
		System.out.println("개수 : "+set.size()); // 값 몇개남았나..
		
		it = set.iterator(); 
		while(it.hasNext()) {
			String elment =it.next();
			System.out.println(elment); 
		}
		//전체 제거
		set.clear();
		// 비어있는지 확인하는 방법
		if(set.isEmpty()) System.out.println("비어있음");
	}
}
