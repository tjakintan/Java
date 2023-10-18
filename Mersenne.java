import java.math.BigInteger;

public class Mersenne {
    private static boolean isPrime(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) <= 0) {
            return false;
        }

        BigInteger sqrt = num.sqrt();

        for (BigInteger i = BigInteger.TWO; i.compareTo(sqrt) <= 0; i = i.add(BigInteger.ONE)) {
            if (num.mod(i).equals(BigInteger.ZERO)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int count = 0;  // Count of Mersenne primes found so far
        int start = 2;  // Starting power for 2^p - 1

        System.out.printf("%-5s %-50s", "P", "| 2P-1\n" +
                "--------------------------------------------");

        while (count < 25) {
            BigInteger mersenne = BigInteger.TWO.pow(start).subtract(BigInteger.ONE);
            if (isPrime(mersenne)) {
                System.out.println();
                System.out.printf("%-5s %-50s", start, "| " + mersenne);
            }
            start++;
        }
    }


}
