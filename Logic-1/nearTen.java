public boolean nearTen(int num) {
    int remainder = num % 10;
    if (remainder <= 2 || remainder >= 8) {
        return true;
    } else {
        return false;
    }
}
