package ex2_generic;

public class PersonMain {
public static void main(String[] args) {
	Person<String, Integer> p1=new Person<String, Integer>("홍길동", 30);
	
	//=
	Person<String, Integer> p2=new Person<>("A", 31);
	
	System.out.println(p1.getName());
	System.out.println(p1.getAge());
	System.out.println("------------------------");
	System.out.println(p2.getName());
	System.out.println(p2.getAge());
	System.out.println("------------------------");
	
	
	//gen 클래스를 만들어 제네릭 타입 <T>를 갖는 PrintArr생성 메서드를 생성한다.
	
	//PrintArr 메서드 내부에서 배열을 순차적으로 출력하는 코드 작성
	
	//Main 클래스를 만들어 Integer[],double[],Character[]를 만든 뒤
	//Gen 클래스의 printArr 메서드를 각각 호출하여 배열의 내용을 출력하도록 해보자
	
	//결과
	//1 2 3 4 5 //Integer 배열 출력
	//1.1 2.2 3.3 4.4 5.5//Double 배열 출력
	
	//A B C D E// Character 배열 출력
	
	
}
}
