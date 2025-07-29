public String[] fizzBuzz(int start, int end) {
    int length = end - start;
    String[] result = new String[length];

    for (int i = 0; i < length; i++) {
        int num = start + i;
        if (num % 15 == 0) {
            result[i] = "FizzBuzz";
        } else if (num % 3 == 0) {
            result[i] = "Fizz";
        } else if (num % 5 == 0) {
            result[i] = "Buzz";
        } else {
            result[i] = String.valueOf(num);
        }
    }

    return result;
}
