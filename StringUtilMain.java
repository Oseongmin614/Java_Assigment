package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class StringUtilMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char c;
		int i,j;
		
//        System.out.print("Enter a character: ");
//		c=sc.next().charAt(0);
		//		대문자 검사 메소드
//		boolean isUpper = StringUtil.isUpper(c);
//		System.out.println("대문자 검사 " + isUpper);
		//소문자 검사
//		boolean isLowerChar = StringUtil.isLowerChar(c);
//		System.out.println("소문자 검사 " + isLowerChar);
		
//		System.out.print("숫자두개 입력 : ");
//		i=sc.nextInt();
//		j=sc.nextInt();
		//MAX
		//int max=StringUtil.max(i, j);
		//System.out.println("더큰수는?"+max);
		//MIN
		//int min=StringUtil.min(i, j);
		//System.out.println("더작은 수는?"+min);
		
		
		System.out.print("문자열 입력:");
		String str=sc.next();
		//문자열 거꾸로 출력
		//String reverseString = StringUtil.reverseString(str);
		//System.out.println("변경된 문자열:"+reverseString);
		//String toUpperString = StringUtil.toUpperString(str);
		//System.out.println("변경된 문자열:"+toUpperString);
		//String toLowerString = StringUtil.toLowerString(str);
		//System.out.println("변경된 문자열:"+toLowerString);
		System.out.print("문자열 입력:");
		String str2=sc.next();
		int comTo = StringUtil.compareTo(str,str2);
		System.out.println("문자열 차이는 :"+comTo);
	}
}
