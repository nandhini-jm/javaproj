public class Eventwodimen {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        int min=a[0][0];
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                //if(a[i][j]%2==0){ even numbers in matrix
                //if(a[i][j]%2 !=0){odd numbers in the matrix//mulitply *10 means sop la * 10 kudukanum
                if(a[i][j]<min)
                    min=a[i][j];
                    System.out.print("Min = "+min);
               //}
            }
            System.out.println(" ");
        }
    }
}
