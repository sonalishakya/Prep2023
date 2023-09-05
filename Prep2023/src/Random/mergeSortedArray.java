package Random;

/**
 * @author: sonali.shakya
 */
public class mergeSortedArray {
    public static void main(String[] args) {
        int[] A = {0, 7, 11};
        int[] B = {4, 6, 30, 31};

        //merge
        System.out.println(merge(A, B));
    }

    static int[] merge(int[] A, int[] B) {
        int[] AB = new int[A.length+B.length];
        int a = 0, b = 0, k = 0;
        //validate
        if (A == null && B == null) {
            return null;
        } else if (A == null) {
            return B;
        } else if (B == null) {
            return A;
        } else {
            while(a<A.length && b<B.length) {
                if (A[a] < B[b]) {
                    AB[k] = A[a];
                    a++;
                } else {
                    AB[k] = B[b];
                    b++;
                }
                k++;
            }

            while (a!=A.length || b!=B.length) {
                if (a == A.length && b == B.length) {
                    return AB;
                } else if (a == A.length) {
                    AB[k] = B[b];
                    b++;
                } else if (b == B.length) {
                    AB[k] = A[a];
                    a++;
                }
                k++;
            }

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("k = " + k);
            for (int i = 0; i < AB.length; i++)
                System.out.println(AB[i]);

        }
        return AB;
    }
}
