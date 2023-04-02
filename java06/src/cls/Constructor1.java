package cls;

public class Constructor1 {
public static void main(String[] args) {
	my9 m1=new my9(9,"홍길동",130.9);
	my9 m2=new my9(16,"이순신", 145.5);
	my9 m3=new my9(16,"유관순", 177.5);
	//생성자: 사람이 초기값을 입력하지 않으면 실행이 안ㄴ되게끔하는 문법
	//생성자는 메서드이다, 클래스의 이름과 동일한 이름의 메서드
	
	
	
	
	//해당 놀이기구는 나이가 13세 이상, 키가 150 이상이어야 탑승이 가능합니다.
	mytest9 mv=new mytest9();
	mv.test(m1);
	mv.test(m2);
	mv.test(m3);
	
}
}
class my9{
	
	//생성자(초기 세팅을 뺴먹지 못하도록
	//public my9() {
	//}  //
	//생성자 오버로딩(매개변수만 바꿔놓기)
	public my9(int age, String name, double H) {
		this.age = age;
		this.name = name;
		this.H = H;
	}
	
	private int age;
	private String name;
	private double H;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getH() {
		return H;
	}
	public void setH(double h) {
		H = h;
	}
	
	//메서드
	
}
//탑승 가능을 판별해주는 클래스
class mytest9{
	public void test(my9 mc) {
		if(mc.getAge()<13) {
			System.out.println(mc.getName()+": 나이가 적습니다. 탑승불가.");
			
		}
		else if(mc.getH()<150) {
			System.out.println(mc.getName()+": 키가 적습니다. 탑승불가.");
		}
		else {
			System.out.println(mc.getName()+": 탑승가능");
		}
	}
}