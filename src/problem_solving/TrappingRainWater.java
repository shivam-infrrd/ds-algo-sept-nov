package problem_solving;

public class TrappingRainWater
{

    public static void main(String args[]) {
        
        int[] arr= {3, 0, 1, 2, 5};
        
        int[] lh = new int[arr.length];
        int[] rh = new int[arr.length];
        
        int lhighest = 0;
        for (int i=0;i<arr.length;i++) {
            
            if (arr[i] > lhighest) {
                lh[i] = arr[i];
                lhighest = arr[i];
            }else {
                lh[i] = lhighest;
            }
        }
        
        int rhighest = 0;
        for (int i=arr.length-1; i>=0; i--) {
            
            if(arr[i] > rhighest) {
                rh[i] = arr[i];
                rhighest = arr[i];
            }else {
                rh[i] = rhighest;
            }
        }
        
        int total = 0;
        for (int i=0;i<arr.length;i++) {
            
            total += Math.min( lh[i], rh[i] ) - arr[i];
        }
        
        System.out.println( total );
    }
}
