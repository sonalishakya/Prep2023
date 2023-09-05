package Math;

/**
 * @author: sonali.shakya
 */
public class leastCommonMultiple {
    public static void main(String[] args) {
        int a = 2, b = 6;
        int hfc = greatestCommonDivisor.euclid(a, b);
        System.out.println(a*b/hfc);
    }
}
