package Arrays;
public class trappingwater {
    public static int trapped_water(int height[],int width){
        int trappedWater=0;
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
         int rightmax[]=new int[n];
         rightmax[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
         }
         for(int i=0;i<n;i++){
            int waterlevel= Math.min(rightmax[i],leftmax[i]);
            trappedWater+=(waterlevel-height[i])*width;
         }
        return trappedWater;
    }
public static void main(String[] args){
    int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
    int width=1;
    System.out.println("trapped water__"+trapped_water(height,width));
}
}
