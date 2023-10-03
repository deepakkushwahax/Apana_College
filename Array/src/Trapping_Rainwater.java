public class Trapping_Rainwater {

    public static boolean Trapped_water(int[] height){
        int n = height.length;
        // To calculate left max boundary --array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i=1; i<height.length; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // calculate right max boundary  -- array

        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];
        for (int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop
        int trappedWater = 0;

        for (int i = 0; i<n; i++){
            //water level = min(lrftmax bound - rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }


        return false;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(Trapped_water(height));

    }
}
