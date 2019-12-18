package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MaxMinDeletion {
	
	public static void main(String[] arg) {
		
		int []arr= {1,8,2,11,9};
		
		
		
		ArrayList<Integer> a = new ArrayList<>(arr.length);

		for (int i : arr) {
			a.add(Integer.valueOf(i));
		}
	
		int count =2;
		int max =0;
		int min=0;
		int num=0 ;
		while(a.size()>1)
		{
			if(count%2==0)
			{
				for(int i=0 ; i<a.size()-2; i++)
				{
					for(int j=i+1 ; j<a.size()-1; j++)
					{
						if(a.get(i)> a.get(j))
						{
							if(max<a.get(i))
							{
								max =a.get(i);
								num =i;		
							}
						}else{
							
							if(max<a.get(j))
							{
								max =a.get(j);
								num =j;		
							}
						}
					}
					
					System.out.print(num);
					
				
				}
			}else {
				
				
				for(int i=0 ; i<a.size()-2; i++)
				{
					for(int j=i+1 ; j<a.size()-1; j++)
					{
						if(a.get(i)<a.get(j))
						{
							if(min<a.get(i))
							{
								min =a.get(i);
								num =i;		
							}
						}else{
							
							if(min<a.get(j))
							{
								max =a.get(j);
								num =j;		
							}
						}
					}
					
					System.out.print(num);
				
			}
				
				a.remove(num);
				count++;
		}
	}
		System.out.println(a);

}}
