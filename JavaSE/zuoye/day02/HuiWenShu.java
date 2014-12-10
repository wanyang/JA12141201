/*
	4、回文数。      
		编写一个Java应用程序。用户从键盘输入一个1—9999之间的数，
		程序将判断这个数是几位数，并判断这个数是否是回文数。
		回文数是指将该数含有的数字逆序排列后得到的数和原数相同，
		例如12121、3223都是回文数。
*/
import java.util.Scanner;

public class HuiWenShu{
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
		
		int j = 0;
		while(j<(l + "").length()){
			a = a *10+i%10;//通过取模和求余把输入的数反过来
			i = i/10;
			j++;
		
		}
		//判断首尾交换后是否等于原值
		if(a==l){
			System.out.println("你输入的" + l + "是回文数");
		}else{
			System.out.println("你输入的" + l + "不是回文数");
		}
	}

}
