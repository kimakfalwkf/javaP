package arrayList;

import java.util.ArrayList;

public class Ex1_ArrayList {
public static void main(String[] args) {
	//ArrayList: index 제한 없이 값을 추가하거나 제거하는 용도의 클래스
	//.중복된 값을 무시하지 않고 추가를함
	//index 번호를 가지고 있다.
	
	//배열과 비슷하지만 배열은 크기가 정해져 있지만
	//이것은 사이즈가 유동적이다.
	
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(100);
	list.add(100);
	list.add(20);
	
	//리스트의 크기
	System.out.println(list.size());
	
	//리스트에서 하나의 값 꺼내오기
	//int re=list.get(2);
	System.out.println(list.get(2));
	
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	System.out.println("===========================");
	
	//개선된 for문, 위랑 동일한 답
	for(int i:list) {
		System.out.println(i);
	}//배열, 리스트와 같은 순차적 인덱스 구조고 자동 접근하여 내용을 출력하는 것이 간편해진다.
	//단, 인덱스로 직접적인 접근이 불가능하기 때문에 하나에 대한 수정, 삭제가 불가능해진다.
	
	
	System.out.println("//"+list);
}
}
