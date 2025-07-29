public boolean catDog(String str) {
    int catCount = 0;
    int dogCount = 0;

    for (int i = 0; i < str.length() - 2; i++) {
        String current = str.substring(i, i + 3);
        if (current.equals("cat")) {
            catCount++;
        }
        if (current.equals("dog")) {
            dogCount++;
        }
    }

    return catCount == dogCount;
}