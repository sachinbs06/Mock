package com;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		for(int i=1;i<=n;i++) {
			int c = 0;
			for(int j=1;j<=n;j++) {
				if (i%j==0) {
					c++;
				}
			}
			if(c==2) {
				System.out.println(i);
			}
		}

	}

}
