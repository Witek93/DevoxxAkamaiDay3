import java.util.HashSet;
import java.util.Set;

class Fibonacci {

    private final Set<Long> fibonacciNumbers;

    static Fibonacci upTo(int n) {
        Set<Long> numbers = new HashSet<>();
        numbers.add(1L);
        long i0 = 1, i1 = 1, tmp;

        for (long i = 0; i0 <= n; i++) {
            tmp = i0;
            i0 += i1;
            i1 = tmp;
            numbers.add(i0);
            System.out.println(i0);
        }

        return new Fibonacci(numbers);
    }

    private Fibonacci(Set<Long> fibonacciNumbers) {
        this.fibonacciNumbers = fibonacciNumbers;
    }

    boolean hasNumber(int x) {
        return fibonacciNumbers.contains(x);
    }
}
