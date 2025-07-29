public int commonTwo(String[] a, String[] b) {
    int count = 0;
    int i = 0, j = 0;
    String lastMatch = null;

    while (i < a.length && j < b.length) {
        int compare = a[i].compareTo(b[j]);
        if (compare == 0) {
            if (lastMatch == null || !a[i].equals(lastMatch)) {
                count++;
                lastMatch = a[i];
            }
            i++;
            j++;
        } else if (compare < 0) {
            i++;
        } else {
            j++;
        }
    }
    return count;
}