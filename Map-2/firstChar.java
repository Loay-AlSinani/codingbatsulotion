public Map<String, String> firstChar(String[] strings) {
    Map<String, String> map = new HashMap<>();
    for (String s : strings) {
        String first = s.substring(0, 1);
        if (map.containsKey(first)) {
            map.put(first, map.get(first) + s);
        } else {
            map.put(first, s);
        }
    }
    return map;
}