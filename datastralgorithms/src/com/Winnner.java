package com;

public class Winnner {

	public static void main(String[] args) {
		
		int arr1[]= {4,2,7};
		int arr2[]= {5,2,8};
		int acount=0;
		int bcount=0;
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]>arr2[i]) {
				acount++;
			}
			else if(arr1[i]<arr2[i]) {
				bcount++;
			}
		}
		System.out.println(acount+" "+bcount);
	}
}
