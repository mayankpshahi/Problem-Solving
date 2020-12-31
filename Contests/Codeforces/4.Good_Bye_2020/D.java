
import java.io.*;
import java.util.*;
 
public class D extends PrintWriter {
	D() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		D o = new D(); o.main(); o.flush();
	}
 
	void main() {
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long w = 0;
			int[] ww = new int[n];
			Integer[] ii = new Integer[n];
			for (int i = 0; i < n; i++) {
				w += ww[i] = sc.nextInt();
				ii[i] = i;
			}
			Arrays.sort(ii, (i, j) -> ww[j] - ww[i]);
			int[] dd = new int[n];
			for (int h = 0; h < n - 1; h++) {
				int i = sc.nextInt() - 1;
				int j = sc.nextInt() - 1;
				dd[i]++;
				dd[j]++;
			}
			for (int h = 0; h < n; h++) {
				int i = ii[h];
				while (--dd[i] > 0) {
					print(w + " ");
					w += ww[i];
				}
			}
			println(w);
		}
	}
}
