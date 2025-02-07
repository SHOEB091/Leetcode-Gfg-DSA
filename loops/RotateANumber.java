package loops;
public class RotateANumber {
    public static void main(String[] args) {
        int num = 12345;
        int rotations = 2;
        int count =0;
        int cpy=num;
        
         //count digit
         while(cpy!=0)
         {
 
             cpy /=10;//make the number small
             count++;
         }
         rotations = rotations %count;

         if(rotations<0)
         {
            rotations = rotations + count;
         }


        int rhs = num%(int)Math.pow(10,rotations);//45

        int lhs =  num/(int)Math.pow(10,rotations);//123

       

        int result  = rhs*(int)Math.pow(10,count-rotations)+lhs;

            System.out.println(result);

        
    }
}
