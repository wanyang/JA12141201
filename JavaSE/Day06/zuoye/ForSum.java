public class ForSum{
	public static void main(String[] args){
		int sum = 0;
		for(int x=1;x<=10;x++){
			sum = sum + x;	
		}
		System.out.println("1-10�ĺ�Ϊ��" + sum);
		
		System.out.println("------------------");
		
		int sum2 = 0;
		for(int x=0;x<=100;x+=2){
			sum2 = sum2+x;
		}
		System.out.println("1-100�ĺ�Ϊ��" + sum2);
	}
}