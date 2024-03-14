import java.util.Arrays;
//import java.util.Scanner;
public class Main {
//    static Scanner ref = new Scanner(System.in);
    static void isPrime(int number){
        int count = 0;
        for (int i = 1; i <= number; i++){
            if(number%i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");

//        int num = ref.nextInt();
//        for(int i = 0; i <= args.length();i ++)
        System.out.println(Arrays.toString(args));
//        isPrime();
    }
}