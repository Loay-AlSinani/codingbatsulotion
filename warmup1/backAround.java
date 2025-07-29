public String backAround(String str) {
    String lastChar = str.substring(str.length() - 1);
    return lastChar + str + lastChar;
}

