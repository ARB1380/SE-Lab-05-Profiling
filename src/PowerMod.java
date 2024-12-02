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
        if (power == 1) return a;
        if (power % 2 == 1) return (a * power(a, power/2, mod)) % mod;
        return (power(1, power/2, mod) * power(1, power/2, mod)) % mod;
    }
}
