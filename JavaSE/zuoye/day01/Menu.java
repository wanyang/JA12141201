/*
	2����дһ��Ӧ�ó������һ�����µĲ����˵���	
			*****************************	
			|    1. ����1��ѧ��         |	
			|    2. ��ʾ����ѧ��        |	
			|    3. �˳�����            |	
			|    ������ѡ��1-3����    |	
			*****************************
*/
import java.util.Scanner;
public class Menu{
	public static void main(String[] args){
		
		System.out.println("*****************************");
		System.out.println("|    1. ����1��ѧ��         |");
		System.out.println("|    2. ��ʾ����ѧ��        |");
		System.out.println("|    3. �˳�����            |");
		System.out.println("|    ������ѡ��1-3����    |");
		System.out.println("*****************************");
		
		//��������
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѡ��1-3����");
		int num = sc.nextInt();
		
		//switch �ж�
		switch(num){
			case 1:
				System.out.println("����1��ѧ��");
				break;
			case 2:
				System.out.println("��ʾ����ѧ��");
				break;
			case 3:
				System.out.println("�˳�����");
				break;
			default:
				System.out.println("�������󣡣���");
		}
		
	}
}




















