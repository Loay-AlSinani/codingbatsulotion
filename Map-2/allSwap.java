public String[] allSwap(String[] strings) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < strings.length; i++) {
        if (strings[i].isEmpty()) continue;
        char firstChar = strings[i].charAt(0);
        if (map.containsKey(firstChar)) {

            int swapIndex = map.get(firstChar);
            String temp = strings[swapIndex];
            strings[swapIndex] = strings[i];
            strings[i] = temp;

            map.remove(firstChar);
        } else {

            map.put(firstChar, i);
        }
    }
    return strings;
}