
import java.util.*;

public class Grade {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
    
        System.out.println("Enter the mark of a:");

        System.out.println("Enter the mark of b:");
    
        System.out.println("Enter the mark of c:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
       int total= a+b+c;
        int avg= total/3;
        if(avg >= 90){
        System.out.println("A Grade");
        }
        else if(avg >= 70){
        System.out.println("B Grade");
        }
        else{
            System.out.println("Fail");
        }
        scanner.close();
    }
}