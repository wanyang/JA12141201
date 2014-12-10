/*
	1.定义一个20*5的二维数组，用来存储某班级20位学员的5门课的成绩；
	  这5门课按存储顺序依次为：core C++，coreJava，Servlet，JSP和EJB。
	 （1）循环给二维数组的每一个元素赋0~100之间的随机整数。
	 （2）按照列表的方式输出这些学员的每门课程的成绩。
	 （3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
	 （4）要求编写程序求所有学员的某门课程的平均分。
*/
public class ArrayScore{
	public static void main(String[] args){
		int[][] arr = new int[20][5];
		int[] sum = new int[20];//每个学生的总分
		int[] total = new int[5];
		
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				arr[i][j] = (int)(Math.random()*100);
			}
			//
			//
		}
		System.out.println("------------------------------------------------");
// **********************输出学员的每门课程的成绩************************

		System.out.println("              学生成绩");
		System.out.println("      coreC++    coreJava Servlet   JSP      EJB");
		for(int i=0;i<20;i++){
			System.out.print(i + "号学生 ");
			for(int j=0;j<5;j++){
				System.out.print(arr[i][j]+"       ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
// ***********************每个学员的总分***********************
		for(int i=0;i<20;i++){
			for(int j=0;j<5;j++){
				sum[i] = sum[i] + arr[i][j];	
			}
			System.out.println(i +"号学生总分" + sum[i]);
		}
		System.out.println("------------------------------------------------");
// ***********************所有学员的某门课程的平均分**********************
		System.out.println(" coreC++  coreJava  Servlet    JSP    EJB");
		for(int i=0;i<5;i++){
			for(int j=0;j<20;j++){
				total[i] = total[i] + arr[j][i];	
			}
			System.out.print("      " + total[i]/20);
		}
	}
}