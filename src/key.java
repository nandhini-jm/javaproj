import java.util.Scanner;

public class key {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        Scanner scan= new Scanner(System.in);
        int key=scan.nextInt();int flag=0;
        for(int i=0;i<a.length;i++){
           if(a[i]==key){
            flag=1;
           System.out.println("key found");
           }
           else
           System.out.println("key is not found");
        }
    }
    
}
