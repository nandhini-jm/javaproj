public class fibo {
    public static void main(String[] args) {
        int n = 7, a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }

    }
}
