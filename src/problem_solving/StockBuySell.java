package problem_solving;

import java.util.ArrayList;

/**
 * Local minima and Local Maxima
 * @author shivamkumar
 *
 */
public class StockBuySell
{
    
    public static void main (String args[]) {
        
        int[] arr= {1, 5, 3, 8, 12};
        
        ArrayList<Integer> localMinima = new ArrayList<>();
        ArrayList<Integer> localMaxima = new ArrayList<>();
        
        for (int i=0;i<arr.length;i++) {
            
            if (i == 0 && (i+1) <arr.length) {
                
                if (arr[i] < arr[i+1]) 
                    localMinima.add( arr[i] );
                else
                    localMaxima.add( arr[i] );                        
            }else if ( i == arr.length-1  &&  (i-1) < arr.length) {
                
                if (arr[i] < arr[i-1]) 
                    localMinima.add( arr[i] );
                else
                    localMaxima.add( arr[i] );     
            }else {
                
                if (arr[i] <  arr[i+1] && arr[i] < arr[i-1])
                    localMinima.add( arr[i] );
                else if (arr[i] > arr[i+1] && arr[i] > arr[i-1])
                    localMaxima.add( arr[i] );
            }            
        }

        int sum = 0;
        for (int i=0;i<localMinima.size(); i++) {
            
            if (i < localMaxima.size() &&  localMaxima.get( i ) != null) {
                sum +=  (localMaxima.get( i ) - localMinima.get( i ));
            }
        }
        
        System.out.println( sum ); 
    }
}
