/*
	4����������      
		��дһ��JavaӦ�ó����û��Ӽ�������һ��1��9999֮�������
		�����ж�������Ǽ�λ�������ж�������Ƿ��ǻ�������
		��������ָ���������е������������к�õ�������ԭ����ͬ��
		����12121��3223���ǻ�������
*/
import java.util.Scanner;

public class HuiWenShu{
	public static void main(String[] args){
		long a = 0;
		System.out.println("����һ����");
		//�Ӽ�������һ����
		
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextInt();
		
		//��Ϊ֮���i��䣬�����ȸ�ֵ��l
		
		long l = i ;
		
		//���������Ǽ�λ��
		
		System.out.println("�������" + (i + "") + "��" + (i + "").length() + "λ��");
		
		//ͨ��forѭ��  ���������β���� �õ� a
		
		int j = 0;
		while(j<(l + "").length()){
			a = a *10+i%10;//ͨ��ȡģ��������������������
			i = i/10;
			j++;
		
		}
		//�ж���β�������Ƿ����ԭֵ
		if(a==l){
			System.out.println("�������" + l + "�ǻ�����");
		}else{
			System.out.println("�������" + l + "���ǻ�����");
		}
	}

}
