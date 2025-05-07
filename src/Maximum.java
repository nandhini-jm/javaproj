import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        if(number > 50){
            System.out.println("maximum");
        }
        else{
            System.out.println("Minimum");
        }
    }
    
}
