public int[] rotLeft(int[] a, int d) {
    int[] temp = new int[a.length];
    if (a.length == d || d == 0)
        return a;
    int counter = 0;
    for (int i = d; i  < a.length; i++) {
        temp[counter] = a[i];
        counter++;
    }
    for (int i = 0; i < d; i++) {
        temp[counter] = a[i];
        counter++;
    }
    return a = temp;
}
