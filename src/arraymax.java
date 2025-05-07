import java.util.Scanner;

public class minimumarray {
    public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
        System.out.print("enter the array size:");
        int s=scan.nextInt();
        int a1[]=new int[s];
        System.out.print("enter the array elements:");
        
        for( int i=0;i<a1.length;i++)
        a1[i]=scan.nextInt();
        int max=a1[0];
        for( int i=0;i<a1.length;i++){
            if(max<a1[i]){
                max=a1[0];

            }
            System.out.println(max);
        }

    }