/*
	2、编写一个应用程序绘制一个如下的操作菜单。	
			*****************************	
			|    1. 增加1个学生         |	
			|    2. 显示所有学生        |	
			|    3. 退出程序            |	
			|    请输入选择（1-3）：    |	
			*****************************
*/
import java.util.Scanner;
public class Menu{
	public static void main(String[] args){
		
		System.out.println("*****************************");
		System.out.println("|    1. 增加1个学生         |");
		System.out.println("|    2. 显示所有学生        |");
		System.out.println("|    3. 退出程序            |");
		System.out.println("|    请输入选择（1-3）：    |");
		System.out.println("*****************************");
		
		//键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入选择（1-3）：");
		int num = sc.nextInt();
		
		//switch 判断
		switch(num){
			case 1:
				System.out.println("增加1个学生");
				break;
			case 2:
				System.out.println("显示所有学生");
				break;
			case 3:
				System.out.println("退出程序");
				break;
			default:
				System.out.println("输入有误！！！");
		}
		
	}
}




















