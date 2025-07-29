public int sumLimit(int a, int b) {
    int sum = a + b;

    String aStr = String.valueOf(a);
    String sumStr = String.valueOf(sum);


    return (sumStr.length() == aStr.length()) ? sum : a;
}