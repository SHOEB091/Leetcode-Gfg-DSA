package patterns;

public class InvertedPyramid {
    
    public static void main(String[] args) {
        
        for(int line =5;line>=1;line--)
        {
           for(int star=1;star<=line;star++)
           {
            System.out.print("* ");
           }
           System.out.println();
        }
    }

}
