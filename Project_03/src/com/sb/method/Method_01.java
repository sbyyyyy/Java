package com.sb.method;

public class Method_01 {
	public static void main(String[] args) {
		System.out.println(num());
		/*
		 * num() 을 실행하고 그 결과를 console에 출력
		 * num() 은 main() 와 같은 class 내에 선언되어 있어야 한다
		 */
		System.out.println(add());
		/*
		 * add() 를 실행하고 그 결과를 console 에 출력
		 * add() 는 main() 과 같은 class 내에 선언되어 있어야 한다
		 */
		System.out.println(Math.random());
	}

	public static int num() {
		return 100;
	}

	public static int add() {
		int num1 = 200;
		int num2 = 300;
		return num1 + num2;
	}
}
