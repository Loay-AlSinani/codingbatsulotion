public String frontTimes(String str, int n) {
    String front;

    if (str.length() >= 3) {
        front = str.substring(0, 3);
    } else {
        front = str;
    }

    String result = "";

    for (int i = 0; i < n; i++) {
        result += front;
    }

    return result;
}
