class Ex16 {

	public static void main(String[] args) {
		// �������� : &&(and, ����),||(or,����), !(not,������)
		// ���������� ���(������ ����) : boolean ��,�񱳿���,������
		// �������� ����� boolean��. ��, ���ǽĿ� ���ȴ�.

		// and (||, ����)
		// - �־��� ������ �ϳ��� true �϶� ����� true
		// - �־��� ������ true�� ������ ����� true
		// - true �� ������ ���� ������ ���� ����

		int su1 = 10;
		int su2 = 7;
		boolean result = false;

		result = (su1 >= 7) || (su2 >= 5);
		System.out.println("��� : " + result); // true = true || true

		result = (su1 >= 7) || (su2 <= 5);
		System.out.println("��� : " + result); // false =true || false

		result = (su1 <= 7) || (su2 >= 5);
		System.out.println("��� : " + result); // false =false && true

		result = (su1 <= 7) || (su2 <= 5);
		System.out.println("��� : " + result); // false =false && false

		System.out.println("=============================");

		// or�� �� ������ true�̸� �� ������ ���������ʴ´�.
		result = ((su1 = su1 + 2) > su2) || (su1 == (su2 = su2 + 5));
		System.out.println("��� : " + result);
		System.out.println("su1 :" + su1);
		System.out.println("su2 : " + su2);

		// su1=12
		// su2=12

		System.out.println("=============================");

		// not (!, ������)
		// -�־��� ������ �ݴ�� �����.
		// - true =>false, false => true
		result = true;
		System.out.println(result);
		System.out.println(!result);
		System.out.println(!!result);
		System.out.println(!!!result);

	}

}