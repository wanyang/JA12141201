/*
	������е�ˮ�ɻ���  ˮ�ɻ���������λ���ĸ�λʮλ��λ�����η��ͣ�
	����153=1^3+5^3+3^3
	
	������
		����һ����λ���Ƿ�Ϊˮ�ɻ���������Ҫ֪�������λ���ĸ�λ��ʮλ����λ�ϵ�����
		��λ��x%10;
		ʮλ��x/10%10;
		��λ��x/100%10;
*/
public class Shuixianhua{

	public static void main(String[] args){
		
		int count = 0;
		//��ȡ���е���λ��,����ȡ��λ���ĸ�λ��ʮλ����λ�ϵ�����
		for(int x=100;x<1000;x++){
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;
		
			if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)){
				count++;
				System.out.println(x);
				System.out.println(count);
			}
		}
	}
}