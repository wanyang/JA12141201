/*
	��̬�ڲ���
*/

class StaticInner{
    private static int a = 1;

    /**
���� * ��̬�ڲ���
 ����* ���ɵ�������StaticInner$InnerClass
 ����*/
    public static class InnerClass{
        //��̬�ڲ������������̬�ĳ�Ա�������������ڲ��಻����
        private static int b = 1;
        public void execute(){
            //��̬�ڲ���ֻ�ܷ��ʾ�̬����
            System.out.println(a + b);
        }
    }
	public static void main(String[] args) {
    //������̬�ڲ���
		StaticInner.InnerClass innerClass = new StaticInner.InnerClass();
		innerClass.execute();
	}
}