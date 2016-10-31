// http://codeforces.com/problemset/problem/717/C

import java.util.*;

public class Potions {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> l = new ArrayList<Long>();
		for(int i = 0; i < n; i++){
			l.add(sc.nextLong());
		}
		sc.close();
		Collections.sort(l);
		long res = 0;
		for(int i = 0; i < n; i++){
			res = (res + ((l.get(i) * l.get(n - 1 - i)) % 10007)) % 10007;
		}
		System.out.println(res);
	}

}