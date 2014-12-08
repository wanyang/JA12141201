/*
	作业：键盘输入三个int型数值，并比较大小，输出最大值。
		A:导包
		B:键盘输入三个int型数值
		C:比较大小
		D:输出最大值max。
*/
import java.util.Scanner;

public class Max{
	public static void main(String[] args){
		//键盘输入三个int型数值
		Scanner sc = new Scanner(System.in);
		
		//请输入数据
		System.out.println("请输入第一个int型数值：");
		int x = sc.nextInt();
		System.out.println("请输入第二个int型数值：");
		int y = sc.nextInt();
		System.out.println("请输入第三个int型数值：");
		int z = sc.nextInt();
		
		//方法一
		/*
		//比较大小
		int temp = (x>y)?x:y;
		int max = (temp>z)?temp:z;
		//输出结果
		System.out.println("输入的三个数中最大值是：" + max);
		*/
		
		
		//方法二  if语句的嵌套
		
		if(x>y){
			if(x>z){
				System.out.println("输入的三个数中最大值是：" + x);
			}else{
				System.out.println("输入的三个数中最大值是：" + z);
			}
		}else{
			if(y>z){
				System.out.println("输入的三个数中最大值是：" + y);
			}else{
				System.out.println("输入的三个数中最大值是：" + z);
			}
		}

		
	}
}