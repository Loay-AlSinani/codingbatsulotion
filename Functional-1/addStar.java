public List<String> addStar(List<String> strings) {
    List<String> result = new ArrayList<>();
    for (String s : strings) {
        result.add(s + "*");
    }
    return result;
}