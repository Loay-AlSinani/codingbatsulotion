public int[] fizzArray3(int start, int end) {
    int length = end - start;
    int[] result = new int[length];
    for (int i = 0; i < length; i++) {
        result[i] = start + i;
    }
    return result;
}
