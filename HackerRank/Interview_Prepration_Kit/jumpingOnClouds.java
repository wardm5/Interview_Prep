public static int jumpingOnClouds(int[] c) {
    int count = 0;
    for (int i = 0; i < c.length; i++) {
        // System.out.println(c[i] + "   " + i);
        if (i + 2 < c.length && c[i+2] == 0) {
            i++;
            count++;
            continue;
        } else if (i + 1 < c.length && c[i+1] == 0) {
            count++;
            continue;
        }
    }
    return count;
}
