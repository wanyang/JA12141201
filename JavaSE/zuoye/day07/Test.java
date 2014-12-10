/*
	测试
*/
public class Test{
	public static void main(String[] args){
		Army army = new Army(10);// 定义一只军队，武器上限为6
		Weapon tank = new Tank();
		Weapon flighter = new Flighter();
		Weapon warship = new WarShip();
		// 定义三种武器。
		army.addWeapon(tank);
		army.addWeapon(flighter);
		army.addWeapon(warship);
		army.moveAll();
		army.attackAll();
	
	}
}