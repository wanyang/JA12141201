/*
	1.����һ��20*5�Ķ�ά���飬�����洢ĳ�༶20λѧԱ��5�ſεĳɼ���
	  ��5�ſΰ��洢˳������Ϊ��core C++��coreJava��Servlet��JSP��EJB��
	 ��1��ѭ������ά�����ÿһ��Ԫ�ظ�0~100֮������������
	 ��2�������б�ķ�ʽ�����ЩѧԱ��ÿ�ſγ̵ĳɼ���
	 ��3��Ҫ���д������ÿ��ѧԱ���ܷ֣����䱣��������һ��һά�����С�
	 ��4��Ҫ���д����������ѧԱ��ĳ�ſγ̵�ƽ���֡�
*/
public class ArrayScore{
	public static void main(String[] args){
		int[][] arr = new int[20][5];
		int[] sum = new int[20];//ÿ��ѧ�����ܷ�
		int[] total = new int[5];
		
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				arr[i][j] = (int)(Math.random()*100);
			}
			//
			//
		}
		System.out.println("------------------------------------------------");
// **********************���ѧԱ��ÿ�ſγ̵ĳɼ�************************

		System.out.println("              ѧ���ɼ�");
		System.out.println("      coreC++    coreJava Servlet   JSP      EJB");
		for(int i=0;i<20;i++){
			System.out.print(i + "��ѧ�� ");
			for(int j=0;j<5;j++){
				System.out.print(arr[i][j]+"       ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
// ***********************ÿ��ѧԱ���ܷ�***********************
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				sum[i] = sum[i] + arr[i][j];	
			}
			System.out.println(i +"��ѧ���ܷ�" + sum[i]);
		}
		System.out.println("------------------------------------------------");
// ***********************����ѧԱ��ĳ�ſγ̵�ƽ����**********************
		System.out.println(" coreC++  coreJava  Servlet    JSP    EJB");
		for(int i=0;i<5;i++){
			for(int j=0;j<20;j++){
				total[i] = total[i] + arr[j][i];	
			}
			System.out.print("      " + total[i]/20);
		}
	}
}