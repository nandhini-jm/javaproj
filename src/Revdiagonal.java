public class Revdiagonal {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[0].length;j++){
                //if(i==j||i+j==a[0].length-1){for below diagonal
                //if(i>=j)for print the below triangle
                if(j>=i)//above triangle
                    System.out.print(a[i][j]+"   ");
                //}
                else{
                    System.out.print("    ");
                }
                
            }
            System.out.println("    ");
        }
    }
}


