public String starOut(String str) {
    StringBuilder result = new StringBuilder();
    int len = str.length();

    for (int i = 0; i < len; i++) {

        boolean shouldSkip = false;


        if (str.charAt(i) == '*') {
            shouldSkip = true;
        }

        if (i > 0 && str.charAt(i-1) == '*') {
            shouldSkip = true;
        }

        if (i < len-1 && str.charAt(i+1) == '*') {
            shouldSkip = true;
        }


        if (!shouldSkip) {
            result.append(str.charAt(i));
        }
    }

    return result.toString();
}