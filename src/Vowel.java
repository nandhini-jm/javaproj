import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch =scanner.next().charAt(0);
        if(ch =='a'|| ch =='e' || ch =='i' || ch =='o' || ch =='u'){
            System.out.println("Vowels");
        }
        else{
            System.out.println("Consonants");
        }
    scanner.close();
    }
    
}
