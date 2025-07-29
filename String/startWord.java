public String startWord(String str, String word) {
    int wLen = word.length();
    if (str.length() < wLen) {
        return "";
    }


    String strSub = str.substring(1, wLen);
    String wordSub = word.substring(1);

    if (strSub.equals(wordSub)) {

        return str.substring(0, wLen);
    }

    return "";
}
