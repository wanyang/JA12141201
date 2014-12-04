public class CharTest{
	public static void main(String args[]){
		char eChar = 'J';
		char cChar = 'жа';
		char hexChar = '\u0061';
		char hexChar1 = '\u9999';
		char c = '\n';
		
		System.out.println("" + eChar + cChar + hexChar + hexChar1);
		System.out.println("" + eChar + cChar + c + hexChar + hexChar1);
		
	}
}