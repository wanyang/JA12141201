/*
	随机获取0-100之间的整数
*/
public class SuiJi{
	public static void main(String[] args){
		
		//一维数组随机获取整数
		int[] arr = new int[15];
		for(int i=0;i<15;i++){
			arr[i] = (int)(Math.random()*100);
			System.out.println(arr[i]);
		}
		System.out.println("-------------");
		//二维数组随机获取整数
		int[][] arr1 = new int[20][5];
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				arr1[i][j] = (int)(Math.random()*100);
				System.out.print("\t"+arr1[i][j]);
			}
			System.out.println();
		}
		
	}
}