package ex2_generic;

public class Main {
public static void main(String[] args) {
	
	
	
	Integer[] iArr= {1, 2, 3, 4, 5};
	Character[] cArr= {'a','b','c','d','e'};
	Double[] dArr= {1.1, 2.2, 3.3, 4.4, 5.5};
	
	//Gen<Integer> v1= new Gen<Integer>(); //생략하면 변수 여래개 안써도 됨
	Gen v1= new Gen();
	
	v1.printArr(iArr);
	v1.printArr(cArr);
	v1.printArr(dArr);
	
	
	
}
}
