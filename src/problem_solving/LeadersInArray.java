package problem_solving;

public class LeadersInArray
{
    
    public static void main(String args[])  {
        
        int[] arr = {5, 3, 20, 15, 8, 3};
        
        int maximum = arr[arr.length-1];
        System.out.print( maximum+ " ");
        
        for (int i=arr.length-2; i>=0; i--) {
            
            if(arr[i] > maximum) {
                System.out.print( arr[i] +" ");
                maximum = arr[i];
            }
        }
    }
}
