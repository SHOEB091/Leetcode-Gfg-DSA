package ReccursionDem;

public class RopeCutProblem {
    
    static int getMaxCuts(int ropeLen, int a , int b, int c)
    {
        //base case 
        // if(ropeLen<=0)
        // {
        //     if(ropeLen==0)
        //     {
        //         return 1;
        //     }
        //     else{
        //         return 0;
        //     }
            
        // }
        if(ropeLen==0)
        {
            return 0;
        }
        if(ropeLen<0)
        {
            return -1;
        }
        //small Problem;
        int result1=getMaxCuts(ropeLen-a,a,b,c);
        int result2=getMaxCuts(ropeLen-b,a,b,c);
        int result3=getMaxCuts(ropeLen-c,a,b,c);
        //return result1+result2+result3;
        int ans = Math.max(Math.max(result1,result2),result3);
        if(ans==-1)
        {
            return -1;
        }
        else{
            return ans+1;
        }
    }
    public static void main(String[] args) {
        int maxCut = getMaxCuts(5,2,5,1);
        System.out.println(maxCut);
    }

}
