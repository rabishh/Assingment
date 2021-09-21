package com.codebind;
import java.util.Scanner;
public class Maximumandminimum {
	public static void main(String args[]) {
	int[] arr= {11,2,3,4,5,6,7,9,10,56};
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
		max=arr[i];
		}
		
		}
	System.out.print(max);
}
	}



