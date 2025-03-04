package Arrays;

public class TrappingRainWater {
    // height = [4,2,0,3,2,5]
    // width of building  = 1
    public static int[] getLeftMax(int[] height){
        int n = height.length;
        int []leftMax = new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        return leftMax;
    }




}

















