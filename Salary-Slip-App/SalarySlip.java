import java.util.*;
import java.text.NumberFormat;
public class SalarySlip {
    static ResourceBundle rb;
    static Locale locale;

    //iso country codes ;
    //SRP = Single Responsibility Principle
    //local or members 
    //static will be common 
    // static class loads only one time 
    // these are instance members  so object are made // use static to make class members 
    //Locale 

   /*  static String formatDate()
    {
        //Date
        //DateFormat
    }*/
    static void loadBundle()
    {
        rb=ResourceBundle.getBundle("message",locale);
    }
  

    static String formatCurrency(double unformattedVal){
            NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
            return nf.format(unformattedVal);//$100,000.00
            //whenever we format it converts into string
        }

    static String properCase(String name ){
        String names[]=name.split(" ");
        String fullName="";
        for(int i=0;i<names.length;i++)
        {
            String n = names[i];
            char firstLetter = n.charAt(0);
            String firstLetterUpperCase = String.valueOf(firstLetter).toUpperCase();
            String remString = n.substring(1).toLowerCase();
            String result = firstLetterUpperCase + remString + " ";
            fullName = fullName+result;


        }
        return fullName;
    }


    static void input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for english: ");
        System.out.println("हिन के लिए 2 दबाएँ ");
        int choice = sc.nextInt();
        
        if(choice ==1)
        {
            locale=locale.of("en","US");
            //locale = new Locale("en","US");
        }
        else
        if(choice==2)
        {
            locale=locale.of("hi","IN");
            //locale= new Locale("hi,"IN")
        }
        loadBundle();


        System.out.println(rb.getString("id.msg"));
        int id = sc.nextInt();

        sc.nextLine();//eat \n
        System.out.println(rb.getString("name.msg"));
        String name = sc.nextLine();

        System.out.println("enter the Basic Salary: ");
        double basicSalary = sc.nextDouble();

        compute(id,name,basicSalary);

        sc.close();

    }

    static void compute(int id , String name ,double basicSalary){

        double hra = basicSalary*8.50;
        double ta = basicSalary*8.40;
        double ma = basicSalary*8.25;
        double da = basicSalary*8.20;
        double pf = basicSalary*0.05;
        print(id,name,basicSalary,hra,da,ta,ma,pf);

    }

    static void print(int id, String name , double basicSalary, double hra, double da , double ta ,double ma, double pf ){

        System.out.println("Id " + id );
        System.out.println("Name " + properCase(name) );
        System.out.println("Basic Salary " + basicSalary );

        System.out.println("Allowances \t\t Dedection " );

        System.out.println("HRA " + formatCurrency(hra) + "\t\t" +"PF " +formatCurrency(pf));
        System.out.println("DA " + formatCurrency(da));
        System.out.println("TA" + formatCurrency(ta));
        System.out.println("MA" + formatCurrency(ma));
    }
    public static void main(String[] args) {
       
        input();

    }

}
