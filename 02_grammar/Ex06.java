class Ex06 {

	public static void main(String[] args) {
		// ���ڵ��� ũ�⿡ ���� ���� ����
		// byte < short < char < int < long < float < double

		// 1. �ڱ⺸�� ū �ڷ������δ� �����Ӱ� �����Ҽ��ִ�.(�ڵ�����ȯ.���θ��)

		int s1 = 'A';
		System.out.println(s1);

		long s2 = 241;
		System.out.println(s2);

		float s3 = s2;
		System.out.println(s3);

		double s4 = s3;
		System.out.println(s4);

		// 2. �ڱ⺸�� ���� �ڷ������� �����Ҷ��� �����߻�
		// �����߻��� �����ϱ����ؼ� ���������� �ڷ����� �����Ѵ�.
		// (���� ����ȯ,����,casting)
		// ������ ����ȯ�� �ϸ� �����Ͱ� ���� "�ɼ����ִ�".
		// ������ ����ȯ �ϴ� ���
		// = �� �������� ������ ���� �ڷ������� ������Ѵ�.
		// �ڷ��� �̸� = (�����ڷ���)(������)

		byte b1 = (byte) (129);
		System.out.println(b1);

		int b2 = 110;
		byte b3 = (byte) (b2);
		System.out.println(b3);

		float b4 = (float) (34.125);
		System.out.println(b4);

		int b5 = (int) (87.12);
		System.out.println(b5);

		// 3. char ����ȯ
		char c1 = 'a' + 2;
		System.out.println(c1);
		char c2 = 97 + 2;
		System.out.println(c2);

		// char�� ���°��� ���ڷ� ��������� �̷��� int ���
		int b6 = c2;
		System.out.println(b6);

	}

}