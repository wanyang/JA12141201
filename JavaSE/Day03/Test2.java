public class Test2{
	public static void main(String args[]){
		int count = 0,i = 1;
		while(i<=100){
			if(i%3==0){
				System.out.println(i+"");
				count++;
			}
			if(count==5){
			break;
			}
			i++;
		}

	}
}