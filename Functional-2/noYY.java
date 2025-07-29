public List<String> noYY(List<String> strings) {
    List<String> result = new ArrayList<>();
    for (String s : strings) {
        String newStr = s + "y";
        if (!newStr.contains("yy")) {
            result.add(newStr);
        }
    }
    return result;
}