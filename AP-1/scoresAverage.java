public int scoresAverage(int[] scores) {
    int firstHalf = average(scores, 0, scores.length / 2 - 1);
    int secondHalf = average(scores, scores.length / 2, scores.length - 1);
    return Math.max(firstHalf, secondHalf);
}

public int average(int[] scores, int start, int end) {
    int sum = 0;
    int count = 0;
    for (int i = start; i <= end; i++) {
        sum += scores[i];
        count++;
    }
    return sum / count;
}