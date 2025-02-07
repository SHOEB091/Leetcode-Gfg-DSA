package Arrays;

import java.util.*;

public class RearrangeArrayElementsBySign{

    //BRUTE FORCE APPROACH 

    public static int[] RearrangebySign(int[] A, int n){
        
      // Define 2 vectors, one for storing positive 
      // and other for negative elements of the array.
      ArrayList<Integer> pos=new ArrayList<>();
      ArrayList<Integer> neg=new ArrayList<>();
      
      // Segregate the array into positives and negatives.
      for(int i=0;i<n;i++){
          
          if(A[i]>0) pos.add(A[i]);
          else neg.add(A[i]);
      }
      
      // Positives on even indices, negatives on odd.
      for(int i=0;i<n/2;i++){
          
          A[2*i] = pos.get(i);
          A[2*i+1] = neg.get(i);
      }
    
     
      return A;
    }    
    
    public static void main(String args[]) 
    {
      // Array Initialisation.
      int n = 4;
      int A[]= {1,2,-4,-5};
    
    
      int[]ans= RearrangebySign(A,n);
      
      for (int i = 0; i < n; i++) {
        System.out.print(ans[i]+" ");
      }
    
    }

    //OPTIMAL APROACH 
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIndex = 0; // Pointer for positive numbers
        int negIndex = 1; // Pointer for negative numbers

        for (int num : nums) {
            if (num > 0) {
                // Place positive number at the current posIndex
                result[posIndex] = num;
                posIndex += 2; // Move to the next even index
            } else {
                // Place negative number at the current negIndex
                result[negIndex] = num;
                negIndex += 2; // Move to the next odd index
            }
        }

        return result;
    }



    }
    