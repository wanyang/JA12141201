import java.util.Scanner;

public class Score{
	public static void main(String[] agrs){
		//键盘输入成绩
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = sc.nextInt();
		//判断
		if(score>=90&&score<=100){
			System.out.println("A等");
		}else if(score>=80&&score<90){
			System.out.println("B等");
		}else if(score>=70&&score<80){
			System.out.println("C等");
		}else if(score>=60&&score<70){
			System.out.println("D等");
		}else if(score>=0&&score<60){
			System.out.println("E等");
		}else{
			System.out.println("输入成绩有误！");
		}
	
	
	}




}