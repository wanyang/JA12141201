/*
	����
*/
public class Test{
	public static void main(String[] args){
		Army army = new Army(10);// ����һֻ���ӣ���������Ϊ6
		Weapon tank = new Tank();
		Weapon flighter = new Flighter();
		Weapon warship = new WarShip();
		// ��������������
		army.addWeapon(tank);
		army.addWeapon(flighter);
		army.addWeapon(warship);
		army.moveAll();
		army.attackAll();
	
	}
}