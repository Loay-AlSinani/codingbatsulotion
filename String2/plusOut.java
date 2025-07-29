public String plusOut(String str, String word) {
    StringBuilder result = new StringBuilder();
    int wordLen = word.length();
    int i = 0;

    while (i < str.length()) {

        if (i <= str.length() - wordLen &&
                str.substring(i, i + wordLen).equals(word)) {

            result.append(word);
            i += wordLen;
        } else {

            result.append('+');
            i++;
        }
    }

    return result.toString();
}