/*
	数组遍历
*/

public class ArrayArray{
	public static void main(String[] args){
		//一维数组遍历
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			
				System.out.println(arr[i]);
		}
		System.out.println("------------");
		
		
		//二维数组遍历
		int[][] arr1 = new int[5][4];
		for(int i=0;i<arr1.length;i++){
			
			int[] a = arr1[i];
			for(int j=0;j<a.length;j++){
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		
	}
}