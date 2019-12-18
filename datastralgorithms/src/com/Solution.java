package com;


import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	

	

	    // Complete the plusMinus function below.
	    static void plusMinus(int[] arr) {
	        double pz=0;
	        double ng=0;
	        double zo=0;
	    
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]==0){
	                zo++;
	            }
	            else if(arr[i]>0){
	               pz++;
	            }
	            else{
	                ng++;
	            }
	        }
	        DecimalFormat df = new DecimalFormat("###.###");
	        System.out.println(df.format(pz/arr.length));
	        System.out.println(df.format(ng/arr.length));
	        System.out.println(df.format(zo/arr.length));

	        //System.out.print(pz/arr.length+" "++" "+zo/arr.length);
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        plusMinus(arr);

	        scanner.close();
	    }
	
}
