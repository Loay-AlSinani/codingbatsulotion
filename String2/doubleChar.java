public String doubleChar(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        result.append(c).append(c);
    }
    return result.toString();
}