public boolean xyBalance(String str) {

    int lastX = -1;
    int lastY = -1;

    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == 'x') {
            lastX = i;
        } else if (c == 'y') {
            lastY = i;
        }
    }


    return lastX == -1 || lastY > lastX;
}