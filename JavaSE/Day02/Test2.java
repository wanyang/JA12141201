import java.util.*;
public class Test2{
	public static void main(String args[]){
		System.out.println("************");
		System.out.println("人事管理系统");
		System.out.println("Please input function(1-3):");
		Scanner in=new Scanner(System.in);
		int function = in.nextInt();
		switch(function){
		case 1:
		System.out.println("添加用户");
		break;
		case 2:
		System.out.println("查询用户");
		break;
		case 3:
		System.out.println("退出用户");
		break;
		}
	
	}
}