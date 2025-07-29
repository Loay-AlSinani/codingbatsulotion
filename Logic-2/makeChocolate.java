public int makeChocolate(int small, int big, int goal) {

    int maxBig = goal / 5;
    int bigToUse = Math.min(big, maxBig);


    int remaining = goal - bigToUse * 5;


    if (remaining <= small) {
        return remaining;
    } else {
        return -1;
    }
}