public int[] squareUp(int n) {
    int[] result = new int[n * n];
    int index = 0;

    for (int i = 1; i <= n; i++) {
        for (int j = n; j >= 1; j--) {
            if (j > i) {
                result[index] = 0;
            } else {
                result[index] = j;
            }
            index++;
        }
    }

    return result;
}