public class Pattern {
    public static void main(String[] args) {
        int i,j;
        int n= 4;
        int s=0;
        for(i=0;i<=3;i++){
            for(j=0;j<=n-s;j++){
                if(i==0|| j==0||i==n){
                System.out.println("*");
                }
                else{
                    System.out.println(" ");
                }
            }
        }
        System.out.println();
    }
}
