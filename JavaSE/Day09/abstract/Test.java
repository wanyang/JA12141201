public class Test{
	public static void main(String[] args){
		//����ת��
		Shape s1 = new Triangle();
		Shape s2 = new Circle();
		
		s1.setColor("��ɫ");
		//ǿ������ת��������ת��
		Triangle s = (Triangle)s1;
		s.setSides(0.3,0.4,0.5);
		
		s2.setColor("��ɫ");
		//ǿ������ת��������ת��
		Circle ss = (Circle)s2;
		ss.setRadius(3);
		
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getType());
		System.out.println(s2.calPerimeter());
	}
}