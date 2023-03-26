package array;

public class Arr2 {
public static void main(String[] args) {
	//배열은 하나의 주제로 여러 변수를 묶기 위해 만듬
	
	//카페에서 커피메뉴를 전시해야한다
	String m1="에스프레소";
	String m2="아메리카노";
	String m3="카페라테";
	//String m4="카페모카";  //메뉴에서 제거
	String m5="오랜지주스";
	
	//1, 메뉴 갯수를 바로 알 수 없음
	//2, 전체 출력이 불가능(메뉴 전시를 하려면 일일이 다써줘야함, 반복문 사용이 안되어 있어서)
	//>>같은 주제로 이루어진 변수는 배열을 통해 나열하는게 쉽다.
	
	String M[]= {"에스프레소","아메리카노","카페라테","카페모카","오랜지주스"};
	int s=M.length;
	System.out.println("메뉴의 총 갯수: "+s);
	
	for(int i=0;i<M.length;++i) {
		System.out.println(M[i]);
	}
	System.out.println("=="+M[0]+"==");
	
	m1="일반변수 바꾸기";
	M[0]="배열변수 바꾸기";//배열값 바꾸기
	System.out.println("=="+M[0]+"==");
	//배열을 ㅁ나들고 값을 채워넣고 싶다
	int nums[];
	nums= new int[3];  //num에 정수변수 총 3개를 연결
	
	nums[0]=1;
	nums[1]=2;
	nums[2]=3;
	
}
}
