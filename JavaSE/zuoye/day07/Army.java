public class Army{

	private Weapon[] w;//����Weapon����w
	private int count = 0;
	
	//�ڹ��췽����ͨ����һ��int���͵Ĳ������޶���������ӵ�е������������
	public Army(int x){
		this.w = new Weapon[x];
	}
	
	public void addWeapon(Weapon wa){
		//�ж������Ƿ񳬳��������
		if(count<w.length){
			w[count] = wa;
			count++;
		}else{
			System.out.println("����װ��ʧ�ܣ�");
		}
	}
	
	public void attackAll(){
		//forѭ��ʵ������w[]��0������������������
		for(int i=0;i<count;i++){
			w[i].attack();
		}
	}
	
	public void moveAll(){
		//forѭ��ʵ������[]��0���������������ƶ�
		for(int i=0;i<count;i++){
			w[i].move();
		}
	}
}