public int[] copyEndy(int[] nums, int count) {
    int[] result = new int[count];
    int index = 0;

    for (int num : nums) {
        if (isEndy(num) && index < count) {
            result[index] = num;
            index++;
        }
    }

    return result;
}

public boolean isEndy(int n) {
    return (n >= 0 && n <= 10) || (n >= 90 && n <= 100);
}