package ex1_generic;

public class GenEx_Main {
public static void main(String[] args) {
	
	GenEx<String> v1=new GenEx<String>();
	v1.setValue("100");
	
	System.out.println(v1.getValue());
	
	//정수를 가지는 GenEx객체 만들기
	//제네릭 타입은 기본자료형을 인식 못한다.
	
	//따라서 int, double등의 기본자료형을 제네릭타입으로 이용하고자 할 떄는
	//Integer,Double,Float, Character 등의 wrapper 클래스를 이용해야 한다.
	
	
	GenEx<Integer> v2=new GenEx<Integer>();
	v2.setValue(1000);
	System.out.println(v2.getValue()+10);
	
	GenEx<Character> v3=new GenEx<Character>();
	v3.setValue('a');
	System.out.println(v3.getValue());
	
	GenEx<Double>v4=new GenEx<Double>();
	v4.setValue(3.14);
	System.out.println(v4.getValue());
	
	
}
}
