public String wordEnds(String str, String word) {
    StringBuilder result = new StringBuilder();
    int wordLen = word.length();
    int strLen = str.length();

    for (int i = 0; i <= strLen - wordLen; i++) {
        if (str.substring(i, i + wordLen).equals(word)) {

            if (i > 0) {
                result.append(str.charAt(i - 1));
            }

            if (i + wordLen < strLen) {
                result.append(str.charAt(i + wordLen));
            }

            i += wordLen - 1;
        }
    }

    return result.toString();
}