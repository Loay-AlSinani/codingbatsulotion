public boolean old35(int n) {
    boolean multipleOf3 = (n % 3 == 0);
    boolean multipleOf5 = (n % 5 == 0);


    if (multipleOf3 && multipleOf5) {
        return false;
    } else if (multipleOf3 || multipleOf5) {
        return true;
    } else {
        return false;
    }
}
