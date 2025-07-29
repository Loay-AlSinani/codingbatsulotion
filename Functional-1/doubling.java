public List<Integer> doubling(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (Integer num : nums) {
        result.add(num * 2);
    }
    return result;
}