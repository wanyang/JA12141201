//������ֻ�ܴ��һ������
//���飺���ͬ���������͡������������͡������������͡�����Ԫ�أ��±귶Χ��0��N-1��
//�ص㣺1�������������ǿ  2�����ȹ̶� 3���ƶ�����Ч�ʵ�
public class ArrayTest{   //only
     public static void main(String[] args){
	       //�������飺������ջ�ռ䣺�����б������ֲ��������β�
		   int[] arr;     //����ʹ������
		   int   arr1[]; 
		   // int test[10];    //��������ʱ��������ָ����С
		   
		  //��ʼ��������ָ����С����ʽ����ʽ�� �����ռ�
		   //�����ռ�+��ʼ��ֵ=�ڶѿռ�洢
		   arr = new int[10];//��ʽ
		   arr1 = new int[] {1,2,4}; //��ʽ
		   
		   System.out.println("arr [0]=" + arr [0]);
		   
		   
		 // ����+��ʼ��
		   String[] str =  new String[5]; // Ĭ�ϳ�ʼ������̬��ʼ��
		   Object[] obj = new  String[5]; //ʵ��Ԫ������  ���������͵�����
		   
		   
		   String[] IT =  new String []{"Java","C","C++","Android"};
		   String[] IT1 =              {"Java","C","C++","Android"};
		   //������=0���ã�����ֻ��ʹ��һ�����
		   System.out.println(
		       (new String []{"Apple","Google","Alibaba","Tesla"})[2]
		   );
	 
	     // ʹ������
		 System.out.println("IT[0]=" + IT[0] );
	 
	     //����������
		 // for+ ���鳤��
		 for (int i=0;i<IT.length;i++){
		     System.out.println("IT:" +  IT[i] + "\t");
		 }
		 // for each :�������顢����
		 for (String  ele : IT){
			System.out.println("IT" + ele);
		}
			
			//���鿽��
		String[] it_copy = IT ;
		for (String  ele : it_copy){
			System.out.println("IT" + ele);
		}
		
		//������
		for (String str1 : args){
		    System.out.println(str1);
		}
		
		
		
		
	}		
}