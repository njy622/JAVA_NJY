package Day19.CollectionEx.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이것이 자바다. p743번 예제
public class HashMapExample {

	public static void main(String[] args) {
		//Map 컬렌션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("남지영", 85);
		map.put("주세희", 90);
		map.put("조세훈", 85);
		map.put("신영화", 100);
		System.out.println("총 Entry 수 : "+ map.size());
		System.out.println();
		
		
		//객체 찾기
		System.out.println("\t홍길동: "+map.get("홍길동"));
		System.out.println();
		
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key+" : "+value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : "+map.size());
		
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+" : "+value);
			}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
	}

}
