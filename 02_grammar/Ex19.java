
public class Ex19 {

	public static void main(String[] args) {
		// ���׿����� ������
		// int k1�� Ȧ������ ¦������ �Ǻ�����
		int k1 = 7;
		String res = (k1 % 2 == 0) ? "¦��" : "Ȧ��";
		System.out.println("k1 ��" + res + "�Դϴ�.");

		// int k2�� 60�̻��̸� �հ�, �ƴϸ� ���հ� �Ǻ�����
		int k2 = 76;
		res = (k2 >= 60) ? "�հ�" : "���հ�";
		System.out.println("k2 ��" + res + "�Դϴ�.");
		// char k3 = �빮������, �빮�ڰ� �ƴ��� �Ǻ�����
		char k3 = 'H';
		res = ((k3 >= 'A') && (k3 <= 'Z')) ? "�빮��" : "�빮�� �ƴ�";
		System.out.println("k3��" + res + "�Դϴ�.");

		// �ٹ��ð��� 8�ð������� �ð��� 8590�̰�
		// 8�ð��� �ʰ��� �ð� ��ŭ�� 1.5�� �����Ѵ�.
		// ���� �ٹ��� �ð��� 10�̴�.
		// �󸶸� �޾ƾ� �ϴ°� ?
		int time = 10;
		int dan = 8590;
		int pay = (time > 8) ? (int) ((8 * dan) + (time - 8) * dan * 1.5) : time * dan;
		System.out.println("��� :" + pay);

	}

}
