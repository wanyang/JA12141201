import java.util.*;
public class Test2{
	public static void main(String args[]){
		System.out.println("************");
		System.out.println("���¹���ϵͳ");
		System.out.println("Please input function(1-3):");
		Scanner in=new Scanner(System.in);
		int function = in.nextInt();
		switch(function){
		case 1:
		System.out.println("����û�");
		break;
		case 2:
		System.out.println("��ѯ�û�");
		break;
		case 3:
		System.out.println("�˳��û�");
		break;
		}
	
	}
}