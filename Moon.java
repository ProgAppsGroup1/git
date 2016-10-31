/* http://codeforces.com/problemset/problem/719/A */

import java.util.Scanner;

public class Moon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner s =  new Scanner(System.in);
		n = s.nextInt();
		int a[] = new int[n];
		for(i=0;i<a.length;++i){
			a[i] = s.nextInt();
		}
		if(a[n-1]==15)
			System.out.println("DOWN");
		else if(a[n-1]==0)
			System.out.println("UP");
		else if(n==1)
			System.out.println(-1);
		else if(a[n-2]<a[n-1])
			System.out.println("UP");
		else
			System.out.println("DOWN");
		
	}

}