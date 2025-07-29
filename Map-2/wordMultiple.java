public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> result = new HashMap<>();
    Map<String, Integer> countMap = new HashMap<>();


    for (String s : strings) {
        if (countMap.containsKey(s)) {
            countMap.put(s, countMap.get(s) + 1);
        } else {
            countMap.put(s, 1);
        }
    }


    for (String key : countMap.keySet()) {
        result.put(key, countMap.get(key) >= 2);
    }

    return result;
}