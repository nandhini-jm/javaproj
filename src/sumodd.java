public class sumodd {
    public static void main(String[] args) {
      int a1[]={10,20,34,56,78};
      int i;
      int sum;
      int odd;
      for(i=0;i<a1.length;i++){
        if(a1[i]%2!=0){
            
            sum= sum+a1[i];
        }
        
      }
      System.out.println(sum);

    }
    
}
