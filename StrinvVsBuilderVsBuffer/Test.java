package StrinvVsBuilderVsBuffer;

public class Test {


    public static void stringbuilder(){
        StringBuilder sb = new StringBuilder();
        // it hav defaut array have char array(16);
        //mutable
        //method chaining
        //its not thread safe
        sb.append(" World").append("hello").reverse();
        sb.append("Hello");
        sb.insert(1,"Java");
        sb.replace(1,3,"World");
        sb.delete(1,4);
        sb.reverse();
        sb.charAt(0);
        sb.length();                       //Get Length
        sb.substring(1,4);  //Get Substring

        System.out.println(sb);
    }
    
    public static void stringbuffer(){
        StringBuffer sb = new StringBuffer();
        //we can use synchronized keyword
    }

        public static void main(String[] args) {
            String result = "";
            for(int i=0;i<10;i++){
                result = result + "HELLO";
            }
            System.out.println(result);
            stringbuilder();
        }
}
