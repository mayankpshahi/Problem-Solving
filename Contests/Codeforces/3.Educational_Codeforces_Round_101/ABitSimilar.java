import java.io.*;
import java.util.*;
 
public class ABitSimilar extends PrintWriter {
	ABitSimilar() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		ABitSimilar o = new ABitSimilar(); o.main(); o.flush();
	}
 
	boolean[] used = new boolean[1 << 20];
	void main() {
		int q = sc.nextInt();
		while (q-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			byte[] cc = sc.next().getBytes();
			int l = 1;
			for (int m = n - k + 1; m > 1; m >>= 1)
				l++;
			l = Math.min(l, k);
			Arrays.fill(used, 0, 1 << l, false);
			int a = 0, b = (1 << l) - 1, cnt = 0;
			for (int i = 0; i < n; i++) {
				a = (a << 1 | cc[i] - '0') & b;
				if (i >= l && cc[i - l] == '1')
					cnt++;
				else
					cnt = 0;
				if (i >= k - 1 && cnt >= k - l)
					used[a] = true;
			}
			for (a = 0; a <= b && used[a ^ b]; a++)
				;
			if (a <= b) {
				println("YES");
				for (int i = 0; i < k; i++)
					cc[i] = (byte) (i < k - l ? '0' : '0' + (a >> k - 1 - i & 1));
				println(new String(cc, 0, k));
			} else
				println("NO");
		}
	}
}