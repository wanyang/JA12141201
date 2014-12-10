import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ArrayUtils {
	/**
	 * ����һ�����߷��������߷������ַ����������ҵ���Ӧ���ַ���Ԫ�ص�λ��
	 * 
	 * @param array
	 *            ����������
	 * @param target
	 *            �������ַ���
	 * @return Ŀ���ַ������ֵ�λ��,-1�����Ҳ���
	 */
	public static int search(String[] array, String target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && array[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
}

public class SuoHa {

	// ��������ж��������
	private static final int PLAY_NUM = 5;
	// �����˿��ƵĻ�ɫ
	private String[] types = { "����", "�ݻ�", "����", "����" };
	// �����˿��Ƶ���ֵ
	private String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K", "A" };
	// ����LinkedList���� ��������˿���
	private List<String> cards = new LinkedList<String>();
	// �����������
	private String[] players = new String[PLAY_NUM];
	// ����һ��List���ϵ����� ������� ������ϵ��˿���
	@SuppressWarnings("unchecked")
	private List<String>[] playerCards = new List[PLAY_NUM];

	/**
	 * ���� һ�� �˿���
	 */
	public void initCards() {
		System.out.println("------------��һ���˿ˣ���-----------\n\n");

		for (int i = 0; i < types.length; i++) {
			for (int j = 0; j < values.length; j++) {
				cards.add(types[i] + values[j]);
			}
		}
	}

	/**
	 * ϴ��
	 */
	public void washCards() {
		System.out.println("---------------ϴ���С�����---------------\n");
		System.out.println("---------------ϴ���С�����---------------\n");
		System.out.println("---------------ϴ���С�����---------------\n");
		Collections.shuffle(cards);
	}

	/**
	 * ��ұ���
	 * 
	 * @param name
	 *            ��ҵ����� �ã�����
	 * @throws Exception
	 */
	public void initPlayers(String... name) {
		if (name.length < 2) {
			// ��Ϊ���׳��쳣
			try {
				throw new Exception("��Ҳ�������");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (name.length > PLAY_NUM) {
			// ��Ϊ���׳��쳣
			try {
				throw new Exception("��ҳ�������");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < name.length; i++) {
			players[i] = name[i];
		}
	}

	/**
	 * ��ʼ����ҵ����� Suoha��ʼʱ ��ҵ����ƶ��ǿյ� ����ʹ��һ������Ϊ0��LinkedList ����ʾ
	 */
	public void initPlaterCards() {
		for (int i = 0; i < PLAY_NUM - 1; i++) {
			// �ж� ������� Ϊ �� �� �մ�
			if (players[i] != null && !players[i].equals("")) {

				playerCards[i] = new LinkedList<String>();
			}
		}
	}

	/**
	 * ���� ����������е��� û��ʵ������ ֻ���������
	 */
	public void checkCards() {
		System.out.println("---------------����---------------");
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < types.length; j++) {
				 System.out.print(types[j] + values[i]+"\t");
			}
			System.out.println();
		}
	}

	/**
	 * ����
	 * 
	 * @param first   ��һ������˭
	 * @param   i     �ڼ��ַ���     
	 */
	public void sendCards(String first,int j) {
		// ArrayUtils���Զ����һ����
		// search()�Զ������еķ���
		System.out.println("\n-----------�� "+j+" �ַ���,��"+first+"��ʼ����-----------");
		int firstP = ArrayUtils.search(players, first);
		if (firstP == -1) {
			try {
				throw new Exception("�Ҳ���������");

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = firstP; i < players.length; i++) {
			if (players[i] == null) {
				break;
			}

			playerCards[i].add(cards.get(0));
			cards.remove(0);
		}
		for (int i = 0; i < firstP; i++) {
			playerCards[i].add(cards.get(0));
			cards.remove(0);
		}
	}

	/**
	 * ����
	 */
	public void showCards() {
		System.out.println("----------------------------------------");
		for (int i = 0; i < players.length; i++) {
			if (players[i] == null) {
				break;
			}
			System.out.print(players[i] + ":\t");
			for (String card : playerCards[i]) {
				System.out.print(card + "\t");
			}
			System.out.println();
		}
		
	}

	// ����
	public static void main(String[] args) {

		SuoHa sh = new SuoHa();
		// ��һ���˿�
		sh.initCards();
		// ����
		sh.checkCards();
		// ��ұ���
		sh.initPlayers("����", "��ү", "���", "С�ϱ�");
		// ϴ��
		sh.washCards();
		// ��û��ʼץ��
		sh.initPlaterCards();
		// ���� ÿ�ζ����ȷ���ү ��5��
		sh.sendCards("��ү",1);
		sh.showCards();
		
		sh.sendCards("��ү",2);
		sh.showCards();
		
		sh.sendCards("��ү",3);
		sh.showCards();
		
		sh.sendCards("��ү",4);
		sh.showCards();
		
		sh.sendCards("��ү",5);
		sh.showCards();

	}
}
