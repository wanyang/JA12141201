import java.util.*;
public class Score{
	public static void main(String args[]){
		System.out.println("Please input your score：");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if(score>100||score<0){
			System.out.println("输入不合法!");
			return;
		}else{
		String type = score < 60?"不及格":"及格";
		System.out.println("type=" + type);
		}
		int x = -100;
		int flag = x > 0?1:(x==0?0:-1);
		System.out.println("flag="+ flag);
	}
}