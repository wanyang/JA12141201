public class WarShip extends Weapon{
	public void attack(){
		System.out.println("����������");
	}
	public void move(){
		System.out.println("�����ƶ���");
	}
	public static void main(String[] args){
		WarShip warship = new WarShip();
		warship.attack();
		warship.move();
	}
}