public String minCat(String a, String b) {
    int minLen = Math.min(a.length(), b.length());
    String aTrimmed = a.substring(a.length() - minLen);
    String bTrimmed = b.substring(b.length() - minLen);
    return aTrimmed + bTrimmed;
}
