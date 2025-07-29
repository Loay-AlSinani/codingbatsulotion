public Map<String, String> mapAB4(Map<String, String> map) {
    if (map.containsKey("a") && map.containsKey("b")) {
        String aVal = map.get("a");
        String bVal = map.get("b");

        if (aVal.length() == bVal.length()) {
            map.put("a", "");
            map.put("b", "");
        } else {
            String longer = aVal.length() > bVal.length() ? aVal : bVal;
            map.put("c", longer);
        }
    }
    return map;
}