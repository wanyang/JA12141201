public class ArrayDemo{
	public static void main(String[] args){
		
		//创建一个数组
		int[] arr = {32,18,21,43,84,91};
		
		//定义数组遍历方法
		printArray(arr);
		
		System.out.println("---------");
		
		//定义获取数组中最大值的方法
		int max = getMax(arr);
		System.out.println(max);
	}
	
	//数组遍历方法
	public static void printArray(int[] arr){
		
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}
	
	//获取数组中最大值的方法
	public static int getMax(int[] arr){
		//选取参照值
		int max = arr[0];
		for(int x=1;x<arr.length;x++){
			if(max<arr[x]){
				max = arr[x];
			}
		}
		return max;
	}

}