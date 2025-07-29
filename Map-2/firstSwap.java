public String[] firstSwap(String[] strings) {
    Map<Character, Integer> map = new HashMap<>();
    Set<Character> swappedChars = new HashSet<>();

    for (int i = 0; i < strings.length; i++) {
        if (strings[i].isEmpty()) continue;

        char firstChar = strings[i].charAt(0);

        if (map.containsKey(firstChar) && !swappedChars.contains(firstChar)) {

            int swapIndex = map.get(firstChar);
            String temp = strings[swapIndex];
            strings[swapIndex] = strings[i];
            strings[i] = temp;

            swappedChars.add(firstChar);

            map.remove(firstChar);
        } else if (!swappedChars.contains(firstChar)) {

            map.put(firstChar, i);
        }
    }
    return strings;
}