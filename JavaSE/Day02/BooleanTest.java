public class BooleanTest{
	public static void main(String args[]){
		boolean flag = false;  //��true�� ��false��
		//boolean flag = 0;//error
		if(!flag){
			System.out.println("��");
		}else{
			System.out.println("��");
		
		}
		//ʹ��boolean���ַ��������������㣬boolean���Զ�ת�����ַ���
		//�������ַ��� +
		String str = false + "" + "geminno";
		System.out.println("str=" + str);
	}
}