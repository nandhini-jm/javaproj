public class Loop {
    public static void main(String[] args) {
        int i;
        int odd=0;
        int even =0;
       for(i=0;i<=100;i++)
        {
         if(i % 2==0){
             even++;
        }
        else{
            odd++;

        }
         System.out.println(" odd count:" +odd);
        System.out.println(" even count:" +even);
        }
    }   
}   