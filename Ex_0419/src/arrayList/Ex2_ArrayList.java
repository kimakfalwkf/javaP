package arrayList;

import java.util.ArrayList;

public class Ex2_ArrayList {
public static void main(String[] args) {
	
	ArrayList<Integer>list=new ArrayList<Integer>();
	list.add(10);//인덱스0
	list.add(10);//인덱스1
	list.add(1, 20);  //list.add(인덱스, 값);  //1번자리를 차치하고서 기존에 있던 기본 인덱스들이 한칸씩 밀려난다.
	
	list.set(2, 20);  //인덱스 2번의 값을 20으로 수정
	
	list.add(55);
	
	list.remove(1); //1번 인덱스 내용 삭제 후/ 뒷 번호 한칸씩 앞으로
	
	System.out.println("isEmpty(): "+list.isEmpty()); //비었으면 참 차있으면 거짓
	
	System.out.println(list.indexOf(55)); //value값의 인덱스 번호를 반환하는 메서드
	
	
	System.out.println("//"+list);
	
	


}}
