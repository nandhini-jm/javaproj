public class Arraylarge {
    public static void main(String[] args) {
        int[] numbers = {8, 12, 5 , 30};
        int max=numbers[0];
        for( int num : numbers){
            if( num > max){
                max=num;
            }
        }
        System.out.println("largest number:"+max);
    }
    
}
