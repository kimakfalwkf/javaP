package ex2_generic;

public class Gen//<T> //생략하면 변수 여래개 안써도 
{

	public <T> void printArr(T[] arr) {
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]+" ");
			
		}
		
	}
	
}
