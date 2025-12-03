package session1Activity1_01;

public class M1A5 {

    public static int computeSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = computeSum(50);
        System.out.println("Sum = " + result);
    }
}
