class Solution {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return answer;
    }
}
