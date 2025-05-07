import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a=");
        System.out.print("enter b=");
        System.out.print("enter c=");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a==b && b==c)
        System.out.println("equilateral triangle");
        else if(a==b|| b==c|| a==c)
        System.out.println("isoscles triangle");
        else
        System.out.println("scalene triangle");
    }

}
