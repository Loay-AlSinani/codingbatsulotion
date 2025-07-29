public List<Integer> square56(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (Integer num : nums) {
        int transformed = num * num + 10;
        if (transformed % 10 != 5 && transformed % 10 != 6) {
            result.add(transformed);
        }
    }
    return result;
}