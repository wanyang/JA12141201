public class ForTest{
	public static void main(String args[]){
		long result = 0;
		long f = 1;
		for(int i = 1; i< 10; i++){
			f *= i;
			result += f;
		}
		System.out.println("result=" + result);
	}
}