public class WarShip extends Weapon{
	public void attack(){
		System.out.println("¾ü½¢¹¥»÷£¡");
	}
	public void move(){
		System.out.println("¾ü½¢ÒÆ¶¯£¡");
	}
	public static void main(String[] args){
		WarShip warship = new WarShip();
		warship.attack();
		warship.move();
	}
}