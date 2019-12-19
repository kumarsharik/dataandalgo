package com;

public class CheckArraySorted {
public static void main(String[] args) {
	boolean sorted=false;
	int arr1[]= {1,3,7,9,9}; 
	for (int i = 0; i < arr1.length-1; i++) {
		if(arr1[i]>arr1[i+1]) {
			System.out.println("0");
			sorted=true;
			break;
		}
	}
	if(sorted==false) {
	System.out.println("1");
	}
}
}
