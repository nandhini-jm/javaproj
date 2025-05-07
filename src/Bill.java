import java.util.*;

public class Bill {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("The units that are consumed:");
        int units=scanner.nextInt();
        double bill;
        if(units <= 100){
            bill= units * 1.5;
            System.out.println(bill);
        }
            elseif(units >200){
                bill=100 * 1.5(units - 100)* 2.5;
                System.out.println(bill);
            }
                else{
                    bill= 100 * 1.5 + 100 * 2.5 +(units -200)*3.5;
                System.out.println("no units consumed");
                }
            
        
    }
    
}
