class Ex14 {

	public static void main(String[] args) {
		// �񱳿����� : >,<, >=, <=, ==(����), !=(�����ʴ�=�ٸ���)
		// �� �����ڸ� ��� �Ҽ� �ִ� �ڷ��� : char,����,�Ǽ�
		// ���� ����� ������ boolean ��(true�ƴϸ�false) => ���ǽĿ� ���ȴ�.

		int su1 = 90;
		int su2 = 80;

		char su3 = 'a';
		char su4 = 'A';

		double su5 = 97.0;
		double su6 = 78.0;

		boolean result = su1 > su2;
		System.out.println("��� : " + result);

		result = su3 > su4;
		System.out.println("��� : " + result);

		result = su5 > su6;
		System.out.println("��� : " + result);

		result = su1 > su3;
		System.out.println("��� : " + result);

		result = su1 > su5;
		System.out.println("��� : " + result);

		result = su3 == su5;
		System.out.println("��� : " + result);

	}

}