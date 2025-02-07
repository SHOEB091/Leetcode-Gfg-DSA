package basics;
public class StringDemo {

    public static void main(String[] args) {

        //.intern() it checks that it exist in strin gpool or not 
        String name = "Rajesh"; //strin g literal
        //1 object or 0 object 

        String name2 = "Rajesh";

        System.out.println(name==name2);

        //2 or 1 object and new keyword creates another reference object
        String name3= new String("Rajesh");

        System.out.println(name==name3);


        //if length exceeds capacity 16*2+ 
        //string buffer is mutable 

        StringBuilder sb = new StringBuilder();

        //StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //to increasse capacity 
        sb.ensureCapacity(100);

        sb.append("rajesh");

        System.out.println(sb.capacity());
        System.out.println(sb.length());



    }
    
}
