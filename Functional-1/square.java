public List<Integer> square(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (Integer num : nums) {
        result.add(num * num);
    }
    return result;
}