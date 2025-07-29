public List<String> no34(List<String> strings) {
    List<String> result = new ArrayList<>();
    for (String s : strings) {
        if (s.length() != 3 && s.length() != 4) {
            result.add(s);
        }
    }
    return result;
}