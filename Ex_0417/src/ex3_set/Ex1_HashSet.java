package ex3_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Ex1_HashSet {
public static void main(String[] args) {
	//컬렉션: java. util 패키지의 인터페이스(상수와 추상메서드만 들어갈수 있음)
	//배열의 단점을 보완하여 index 개수가 정해져 있지 않은 다수의 객체를
	//다루기 위해 사용하는 프로그래밍 방식
	
	//Set, Map, List(인터페이스)
	
	
	//Set 인터페이스를 구현한 자식클래스
	//HashSet, TreeSet
	
	HashSet<String> hs1= new HashSet();
	//HashSet에 데이터를 추가하는 방식
	hs1.add("a");
	hs1.add("b");
	hs1.add("f");
	hs1.add("d");
	System.out.println(hs1);
	
	//HashSet에는 중복된 데이터를 추가할 수 없다.
	hs1.add("a");
	hs1.add("b");
	System.out.println(hs1);
	
	//HashSet의 크기 측정
	int res=hs1.size(); //모든 컬렉션(set, map, list...)의 크기 측정은 사이즈로 한다
	System.out.println("set의 크기: "+res);
	
	//HashSet에 저장된 데이터 제거하는 법
	hs1.remove("a");//-> 지우고 boolean 값 반환
	//hs1.clear();  //지우고 반환값 없음
	hs1.remove(hs1);//-> set의 모든 내용 제거하기
	
	//HashSet에는 index 번호가 없다.
	System.out.println(hs1);
	
	//HashSet는 중복되는 값이 들어가지 않기 때문에 난수를 생성해서 넣기가 편하다
	//로또번호 생성기 Set에 중복이 되지 않는 6개의 값 넣기
	HashSet<Integer> hs2= new HashSet();
	
	Random rnd= new Random();
	
	while(hs2.size() !=6){
		int n=rnd.nextInt(45)+1;
		hs2.add(n);
	}
	System.out.println(hs2);
	
	int arr[]= {1,1,2,2,3,3,4,4,5,5,6,6};
	HashSet<Integer> hs3=new HashSet<Integer>();//중복되는 숫자들을 거를때도 사용가능하다
	for(int i =0; i<arr.length; i++) { //length: 선택한 요소의 개수를 반환하는 속성
		hs3.add(arr[i]);
	}
	//System.out.println(hs3);
	
	//new Integer[0]: set이 add 해둔 요소의 개수만큼 자동으로 배열의 인덱스가 정해진다.
	Integer[]arr2=hs3.toArray(new Integer[0]);
	for(int i=0; i<arr2.length; i++) {
		System.out.println(arr2[i]+" ");
	}
}
}
