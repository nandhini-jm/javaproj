public class Arraymin {
    public static void main(String[] args) {
        int numbers={39,23,10,5,100};
        int min= numbers[0];
        for(int num : numbers){
           if(min < numbers){
            min = num;
           }
        }
        System.out.println("smallest number:"+min);
    }

    
}
