public class Countodd {
    public static void main(String[] args) {
        int n[]={25,23,28,37,94};
        int evencount=0;
        int oddcount=0;
        for( int num : n){
            if( num % 2==0)
            evencount++;
            else
            oddcount++;
        }
        System.out.println("Even:" + evencount + ", odd:"+oddcount);
    }
    
}
