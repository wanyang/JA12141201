public class Flighter extends Weapon{
	public void attack(){
		System.out.println("ս��������");
	}
	public void move(){
		System.out.println("ս���ƶ���");
	}
	public static void main(String[] args){
		Flighter flighter = new Flighter();
		flighter.attack();
		flighter.move();
	}
}