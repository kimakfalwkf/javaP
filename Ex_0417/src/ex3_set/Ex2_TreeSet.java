package ex3_set;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex2_TreeSet {
	

	public static void main(String[] args) {
		//TreeSet은 이진탐색 트리 중 성능을 향상시킨 레드=블랙트리고 구성되어있습니다.
		//레드-블랙트리는 부모노드보다 작은 값을 가지는 노드는 왼쪽 자식으로, 큰 값을 가지는 노드는 오른쪽으러
		//배치하여 데이터의 추가나 삭제시 트라가 한쪽으로 치우치지 않도록 균형을 맞춰줍니다.
		
		//노드: 안에 들어가는 하나하나의 데이터
		
		TreeSet<Integer> set1= new TreeSet<Integer>();
		//=TreeSet<Integer> set1= new TreeSet<>();
		//TreeSet<Integer> set2= new TreeSet<Integer>(set1); set1의 모든 요소를 가지고 트리셋 형성
		
		//TreeSet에 값 추가하기
		set1.add(7);//부모,중복되는 숫자는 불가능함
		set1.add(4);//작은 자식: 왼쪽
		set1.add(9);//큰자식: 오른쪽
		
		set1.add(1);//가장 작은 자식: 가장 왼쪽
		set1.add(5);//중간 작은 자식: 중간 왼쪽
		
		System.out.println(set1);//전체출력
		System.out.println(set1.first()); //최소값
		System.out.println(set1.last());  //최대값
		System.out.println(set1.higher(3)); //3보다 큰 데이터중에서 최소값 없으면 null
		System.out.println(set1.lower(3));//3보다 작은 데이터중에서 최대값. 없으면 null
		
		
		Iterator  iter= set1.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next()+" ");  //내부의 것을 하나씩 보고 싶을 떄
		}
		
	}

	
}
