import java.util.Scanner;

public class Averagearray {
    public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
        System.out.print("enter the array size:");
        int s=scan.nextInt();
        int a1[]=new int[s];
        System.out.print("enter the array elements:");
        
        for( int i=0;i<a1.length;i++)
        a1[i]=scan.nextInt();
        int sum=0;
        for( int i=0;i<a1.length;i++){
            sum=sum+a1[i];
            System.out.println(sum);
        }
        float avg;
    
         avg=sum/a1.length;
         System.out.println("The average is:"+avg);

        


    }
    
}
