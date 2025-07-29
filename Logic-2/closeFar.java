public boolean closeFar(int a, int b, int c) {
    boolean bClose = Math.abs(a - b) <= 1;
    boolean cClose = Math.abs(a - c) <= 1;


    if (bClose && !cClose) {
        return Math.abs(b - c) >= 2;
    } else if (cClose && !bClose) {
        return Math.abs(c - b) >= 2;
    }
    return false;
}