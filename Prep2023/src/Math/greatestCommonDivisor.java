package Math;

/**
 * @author: sonali.shakya
 */
public class greatestCommonDivisor {
    public static void main(String[] args) {
        int a = 2, b = 6;

        System.out.println(euclid(a, b));
    }

    static int euclid (int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while(a > 0 && b > 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a == 0 ? b : a;
    }
}
