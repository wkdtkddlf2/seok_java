class Ex04 {

	public static void main(String[] args) {
		// ���� : ������(�Ҽ����̾���) < �Ǽ���(�Ҽ����� ����)
		// ������ : byte < short < int < long
		// �������� �⺻�� int

		// �Ǽ��� : float < double
		// �Ǽ����� �⺻�� double

		// byte : �������� ���� �������� ( -128 ~ 127 )������ ���ڸ� ���尡��
		byte b1 = 127;
		System.out.println(b1);

		// ������ ����� ����ȴ�.
		// byte b2 = 15 + 120 ;
		// System.out.println(b2);

		// short : -32768 ~ 32767 ������ ���� ���尡��
		short s1 = -32768;
		System.out.println(s1);

		short s2 = 32767;
		System.out.println(s2);

		// int�� long�� ���� ������ �ܿ� �ʿ�¾���
		// ������ �Ϲ����� ������ int ���
		// ���� ū ������ ����Ҷ��� long ���

		int su1 = 247;
		int su2 = 7777777;
		System.out.println(su1);
		System.out.println(su2);

		// long : int ���� �� ���� ������ �������ִ�.
		// �⺻������ ���ڵڿ� �빮��L �Ǵ� �ҹ���l �����δ�.(��������)
		long num1 = 124L;
		System.out.println(num1);

		// ���� �ڷ���(124)�� ū�ڷ���(long)�� ����Ǵ°��� ������ �����ʴ´�.
		long num2 = 124;
		System.out.println(num2);

		// ���� su1 �� long num3������
		long num3 = su1;
		System.out.println(num3);

		// short s1�� long num4�� ����
		long num4 = s1;
		System.out.println(num4);

		// short s1�� int su3�� ����
		int su3 = s1;
		System.out.println(su3);

		char c1 = '��';
		System.out.println(c1);

		int su4 = c1;
		System.out.println(su4);

	}

}