import java.util.*;
public class Test{
	public static void main(String args[]){
		System.out.println("please input your choose(1-3):");
		Scanner in=new Scanner (System.in );
		int choose =in.nextInt();
		switch(choose ){
		case 1:
		System.out.println ("add a student");
		break;
		
		case 2:
		System.out.println ("show all the students");
		break;
		
		case 3:
		System.out.println ("exit process");
		break;
		}
	}
}
