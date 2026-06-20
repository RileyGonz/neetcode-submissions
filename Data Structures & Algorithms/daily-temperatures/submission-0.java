class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<int[]> stack = new ArrayDeque<>();
        int[] pair = {temperatures[0], 0};
        stack.push(pair);
        for(int i = 1; i < temperatures.length;i++){
            while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                int[] prev = stack.pop();
                result[prev[1]] = i - prev[1];
            }

            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
