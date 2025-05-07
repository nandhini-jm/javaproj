public class Copy { 

    public static void main(String[] args) {
        
        int a[] = {23,67,98,89,64};
        int b[] = new int[a.length];
        for(int i =0; i<a.length;i++){
            b[i] = a[i];
        }
        for(int num :b){
            System.out.println(num + " ");
        }
        











    }
    
}
