public class Replacenev {
        public static void main(String[] args) {
            int a[][]={{1,-2,3},{-4,5,-6},{7,8,9}};
            int i,j;
            for(i=0;i<a.length;i++){
                for(j=0;j<a[0].length;j++){
                   // if(a[i][j]<0){ to print the negative elements
                   if(a[i][j]>0)
                   //a[i][j]=0;
                        System.out.println("The postive elements are:"+a[i][j]);
                   // }
                }
            }
        }
    
} 
    
