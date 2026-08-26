class Solution {
    public int water(int[] height){
        int max=0;
        int s=0;
        int e=height.length-1;
        while(s<e){
            int h=Math.min(height[s],height[e]);
            int width=e-s;
            int curr=h*width;
            max=Math.max(max,curr);
            if(height[s]<height[e]){
                s++;
            }else{
                e--;
            }
        }
        return max;
    }
    public int maxArea(int[] height) {
        return water(height);
    }
}