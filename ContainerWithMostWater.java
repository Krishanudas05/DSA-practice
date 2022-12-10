class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length-1;
        while(i<j) {
            int shorterLine = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, shorterLine*(j-i));
            if(height[i]<height[j]) {
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
  }
}