package ex1_generic;

public class GenEx<T> {
	//제네릭스:일반적일 코드를 작성하고 이 코드를 다양한 타입의 객체에 대하여 재사용하는 객체지향 기법
	//객체으의 타입을 컴파이로할떄 체크하기 떄문에 타입에 대한 안정성을 높히고 형변환을 해야하는 번거로움을 줄일 수 있다.
	
	//public class 클래스명<제네릭타입>{}
	//public interface 인터페이스명<제네릭타입>{}
	//T를 타입변수 (type variable)라고 하며 임의로 정해도 된다.
	
	//E(Element), K(key)v(value)를 사용하기도 한다
	
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
	
}
