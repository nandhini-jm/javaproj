public class palin {
    public static void main(String[] args) {
        int num=1331; int temp=num;
        int rev=0;
        while(temp>0){
          rev=rev*10 + temp % 10;
          temp/=10;
    
    if(num==rev){
        System.out.print(num+ "palindrome");
        }
        else{
        System.out.print(num+ "not a palindrome");
        }
       }
    }
}

