public String mirrorEnds(String string) {
    int len = string.length();
    String result = "";

    for (int i = 0; i < len; i++) {
        if (string.charAt(i) == string.charAt(len - 1 - i)) {
            result += string.charAt(i);
        } else {
            break;
        }
    }

    return result;
}
