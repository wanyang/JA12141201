/*
	��ҵ�����Ƚϼ���������������Ƿ���ȡ�
	
	������
		A:����
		B:��������������ֵ
		C:�Ƚ��������ֵ�Ƿ����
		D:������
*/
import java.util.Scanner;
public class Equal{
	public static void main(String[] args){
		//��������
		Scanner sc = new Scanner(System.in);
		
		//��������������
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		
		//�ж��������Ƿ����
		boolean flag = (a==b);
		System.out.println("��������" + flag);
		
	}
}