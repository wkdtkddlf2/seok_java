package com.ict.edu;

public class Ex01 {
// 클래스
// 정의 : 객체(오브젝트(Object),인스턴스(Instance))를 만들기 위한 모든 정보를 
//        가지고 있는 파일( 설계도면, 거푸집 등으로 표현한다.)

// 클래스가 가지고 있는 것	: 데이터(상태값,속성), 기능(동작), 생성자
//  - 데이터(상태값, 속성) = 변수, 상수          => 멤버필드
//  - 기능	(동작)                                => 멤버메소드
//  - 생성자 = 클래스를 객체로 만들때 호출된다.  => 생성자
//    생성자 = 클래스이름 = 저장이름  

// 클래스의 구조 : 헤더, 멤버필드, 생성자, 멤버메소드
// 1. 헤더 : [접근제한자] [클래스종류] class 클래스이름{멤버필드,생성자,멤버메소드}
//    1) 접근제한자  : 클래스, 멤버필드, 멤버메소드, 생성자 모두 맨 처음 사용할 수 있다. 
//                     외부에서 접근할 수 있는 권한의 단계를 말한다.
//       가) public    : 누구나 다 접근 가능
//       나) protected : 같은 패키지와 상속관계에서는 접근이 가능 	
//       다) 생략      : default,  같은 패키지에서는 접근이 가능
//       라) private   : 외부에서는 절대 접근 불가, 내부멤버(멤버필드,멤버메소드)끼리는 접근 가능	
//    2) 클래스 종류 : 현재 클래스의 종류를 표시한다.
//                     일반적인 클래스는 이부분을 생략한다.
//                     특정 클래스에 해당하는 예약어를 사용(final, abstract)	
//    3) class : 클래스임을 나타내는 예약어
//    4) 클래스이름 : 저장이름=클래스이름=생성자 
//                    첫글자 대문자 나머지 소문자, 두 단어 이상일때 단어 첫글자는 대문자
//                    특수문자, 공백문자 사용 X, 숫자는 중간이나 뒤에 사용.	

// 2.멤버필드(변수와 상수) : 상태값, 데이터, 속성, 특징 
//   1) 변수 : 언제든지 변할 수 있는 데이터를 저장하는 공간
//             첫글자 소문자 나머지 소문자, 두 단어 이상일때 단어 첫글자는 대문자     
//   2) 상수 : 한 번 저장되면 변경할 수 없는 데이터를 저장하는 공간
//             모든 글자가 대문자, 단어와 단어 사이에 _(언더스코어)를 사용할 수 있다.

// 3. 멤버메소드 : 동작, 기능, 작동하는 것 
//  - 해당 메소드를 호출(실행)하면 해당 메소드 안에 존재하는 내용이 실행된다.
//	- 메소드는 다른 메소드를 호출할 수 있다.
//  - 해당 메소드를 호출해서 내용이 끝나면 메소드를 호출한 곳으로 되돌아 간다.
//  1) 메소드 구성 : [접근제한자] [메소드종류] 반환형 메소드이름([인자=매개변수]){실행 내용}
//    가) 접근제한자 : class 접근 제한자와 같음
//        - public, protected, 생략, private
//    나) 메소드 종류 : 일반메소드는 이 부분을 생략한다.
//                      특정 메소드일 때 특정메소드에 해당하는 예약어를 사용(static)
//    다) 반환형 : 해당 메소드를 호출한 곳으로 되돌아 갈때 결과의 자료형을 말한다.
//                 만약에 결과를 가지고 가지 않으면 void라는 예약어를 사용한다.
//      예)  public static void main(String[] args){} 
//          => 메소드이름은 main이고 해당 메소드를 호출한 JVM에게 아무것도 가져가지 않는다.
//    라) 메소드이름 : 첫글자 소문자 나머지 소문자, 두 단어 이상일때 단어 첫 글자 대문자
//    마) 인자 : 메소드가 실행될때 필요한 정보를 외부에서 받아서 사용 한다.
//           ** 메소드 이름이 같아도 인자 갯수와 인자 자료형이 다르면 다른 메소드로 판단
//           => 오버로딩 : 메소드 이름이 같지만 인자가 다르거나 인자 갯수가 다를때 
//                         한 클래스 안에서 같은 이름의 메소드가 여러개 존재하는 것
//                        (단, 인자의 개수와 자료형은 달라야 한다.) 	
//    바) ** getter() :  호출하는 입장에서 메소드를 이용해서 변수값을 추출할때 
//        ** setter() :  호출하는 입장에서 메소드를 이용해서 변수값을 변경할때 	

// 4.static과 instance  : 멤버메소드와 멤버 필드에 공통으로 해당 되는 사항
//  1) instance(인스턴스) : 객체 생성 
//    	- 인스턴스 필드, 인스턴스 메소드 => 객체가 생성될 때 같이 생성되는 필드와 메소드 
//      - 일반적인 클래스이 멤버메소드나 멤버 필드는 모두 인스턴스이다.    	
//      - 호출방법 : 객체참조변수.멤버필드,  객체참조변수.멤버메소드
//      - heap 메모리에 만들어진다.	

//  2) static
//      - 객체 생성과 상관없이 미리 만들어진 멤버필드와 멤버메소드 
//      - static는 반드시 메소드나 필드에 static 이라고 표시를 해야 된다.
//      - 언제든지 호출 해서 사용 가능
//      - static 메모리에 만들어진다.	
//      - 호출방법 : 클래스이름.멤버필드, 클래스이름.멤버메소드 
//      - 대표적인 예)  : System.out.println(), main메소드()   	

// 5. 생성자 : 클래스를 객체로 만들 때 한번 호출 된다.
//   1) 목적 : 멤버필드(변수와 상수)의 초기값을 지정한다.
//   2) 형식 : - 클래스 이름과 생성자는 같다.
//             - 반환형이 없는 메소드와 같다.
//	 3) 클래스를 객체로 만드는 방법 
//       예) : Scanner      sc  =  new Scanner(System.in);
//             클래스  참조변수 =  new	생성자
//   4) 모든 클래스는 반드시 생성자를 가지고 있다.
//      생성자가 없는 클래스는 기본 생성자가 생략되어 있는 것이다.
//      기본 생성자란 인자가 없는 생성자를 말한다. ( 예) 클래스이름()  )
//   5) 멤버필드와 멤버메소드를 사용하기 위한 접근법 
//   	객체참조변수.멤버필드,  객체참조변수.멤버메소드
//      예) sc.next(),  sc.nextInt();
//   6) 생성자도 오버로딩이 가능하다.즉 하나의 클래스 안에 여러개의 생성자가 존재할 수 있다.

}
