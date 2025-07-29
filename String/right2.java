public String right2(String str) {
    String end = str.substring(str.length() - 2);
    String start = str.substring(0, str.length() - 2);
    return end + start;
}
