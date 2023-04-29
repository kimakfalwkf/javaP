package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01_work1 {
public static void main(String[] args) {
	List<String>list=new ArrayList<String>();  //Array생략가능
	
	
	Scanner sc=new Scanner(System.in);
	outer: while(true) {
		System.out.println("아이디 생성: ");
		String id=sc.next();
	
//위 코드에서 중복 아이디를 검사하는 로직 추가
	for(int i=0; i<list.size();i++)	{
		if(id.equals(list.get(i))) {
			System.out.println("중복된 아이디 입니다.");
			continue outer; //이렇게 사용할 떄 아우터 위치 라벨을 정해줘야 함

		}
	}
		
		
//	if(list.contains(id)) {     //위 식의 간단한 버전
//		System.out.println("중복된 아이디 입니다.");
//		continue;
//	}
	
	list.add(id);
	for(String str : list) {
		System.out.println(str+" ");
	}
	System.out.println();

}










}


}
