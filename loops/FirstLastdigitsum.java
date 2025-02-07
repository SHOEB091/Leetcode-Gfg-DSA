package loops;
public class FirstLastdigitsum {

    public static void main(String[] args) {
        
        int num = 72465;
        int sum =0;
        int last_digit = num%10;
        int first_digit=num;
        while(first_digit>=10){
            first_digit=first_digit/10;
        }
        sum = first_digit+last_digit;


            System.out.println(sum);
    }
    
}
