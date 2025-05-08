package String;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.next();
        int n=s.length();
        int count=0;
       
        for(int i=0;i<n;i++){
            
            char c=s.charAt(i);
           // if((c>='a'&& c<='z')||(c>='A'&&c<='Z'))//for print both small and capital char
           //if(!(c>='a'&& c<='z')||(c>='A'&&c<='Z')){for count the numbers and symbols
          // if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u'){
            //if(!(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u')){//for consonant print 
            // if(c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u'){
         if((c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u')&&(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
              count++;  
            
           }
             
         }
         System.out.println(count);
    }
}
