public class IsPrime {
    public static void main(String[] args) {
        System.out.println("0 is " +  (isPrime(0) ? "" : "Not ") + "a prime number");
        System.out.println("1 is " +  (isPrime(1) ? "" : "Not ") + "a prime number");
        System.out.println("2 is " +  (isPrime(2) ? "" : "Not ") + "a prime number");
        System.out.println("3 is " +  (isPrime(3) ? "" : "Not ") + "a prime number");
        System.out.println("8 is " +  (isPrime(8) ? "" : "Not ") + "a prime number");
        System.out.println("17 is " +  (isPrime(17) ? "" : "Not ") + "a prime number");

        int pNumFound = 1;

        for (int pnum = 1; pnum <= 1000; pnum++) {
            if (isPrime(pnum)) {
                System.out.println("true");
                pNumFound++;
                if (pNumFound == 3) {
                    System.out.println("Found 3");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }

        }

        return true;
    }
}
