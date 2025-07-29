public boolean makeBricks(int small, int big, int goal) {

    int maxBig = goal / 5;
    int bigToUse = Math.min(big, maxBig);


    int remaining = goal - bigToUse * 5;


    return remaining <= small;
}