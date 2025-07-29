public List<Integer> rightDigit(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (Integer num : nums) {
        result.add(num % 10);
    }
    return result;
}