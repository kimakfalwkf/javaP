package ex3_ramen;

public class CheeseRamen extends Ramen{

	String cheese="치즈";
	@Override
	public void makeRamen() {
	System.out.printf("%s %s %s\n",nudle,Soup,cheese);
		
	}

}
