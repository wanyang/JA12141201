/*
	1、从命令参数中接收姓名，在程序打印	
			Hello  xxxxx 
*/

import java.util.Scanner;
public class Name{
	public static void main(String[] args){
		//键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓名：");
		//创建对象
		String name = sc.nextLine(); 
		System.out.println("Hello" + " " + name);
	}
		
}