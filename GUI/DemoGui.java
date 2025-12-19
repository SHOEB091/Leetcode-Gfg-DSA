package GUI;
import javax.swing.*;

public class DemoGui extends JFrame{
    
    DemoGui(String s1){

        super(s1);
    }
    DemoGui(){

    }

    public static void main(String[] args) {
        DemoGui s1 = new DemoGui("Welcome to SI Corporation");
        s1.setVisible(true);
        s1.setSize(400,300);
        s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
