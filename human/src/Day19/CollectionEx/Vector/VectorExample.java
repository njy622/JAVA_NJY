package Day19.CollectionEx.Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//보드 객체 생성
		list.add(new Board("헬로", "하이", "남지영"));
		list.add(new Board("자바", "늘새로워", "휴먼"));
		list.add(new Board("교육", "개발자", "손정대"));
		list.add(new Board("자료", "글내용", "글쓴이"));
		list.add(new Board("자료2", "글내용2", "글쓴이2"));
		
		
		
		list.remove(2);		 //2번 인덱스 객체 삭제 뒤에 인덱스는 1씩 앞으로 당겨짐
		list.remove(3);		// 당겨진 후  3번 인덱스 객체 삭제
		
		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+ board.content+"\t"+board.writer);
		}
		
		
	}
}
