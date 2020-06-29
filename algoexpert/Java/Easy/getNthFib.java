import java.util.*;

class Program {
  public static int getNthFib(int n) {
		if (n <= 1)
			return 0;
		if (n <= 2)
			return 1;
    int[] res = new int[n+1];
		res[1] = 1;
		for (int i = 2; i < n; i++) {
			System.out.println(res[i-1] + "   "+ res[i-2]);
			res[i] = res[i-1] + res[i-2];
		}
    return res[n-1];
  }
}
