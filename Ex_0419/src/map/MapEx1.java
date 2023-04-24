package map;

import java.util.HashMap;

public class MapEx1 {
public static void main(String[] args) {
	//map의 구조는 키(key) 값과 Value값이 하나의 데이터로 저장
	//map 의 구조는 key를 통해서 Value를 검색해내므로 많은 양의 데이터를 
	//조회하는데 있어서 매우 뛰어난 성능을 발휘
	
	//HashMap:map을 구현하고 있는 자식 글래스 중 가장 많이 사용하는 클래스
	HashMap<Integer, Character>map = new HashMap<Integer, Character>();
	
	
	//HashMap에 데이터 추가하기
	map.put(1, 'a');
	map.put(2, 'b');
	map.put(3, 'c');
	
	//map에 저장되는 Value값은 중복가능
	map.put(4, 'a');
	
	//map의 키 값은 중복이 될 수 없다
	map.put(1, 'f');
	
	//map의 데이터 제거하기
	map.remove(3);  //키 값을 기준으로 인식함
	
	//map에서 Value 값 하나 꺼내오기
	System.out.println("1의 벨류값 "+map.get(1));
	
	//map의 크기 
	System.out.println("크기: "+map.size());
	
	System.out.println(map);
	

}
}
