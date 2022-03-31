package com.sb.method;

public class Method_02 {
public static void main(String[] args) {
	int intNum = num();
	double douNum = doNum();
	long longNum = longNum();
	float fNum = floatNum();
	boolean bYes = bYes();
	String str =nation();

System.out.println(intNum);
System.out.println(douNum);
System.out.println(longNum);
System.out.println(fNum);
System.out.println(bYes);
System.out.println(str);
}
public static int num() {
	int intNum1 = 1;
	int intNum2 = 3;
	return intNum1 + intNum2;
}
public static double doNum() {
	double doNum1 = 1.11;
	double doNum2 = 3.55;
	return doNum1 + doNum2;
}
public static long longNum() {
	long longNum1 = 1655165165165161L;
	long longNum2 = 3874541695196515L;
	return longNum1 + longNum2;
}
public static float floatNum() {
	float floatNum1 = 1.6524f;
	float floatNum2 = 3.52456f;
	return floatNum1 + floatNum2;
}
public static boolean bYes() {
	boolean bTrue = true;
	boolean bFalse = false;
	return bTrue && bFalse;
}
public static String nation() {
	return "대한민국";
}
}
