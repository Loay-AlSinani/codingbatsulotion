public List<String> noZ(List<String> strings) {
    List<String> result = new ArrayList<>();
    for (String s : strings) {
        if (!s.contains("z")) {
            result.add(s);
        }
    }
    return result;
}