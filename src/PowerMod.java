import java.util.Scanner;

public class PowerMod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        scanner.nextInt();
        System.out.println("Press number2: ");
        scanner.nextInt();
        System.out.println("Press number3: ");
        scanner.nextInt();

        long a = 99102026;
        long power = 991012613;
        long mod = 1000000007;

        System.out.println("Power Calculated! Result: " + power(a, power, mod));
    }

    public static long power(long a, long power, long mod) {
        long result = 1;
        for (long i = 0; i < power; i++) {
            result *= a;
            result %= mod;
        }

        return result;
    }
}
