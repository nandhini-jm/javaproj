import java.util.Scanner;

public class arrayodd1 {
    public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
        System.out.print("enter the array size:");
        int s=scan.nextInt();
        int a1[]=new int[s];
        System.out.print("enter the array elements:");
        for( int i=0;i<a1.length;i++)
        a1[i]=scan.nextInt();

        for( int i=0;i<a1.length;i++){
            if(a1[i]%2 != 0)
            System.out.println(a1[i]);
        }
        
        
        }

    }