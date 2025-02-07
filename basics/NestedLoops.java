package basics;
public class NestedLoops {
    
    public static void main(String[] args) {

        outer://outer is a lable 
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                if(i==j)
                {
                    //continue; //skip the current iteraion
                    continue outer; //skip the current iteraion
                    //return; exit form the current fucntion 
                    //break;  current loop exit
                }
                System.out.println(i+" "+j);
            }
        }
    }

}
