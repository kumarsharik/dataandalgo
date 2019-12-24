package com;

public class SecondLargest {
public static void main(String[] args) {
	int arr1[]= {1,3,3,7,9,54,7,60,90,90}; 
	int temp ;
	int firstmax=0;
	int secondmax=0;
	for(int i=0;i<arr1.length;i++) {
	
			if((arr1[i]>secondmax ) ) {
				if(firstmax!=arr1[i])
				{	
				secondmax=firstmax;
				firstmax=arr1[i];
				}
				//secondmax=temp;
				
			}
			
			
		
	}
	System.out.println(secondmax);
}
}
