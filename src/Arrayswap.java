public class Arrayswap {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i;
        int j;
        int temp=0;
        for(i=0;i<3;i++){
           temp=a[0][i];
           a[0][i]=a[2][i];
           a[2][i]= temp;
        }
        for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            System.out.print(a[i][j]+" ");
              
          }
          System.out.println(" ");
        } 
       
        
    }
}
