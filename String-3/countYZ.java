public int countYZ(String str) {
    int count = 0;
    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if ((ch == 'y' || ch == 'z')) {

            if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }
    }
    return count;
}
