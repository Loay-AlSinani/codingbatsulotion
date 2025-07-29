public List<Integer> noTeen(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (Integer num : nums) {
        if (num < 13 || num > 19) {
            result.add(num);
        }
    }
    return result;
}