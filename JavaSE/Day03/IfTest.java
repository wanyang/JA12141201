//��Ϥif����ʹ��
public class IfTest{
	public static void main(String args[]){
		//��һ�ָ�ʽ
		if(1 > 100){
			System.out.println("��һ�ָ�ʽ");
		
		}
		//�ڶ��ָ�ʽ
		boolean flag=true;
		if(flag){
			System.out.println("����booleanĬ��ֵ ��");
		}else{
			System.out.println("����booleanĬ��ֵ ��");
		}
		//�����ָ�ʽ
		int score = 56;
		if(score < 60){
			System.out.println("������");
		}else if(60 < score && score <80 ){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
	}
}