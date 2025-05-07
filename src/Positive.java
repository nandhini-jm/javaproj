import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number= scanner.nextInt();
        if(number>0)
            System.out.println("Positive Number");
            else
                System.out.println("Negative Number");
            
        

    }
    
}
