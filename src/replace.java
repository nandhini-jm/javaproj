public class replace {
    public static void main(String[] args) {
        int a[]={2,3,4,2,6,2};
        for(int i=0;i<a.length;i++){
            if(a[i]==2)
            a[i]=20;
            System.out.println(a[i]);
        }
    }
}
