public String oneTwo(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length() - 2; i += 3) {

        result.append(str.charAt(i + 1));
        result.append(str.charAt(i + 2));
        result.append(str.charAt(i));
    }
    return result.toString();
}