
package MyJava;

/**
 * Used Kadane's algorithm to find Maximum Sum from a SubArray
 * @author Meher Khan
 */
public class MaximumSumSubArray {

    public static int MaxSum(int[] a) {
        

        int MaxSoFar = a[0];
        int MaxEndingHere = 0;
        int Start = 0;
        int End = 0;
        int S = 0;

        for (int i = 0; i < a.length; i++) {

            MaxEndingHere = MaxEndingHere + a[i];

            if (MaxSoFar < MaxEndingHere) {
                MaxSoFar = MaxEndingHere;
                Start = S;
                End = i;
            }

            if (MaxEndingHere < 0) {
                MaxEndingHere = 0;
                S=i+1;
            }
        }
        System.out.println("SubArray start point from the index for MaxSum "+Start);
        System.out.println("SubArray end point of the index for MaxSum "+End);
        return MaxSoFar;
        
    }
    

    public static void main(String[] args) {

        int[] b = {4, -3, -2, 2, 3, 1, -2, -3, 4, 2, -6, -3, -1, 3, 1, 2};
        System.out.println("Maximum sum of subArray is " + MaxSum(b));
    }
}
