package com.study.b;

public class Var_01 {
	public static void main(String[] args) {
		boolean bTrue1 = true;
		boolean bTrue2 = true;

		if (bTrue1 && bTrue2) {
			System.out.printf("bTrue1 && bTrue2는 %b입니다.", bTrue1 && bTrue2);
		} else if (bTrue1 || bTrue2) {
			System.out.printf("bTrue1 || bTrue2는 %b입니다.", bTrue1 || bTrue2);
		}
	}
}
