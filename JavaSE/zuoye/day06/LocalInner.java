/*
	�����ֱ��д:
		��Ա�ڲ���
		�ֲ��ڲ���
		��̬�ڲ���
		�����ڲ���
		֮������ڲ�����ⲿ������Ժͷ�����ķ��ʡ����ò��ԡ�
*/
   //��Ա�ڲ���
class LocalInner{

    public void execute(){
        final int a = 1;
        /**
 * �����ֲ��ڲ���
 */
        class InnerClass{
            public void execute(){
                System.out.println("LocalInner Class");

                //�ֲ��ڲ���ֻ�ܷ���final���͵ı���
                System.out.println(a);
            }
        }
        //ֻ�������ڷ������򴴽�
        new InnerClass().execute();
    }
	public static void main(String[] args) {
    //�ⲿ����ֱ�Ӵ����ֲ��ڲ���
		LocalInner localInner = new LocalInner();
		localInner.execute();
	}
}

















