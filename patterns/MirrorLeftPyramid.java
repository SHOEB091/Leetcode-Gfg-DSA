package patterns;

public class MirrorLeftPyramid {

    public static void main(String[] args) {
        int noOfLines=5;
        int totalspace = noOfLines-1;
        for(int line =1;line<=noOfLines;line++)
        {
            for(int space=1; space<=totalspace;space++)
            {
                System.out.print(" ");
            }
            for(int star=1;star<=line;star++)
            {
                System.out.print("*");
            }
            totalspace--;
            System.out.println();
        }
    }

}
