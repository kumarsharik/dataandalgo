package com;

public class CheckSimilarity {
	
	/* asajfdjfg */
public static void checkSimi(String str) {
	int s=str.length();
	int i=0;
	while(i<s) {
		if(str.charAt(0)!=str.charAt(i)) {
			System.out.print("NO");
			return;
		}
		i++;
	}
	System.out.println("YES");
	
}
public static void main(String[] args) {
	String st= "qqqqqqqqqqqq";
	checkSimi(st);
	System.out.println("done");
}
}
