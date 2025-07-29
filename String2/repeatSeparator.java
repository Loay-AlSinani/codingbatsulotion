public String repeatSeparator(String word, String sep, int count) {
    if (count == 0) {
        return "";
    }

    StringBuilder result = new StringBuilder(word);
    for (int i = 1; i < count; i++) {
        result.append(sep).append(word);
    }
    return result.toString();
}