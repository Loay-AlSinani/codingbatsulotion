public String stringX(String str) {
    if (str.length() <= 1) {
        return str;
    }

    char first = str.charAt(0);
    char last = str.charAt(str.length() - 1);

    String middle = str.substring(1, str.length() - 1);
    middle = middle.replace("x", "");

    return first + middle + last;
}
