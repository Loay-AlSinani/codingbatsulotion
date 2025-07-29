public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] result = new String[n];
    int aIndex = 0, bIndex = 0, rIndex = 0;

    while (rIndex < n) {
        if (aIndex < a.length && bIndex < b.length) {
            if (a[aIndex].compareTo(b[bIndex]) < 0) {
                if (rIndex == 0 || !a[aIndex].equals(result[rIndex-1])) {
                    result[rIndex++] = a[aIndex];
                }
                aIndex++;
            } else {
                if (rIndex == 0 || !b[bIndex].equals(result[rIndex-1])) {
                    result[rIndex++] = b[bIndex];
                }
                bIndex++;
            }
        } else if (aIndex < a.length) {
            if (rIndex == 0 || !a[aIndex].equals(result[rIndex-1])) {
                result[rIndex++] = a[aIndex];
            }
            aIndex++;
        } else {
            if (rIndex == 0 || !b[bIndex].equals(result[rIndex-1])) {
                result[rIndex++] = b[bIndex];
            }
            bIndex++;
        }
    }

    return result;
}