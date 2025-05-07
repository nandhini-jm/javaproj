import java.util.Scanner;

public class Sum5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the array size:");
        int s=scan.nextInt();
        int a1[]=new int[s];
        System.out.print("enter the array elements:");
        
        for( int i=0;i<a1.length;i++)
        a1[i]=scan.nextInt();
        int sum=0;
        int i=0;
        for(i=0;i<a1.length;i++){
            sum=sum+a1[i];
        }
        System.out.println("The sum of the elemnts:"+sum);
    }
    
}
