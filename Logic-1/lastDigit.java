public boolean lastDigit(int a, int b, int c) {
    int lastA = a % 10;
    int lastB = b % 10;
    int lastC = c % 10;


    return (lastA == lastB) || (lastA == lastC) || (lastB == lastC);
}