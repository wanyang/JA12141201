import java.util.Scanner;

public class work{
	public static void main(String[] args){
		long a = 0;
		System.out.println("����һ����");
		//�Ӽ�������һ����
		
		Scanner sc = new Scanner(System.in);
		
		long i = sc.nextInt();
		
		//��Ϊ֮���i��䣬�����ȸ�ֵ��l
		
		long l = i ;
		
		//���������Ǽ�λ��
		
		System.out.println("�������" + i + "��" + (i + "").length() + "λ��");
		
		//ͨ��forѭ��  ���������β���� �õ� a
		
		for (int j=0;j<(i + "").length();j++){
			a = a *10+i%10;
			i = i/10;
		}
		//�ж���β�������Ƿ����ԭֵ
		if(a==l){
			System.out.println("�������" + l + "�ǻ�����");
		}else{
			System.out.println("�������" + l + "���ǻ�����");
		}
	}

}