
public class PowerMod {

    public static void main(String[] args) {
        int a = 99102026;
        int power = 99101268;
        int mod = 1000000007;

        System.out.println("Power Calculated! Result: " + power(a, power, mod));
    }

    public static long power(int a, int power, int mod) {
        long result = 1;
        for (int i = 0; i < power; i++) {
            result *= a;
            result %= mod;
        }

        return result;
    }
}
