package Day19.CollectionEx.Set.hashcode;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		
		set.add(new Member("남지영", 28));
		set.add(new Member("남지영", 28));

		System.out.println("총 객체수 : "+ set.size());
	}
}
