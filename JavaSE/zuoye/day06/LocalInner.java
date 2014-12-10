/*
	二、分别编写:
		成员内部类
		局部内部类
		静态内部类
		匿名内部类
		之后完成内部类和外部类的属性和方法间的访问、调用测试。
*/
   //成员内部类
class LocalInner{

    public void execute(){
        final int a = 1;
        /**
 * 创建局部内部类
 */
        class InnerClass{
            public void execute(){
                System.out.println("LocalInner Class");

                //局部内部类只能访问final类型的变量
                System.out.println(a);
            }
        }
        //只能在所在方法区域创建
        new InnerClass().execute();
    }
	public static void main(String[] args) {
    //外部不能直接创建局部内部类
		LocalInner localInner = new LocalInner();
		localInner.execute();
	}
}

















