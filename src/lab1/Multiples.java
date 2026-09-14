package lab1;

public class Multiples {

    static void main() {

        int count = multiples();
        System.out.println(count);

    }

    static int multiples(int n, int a, int b) {

        int c = 0;
        for (int i = 1; i <= n; i++) {
            if ( i%a == 0 || i%b == 0) {
                c++;
            }
        }
        return c;

    }

}
