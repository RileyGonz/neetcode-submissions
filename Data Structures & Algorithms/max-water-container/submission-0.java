class Solution {
    public int maxArea(int[] heights) {
        int pointer1 = 0;
        int pointer2 = heights.length-1;
        int max = -1;
        while(pointer1<pointer2){
            int heighttemp = Math.min(heights[pointer1],heights[pointer2]);
            if(max < heighttemp*(pointer2-pointer1)){
                max = heighttemp*(pointer2-pointer1);
            }
            if(heights[pointer1]<heights[pointer2]){
                pointer1++;
            }else{
                pointer2--;
            }
        }
        return max;
    }
}
