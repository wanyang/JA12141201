public class ArrayDemo{
	public static void main(String[] args){
		
		//����һ������
		int[] arr = {32,18,21,43,84,91};
		
		//���������������
		printArray(arr);
		
		System.out.println("---------");
		
		//�����ȡ���������ֵ�ķ���
		int max = getMax(arr);
		System.out.println(max);
	}
	
	//�����������
	public static void printArray(int[] arr){
		
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}
	
	//��ȡ���������ֵ�ķ���
	public static int getMax(int[] arr){
		//ѡȡ����ֵ
		int max = arr[0];
		for(int x=1;x<arr.length;x++){
			if(max<arr[x]){
				max = arr[x];
			}
		}
		return max;
	}

}