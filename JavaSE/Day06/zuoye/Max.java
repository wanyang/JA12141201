/*
	��ҵ��������������int����ֵ�����Ƚϴ�С��������ֵ��
		A:����
		B:������������int����ֵ
		C:�Ƚϴ�С
		D:������ֵmax��
*/
import java.util.Scanner;

public class Max{
	public static void main(String[] args){
		//������������int����ֵ
		Scanner sc = new Scanner(System.in);
		
		//����������
		System.out.println("�������һ��int����ֵ��");
		int x = sc.nextInt();
		System.out.println("������ڶ���int����ֵ��");
		int y = sc.nextInt();
		System.out.println("�����������int����ֵ��");
		int z = sc.nextInt();
		
		//����һ
		/*
		//�Ƚϴ�С
		int temp = (x>y)?x:y;
		int max = (temp>z)?temp:z;
		//������
		System.out.println("����������������ֵ�ǣ�" + max);
		*/
		
		
		//������  if����Ƕ��
		
		if(x>y){
			if(x>z){
				System.out.println("����������������ֵ�ǣ�" + x);
			}else{
				System.out.println("����������������ֵ�ǣ�" + z);
			}
		}else{
			if(y>z){
				System.out.println("����������������ֵ�ǣ�" + y);
			}else{
				System.out.println("����������������ֵ�ǣ�" + z);
			}
		}

		
	}
}