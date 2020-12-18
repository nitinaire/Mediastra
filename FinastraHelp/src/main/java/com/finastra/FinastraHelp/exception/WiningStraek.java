package com.finastra.FinastraHelp.exception;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class WiningStraek {
	
	public static void main(String args[]){
		
		int[] arr = new int []{3, 6, 36, 32, 32, 121, 66, 24, 26, 371, 661, 6, 4, 8, -1};
		Set<Integer> ss = new LinkedHashSet<Integer>();
		for (int i=0;i<arr.length;i++) {
			if(arr[i]>1)
			ss.add(arr[i]);
			//System.out.println("element is"+arr[i]);
		}
		for (Integer integer : ss) {
			System.out.println("element is"+integer);
		}
		
		List<Integer> ll = new ArrayList<Integer>();
		System.out.println("sdsf is"+ll.get(11));
	}
	

}


