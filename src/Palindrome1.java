public class Palindrome1 {
    public static void main(String[] args) {
        int num=1221; int temp= num;
       int rev=0;
        while(temp >0){
            rev= rev * 10 + (temp % 10);
            temp/=10;
        }
        if(num == rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    
}
