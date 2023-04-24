package arrayList;

import java.util.ArrayList;

public class Ex3_ArrayList {
public static void main(String[] args) {
	
	
	ArrayList<Person> list=new ArrayList<Person>();
	
	Person p1=new Person();
	p1. name="홍길동";
	p1.age=30;
	
	
	Person p2=new Person();
	p2. name="rla길동";
	p2.age=34;
	
	list.add(p1);//인덱스0
	
	list.add(p2);//인덱스1
	
	//System.out.println(list.get(0));  == System.out.println(p1);  /오류
	//list.get(0)==p1
	System.out.println(list.get(0).name); //==System.out.println(p1.name); /정상
	
	
	for(int i=0; i<list.size(); i++) {
		System.out.println(list.get(i).name);
		System.out.println(list.get(i).age);//리스트가 두개면 개선된 for문 못쓰나?
	}
}
}
