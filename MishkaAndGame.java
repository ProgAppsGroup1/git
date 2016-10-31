//http://codeforces.com/problemset/problem/703/A

import java.util.*;

public class MishkaAndGame {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=0,c=0;
		for(int i=0;i<n;i++){
			int a=sc.nextInt(), b=sc.nextInt();
			if(a>b)
				m++;
			else if(a<b)
				c++;
		}
		if(m>c)
			System.out.println("Mishka");
		else if(m<c)
			System.out.println("Chris");
		else
			System.out.println("Friendship is magic!^^");
	}
}