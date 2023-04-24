package ex1_enum;

public class ItemMain {
public static void main(String[] args) {
	//Item item=new item();// 열거형의 생성자를 외부에서 호출하는 것은 불가능하다
	
	//for문을 통해 열거형의 전체내용 출력
	Item[] items=Item.values();
	
	for(Item item : items) {
//		System.out.println(item.name());
//		System.out.println(item.getItemStr());
		System.out.printf("%s, %d\n",item.getItemStr(),item.getSign());
	}// 향상된 for문 반복가능한 객체 /배열이나 arry리스트 등등/을 뒤에다 적고
	//new로 정의될 수 없는, 비어있는 객체를 앞으로 둔다
	
	//>>
//	String[] fruits= {"사과", "딸기", "복숭아"};
//	
//	for(String fruit : fruits ) {
//		System.out.println(fruit);
//	}
	
	
}
}
