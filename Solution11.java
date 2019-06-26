public class Solution11 {

    public static void main(String[] args) {
        int n = Integer.valueOf(args[0]);

        for (long i = n; i <= Integer.MAX_VALUE; i += n) {
            if (isOnly0And9(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean isOnly0And9(long x) {
        return String.valueOf(x).matches("[09]+");
    }
}
