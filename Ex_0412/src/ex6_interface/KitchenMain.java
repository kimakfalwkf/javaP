package ex6_interface;

public class KitchenMain {
public static void main(String[] args) {
	Kitchen k=new Kitchen();
	System.out.println("우리집 메뉴판");
	System.out.println("짜장면 "+k.jajang());
	System.out.println("탕수육 "+k.tangsu());
	System.out.println("볶음밥 "+k.boggembab());
	System.out.println("짬뽕 "+k.jambbong());
}
}
