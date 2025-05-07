public class Digit {
    public static void main(String[] args) {
        int num=12345;
        while(num >= 10){
            num/=10;
        }
        System.out.println("First digit:" + num  );
    }
    
}
