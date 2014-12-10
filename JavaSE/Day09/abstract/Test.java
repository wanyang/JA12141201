public class Test{
	public static void main(String[] args){
		//向上转型
		Shape s1 = new Triangle();
		Shape s2 = new Circle();
		
		s1.setColor("黑色");
		//强制类型转换，向下转型
		Triangle s = (Triangle)s1;
		s.setSides(0.3,0.4,0.5);
		
		s2.setColor("白色");
		//强制类型转换，向下转型
		Circle ss = (Circle)s2;
		ss.setRadius(3);
		
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}