



public class OverrideTest{
	static int add(int x,int y){
		return x+y;
	}
	
	
	static int add(int x,int y,int z){ 
		return x+y+z;
	}
	static double add (double x,double y){
		return x+y;
	}
	
	public static void main(String[] args){
		System.out.println(add(12,34));
		System.out.println(add(12,34,333));
		System.out.println(add(12.1,34.8));
	}
}	