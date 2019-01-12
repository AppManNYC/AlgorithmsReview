package week2;

import java.util.Scanner;

public class GCD {

    private static int gcdBrute(int a, int b){
        int gcd = 0;
        for(int d = 1; d <= a && d <= b; d++) {
            if((a % d == 0) && (b % d == 0)) {
                gcd = d;
            }
        }
        return gcd;
    }

    private static int gcdBrute1(int a, int b) {
        int gcd = 1;
        for(int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > gcd) {
                    gcd = d;
                }
            }
        }
        return gcd;
    }

    private static int gcdEuclid(int a, int b) {

        if (b == 0){
            return a;
        }else{
            return gcdEuclid(b, a%b);
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcdEuclid(a, b));
    }
}
