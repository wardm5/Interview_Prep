// https://www.algoexpert.io/questions/Largest%20Range

import java.util.*;

// class Program {
//   public static int[] largestRange(int[] array) {
// 		Set<Integer> set = new HashSet<>();
// 		for (int i = 0; i < array.length; i++)
// 			set.add(array[i]);
// 		int res[] = new int[2];
// 		int length = 0;
// 		for (int i = 0; i < array.length; i++) {
// 			int count = 0, start = array[i], end = start;
// 			while (set.contains(end++)) {
// 				if (length  < end - start) {
// 					res[0] = start;
// 					res[1] = end-1;
// 					length = end-start;
// 				}
// 			}
// 		}
//     return res;
//   }
// }

// Better answer in my opionion.
class Program {
  public static int[] largestRange(int[] array) {
		if (array.length == 1)
			return new int[] {array[0], array[0]};
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < array.length; i++)
			pq.add(array[i]);
		int[] res = new int[2];
		int length = 0;
		while (!pq.isEmpty()) {
			int start = pq.remove(), end = start+1;
			while (pq.remove(end++)) {
				if (end-start > length) {
					length = end-start;
					res[0] = start;
					res[1] = end-1;
				}
			}
		}
    return res;
  }
}
