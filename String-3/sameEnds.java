public String sameEnds(String string) {
    int len = string.length();
    String result = "";

    for (int i = 0; i < len / 2; i++) {

        String start = string.substring(0, i + 1);
        String end = string.substring(len - i - 1);

        if (start.equals(end)) {
            result = start;
        }
    }

    return result;
}
