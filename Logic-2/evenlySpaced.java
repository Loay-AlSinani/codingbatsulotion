public boolean evenlySpaced(int a, int b, int c) {

    int small = Math.min(Math.min(a, b), c);
    int large = Math.max(Math.max(a, b), c);
    int medium = (a + b + c) - small - large;


    return (medium - small) == (large - medium);
}