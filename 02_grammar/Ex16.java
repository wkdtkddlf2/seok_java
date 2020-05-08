class Ex16 {

	public static void main(String[] args) {
		// 논리연산자 : &&(and, 논리곱),||(or,논리합), !(not,논리부정)
		// 논리연산자의 대상(들어오는 정보) : boolean 형,비교연산,논리연산
		// 논리연산의 결과는 boolean형. 즉, 조건식에 사용된다.

		// and (||, 논리합)
		// - 주어진 조건중 하나라도 true 일때 결과는 true
		// - 주어진 조건중 true를 만나면 결과는 true
		// - true 를 만나면 이후 연산을 하지 않음

		int su1 = 10;
		int su2 = 7;
		boolean result = false;

		result = (su1 >= 7) || (su2 >= 5);
		System.out.println("결과 : " + result); // true = true || true

		result = (su1 >= 7) || (su2 <= 5);
		System.out.println("결과 : " + result); // false =true || false

		result = (su1 <= 7) || (su2 >= 5);
		System.out.println("결과 : " + result); // false =false && true

		result = (su1 <= 7) || (su2 <= 5);
		System.out.println("결과 : " + result); // false =false && false

		System.out.println("=============================");

		// or은 앞 조건이 true이면 뒤 조건을 연산하지않는다.
		result = ((su1 = su1 + 2) > su2) || (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);
		System.out.println("su1 :" + su1);
		System.out.println("su2 : " + su2);

		// su1=12
		// su2=12

		System.out.println("=============================");

		// not (!, 논리부정)
		// -주어진 논리값을 반대로 출력함.
		// - true =>false, false => true
		result = true;
		System.out.println(result);
		System.out.println(!result);
		System.out.println(!!result);
		System.out.println(!!!result);

	}

}