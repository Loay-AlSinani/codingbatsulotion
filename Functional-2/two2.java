public List<Integer> two2(List<Integer> nums) {
    List<Integer> result = new ArrayList<>();
    for (Integer num : nums) {
        int doubled = num * 2;
        if (doubled % 10 != 2) {
            result.add(doubled);
        }
    }
    return result;
}