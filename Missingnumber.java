package com.codebind;

public class Missingnumber {
	public static void main(String args[]) {
	int a[]= {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
	int b=a.length+1;
	int c=b*(b+1)/2;
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];   
	}
	System.out.print("missing number is:-> "+(c-sum));
	}	

}
