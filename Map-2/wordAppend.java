public String wordAppend(String[] strings) {
    StringBuilder result = new StringBuilder();
    Map<String, Integer> countMap = new HashMap<>();

    for (String s : strings) {
        if (countMap.containsKey(s)) {
            countMap.put(s, countMap.get(s) + 1);
            if (countMap.get(s) % 2 == 0) {
                result.append(s);
            }
        } else {
            countMap.put(s, 1);
        }
    }

    return result.toString();
}