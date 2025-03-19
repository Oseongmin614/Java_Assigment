package kr.ac.kopo.day10.homework;



public class StringUtil {
	 public static boolean isUpper(char c) {
		 
		// System.out.println((int)c);
		 if((int)c>=65&&(int)c<=90)
	        return true;
		return false;
	    }
	 
	 public static boolean isLowerChar(char c) {
		 if((int)c>=97&&(int)c<=122)
		        return true;
			return false;
	 }
	 
	 public static int max( int i, int j){		 return (i>j?i:j);}
	 public static int min( int i, int j){		 return (i<j?i:j);}
	 
	 public static String  reverseString( String str ) {
		 String restr="";
		 for(int i=str.length() - 1;i>=0;i--) {
			 restr += str.charAt(i);
		 }
		 return restr;
	 }
	 
	 public static String  toUpperString( String str ) {
		 char[] c=new char[str.length()];
		 for(int i=0;i<str.length();i++) {
			 if(isLowerChar(str.charAt(i)))
				 c[i]=(char)((int)str.charAt(i)-32);
			 else
				 c[i]=str.charAt(i);
		 }
		 return String.valueOf(c);
	 }
	 public static String  toLowerString( String str ) {
		 char[] c=new char[str.length()];
		 for(int i=0;i<str.length();i++) {
			 if(isUpper(str.charAt(i)))
				 c[i]=(char)((int)str.charAt(i)+32);
			 else
				 c[i]=str.charAt(i);
		 }
		 return String.valueOf(c);
	}
	 
	public static int compareTo(String str1, String str2) {
		int a=0;
		if (str1.length() - str2.length() != 0) {				//길이가다를경우 길이의 차이를 구한다.
			return str1.length()>str2.length()?str1.length() - str2.length():str2.length() - str1.length();	}
		for(int j=0; j<str1.length();j++) {
			//System.out.println(str1.charAt(j)+""+str2.charAt(j));
			if(str1.charAt(j)!=str2.charAt(j)) {
				//System.out.println("차이발생");
			return (int)str1.charAt(j)-str2.charAt(j);}
		}
		return a;
	}
	
	public static int checkChar(String strData, char ch) {
		int a=0;
		for(int i=0;i<strData.length();i++) {
			if(strData.charAt(i)==ch) {
				a++;
			}
		}
		return a;
	}
	
	public static String removeChar(String oriStr, char delChar) {
		String str="";
		for(int i=0;i<oriStr.length();i++) {
			if(oriStr.charAt(i)==delChar) {
				oriStr=oriStr.substring(0, i)+oriStr.substring(i+1, oriStr.length());  
			}
		
		}
		return oriStr;
	}
}










