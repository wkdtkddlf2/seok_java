class Ex12 {

	public static void main(String[] args) {
		// 3989�ʴ� ��ð�,���,���� �ΰ�?
		int time = 3989;
		int h = 0;
		int m = 0;
		int s = 0;
		int res = 0; // ������

		// �ð� ���ϱ�= �� (3600�� ���� ���� �ð�)
		h = time / 3600; // int(��) = int / int

		// ������ ���ϱ�
		res = time % 3600;

		// �� ���ϱ� = ��
		m = res / 60;

		// �� ���ϱ� = ������
		s = res % 60;

		// ����ϱ�

		System.out.println(time + "�ʴ�" + h + "��" + m + "��" + s + "��");

	}

}