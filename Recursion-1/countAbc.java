public int countAbc(String str) {
    if (str.length() < 3) {
        return 0;
    }
    String substr = str.substring(0, 3);
    if (substr.equals("abc") || substr.equals("aba")) {
        return 1 + countAbc(str.substring(1));
    } else {
        return countAbc(str.substring(1));
    }
}