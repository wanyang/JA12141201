import java.util.Scanner;

public class work{
	public static void main(String[] args){
		long a = 0;
		System.out.println("输入一个数");
		//从键盘输入一个数
		
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextInt();
		
		//因为之后的i会变，所以先赋值给l
		
		long l = i ;
		
		//输出这个数是几位数
		
		System.out.println("你输入的" + (i + "") + "是" + (i + "").length() + "位数");
		
		//通过for循环  让这个数首尾交换 得到 a
		
		for (int j=0;j<(i + "").length();j++){
			a = a *10+i%10;
			i = i/10;
		}
		//判断首尾交换后是否等于原值
		if(a==l){
			System.out.println("你输入的" + l + "是回文数");
		}else{
			System.out.println("你输入的" + l + "不是回文数");
		}
	}

}
