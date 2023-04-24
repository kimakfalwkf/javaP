package ex1_enum;



public class TranceportationMain {
public static void main(String[] args) {
//values(): 열겨형 상수 안에 들어있는 내용을 enum 타입의 매열로 반환
	
	Transportation[] trans=Transportation.values();
	
	for(int i=0; i<trans.length; i++) {
		System.out.printf("name: %s, 100km-fare: %d\n",trans[i].name(),trans[i].totalFare(100));
		//System.out.println("name: "+trans[i].name()+", 100km-fare: "+trans[i].totalFare(100));
	}
	
}
}
