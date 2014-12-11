/*
	获取数组中最小值
*/

public class ArrayMin{
	public static void main(String[] args){
		int[] arr = {31,21,13,81,52};
		int min = getMin(arr);
		System.out.println(min);
	}	
	public static int getMin(int[] arr){
			
		int min = arr[0];
		
		for(int x=1;x<arr.length;x++){
			if(min>arr[x]){
				min = arr[x];
			}
		}
		return min;
	}	
}