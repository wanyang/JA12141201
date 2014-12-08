/*
	作业二：比较键盘输入的两个数是否相等。
	
	分析：
		A:导包
		B:键盘输入两个数值
		C:比较输入的数值是否相等
		D:输出结果
*/
import java.util.Scanner;
public class Equal{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//键盘输入两个数
		System.out.println("请输入第一个数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		
		//判断两个数是否相等
		boolean flag = (a==b);
		System.out.println("输出结果：" + flag);
		
	}
}