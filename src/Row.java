public class Row {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
                if(i==0 || i==a.length-1){
                    System.out.print(a[i][j]+" ");
                }
                
            }
            System.out.println("");
        }
    }
}
