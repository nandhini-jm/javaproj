public class Sort {
    public static void main(String[] args) {
        int a[]={23,24,87,31,20,17};
        boolean sorted=true;

        for( int i=0;i< a.length-1;i++){
            if(a[i]>a[i+1]){
                sorted=false;
                break;
            }
        }
        System.out.println("Is sorted:"+sorted);
    }
    
}
