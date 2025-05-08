package String;

import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.next();
        int n=s.length();
        for(int i=0;i<n;i++){
           // char c=s.charAt(i);
           char c=s.charAt(i);
          // if((c>='a'&& c<='z')||(c>='A'&&c<='Z'))//for print both small and capital char
          //if(c>='a'|| c<='z')
          //if(Character.isUpperCase(c)){to change caps to small
          if(Character.isLowerCase(c)){//to convert small to caps
            System.out.println(Character.toUpperCase(c));
           }
        }
   }
}
