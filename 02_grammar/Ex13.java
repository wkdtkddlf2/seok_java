class Ex13 {

	public static void main(String[] args) {
		// 2시간 40분 30초는 몇초인가?

		int h = 2 * 60 * 60; // 시간 => 초 로바꿈
		int m = 40 * 60; // 분 =>초
		int s = 30;
		int result = h + m + s;

		System.out.println("2시간 40분 30초는" + result + "이다.");

	}

}