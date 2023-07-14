package Day08.Ex06_MultipleInterface;

public interface Searchable {

	// 채널 검색
	// : 검색어에 해당하는 채널 번호를 반환
	int channelSearch(String keyword);
	
	// 컨텐츠 검색
	// : 검색어에 해당하는 컨텐츠를 반환
	String[] contentSearch(String keyword);
			
}
