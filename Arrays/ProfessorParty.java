package Arrays;

import java.util.HashMap;

public class ProfessorParty {
    
    public static String PartyType( long a[], int n)
    {
       HashMap<Long,Boolean> map = new HashMap<>();
       
       for(long val : a){
           if(map.get(val)==null){//if map is empty 
               map.put(val,true);// push values in map 
           }
           else{
               return "BOYS";
           }
       }
       return "GIRLS";
        // Your code goes here
    }


    public static void main(String[] args) {
        long[] a = {1, 2, 3, 4, 5}; // Example array
        int n = a.length; // Length of the array
        
        String partyType = PartyType(a, n); // Call the PartyType method
        
        System.out.println("Party Type: " + partyType); // Print the party type
    }

}
