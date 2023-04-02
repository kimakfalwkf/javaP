package cls;

public class Review {
public static void main(String[] args) {
	mymo1 mm=new mymo1();
	mymo1 mm2=new mymo1();
	
	
	mm.setStr("안녕");  //==mm.str="안녕";
	mm2.setStr("반갑");//==mm2.str="반갑";
	mm.setNum(111);
	mm2.setNum(222);
	
	System.out.println(mm.getStr());//==sysout(mm.str);
	System.out.println(mm2.getStr());//==sysout(mm2.str);
	
	MyView mv=new MyView();
	mv.printNum(mm);
	mv.printStr(mm);
	
	mv.printNum(mm2);
	mv.printStr(mm2);
	
}
}
//MVC패턴 유행(model(구조체같은)-View(html화면)-Controller(자바와 html코드 연결)
//변수들을 지정해놓고 갖다 사용할 수 있는 클래스
class mymo1{
	// 변수들 변수에 값을 대입하거나 사용할 수 있는 메서드만
	//클래스: 변수+함수를 묶어놓은 것 / 멤버면수,메서드
	
	//멤버면수
	int num;
	String str;
	
	//메서드
	//1.num 변수에 값을 넣기
	void setNum(int num) {
		//()에 변수가 있으니까 사용 할 떄 대일이 될 것이다.
		//void: return을 안쓰겠다.(사용하는데 넘길 값이 없다.)
		this.num=num;
		
	}
	//2.num 변수 사용하기
	//사용하려면 사용한 곳에 값을 넘겨줘야 하기 떄문에 자료형을 넣어준다.
	int getNum() {
		//정수값 num을 사용한 곳에 전달해줄 것이기 떄문에 자료형은 int
		return num;  //이름이 중복되는 매개변수나 지역변수가 없으면 this는 생략가능
		
	}
	
	//3.str값 넣기
	void setStr(String str) {
		this.str=str;
		
	}
	//4. str 사용하기
	String getStr() {
		return str;
	}
	
}
class MyView{
	void printNum(mymo1 mm) {
		System.out.println(mm.num);
	}
	void printStr(mymo1 mm) {
		System.out.println(mm.str);
	}
	
}