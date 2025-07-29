public boolean less20(int n) {
    int remainder = n % 20;
    if (remainder == 18 || remainder == 19) {
        return true;
    } else {
        return false;
    }
}
