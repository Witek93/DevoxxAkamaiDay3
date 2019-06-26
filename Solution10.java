public class Solution10 {

    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);
        Fibonacci fibonacci = Fibonacci.upTo(n);

        System.out.println(fibonacci.hasNumber(n) ? "t" : "f");
    }
}
