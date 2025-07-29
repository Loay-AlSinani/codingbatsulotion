public int maxMirror(int[] nums) {
    int max = 0;

    for (int i = 0; i < nums.length; i++) {
        for (int j = nums.length - 1; j >= 0; j--) {
            int size = 0;
            int k = i;
            int l = j;

            while (k < nums.length && l >= 0 && nums[k] == nums[l]) {
                size++;
                k++;
                l--;
            }

            if (size > max) {
                max = size;
            }
        }
    }

    return max;
}