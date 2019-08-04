package main

import kotlin.math.min

/**
 * MinAvgTwoSlice
 * Find the minimal average of any slice containing at least two elements.
 *
 * A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P < Q < N, is
 * called a slice of array A (notice that the slice contains at least two elements). The average of a slice (P, Q)
 * is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be precise,
 * the average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
 *
 * For example, array A such that:
 * A[0] = 4
 * A[1] = 2
 * A[2] = 2
 * A[3] = 5
 * A[4] = 1
 * A[5] = 5
 * A[6] = 8
 * contains the following example slices:
 * slice (1, 2), whose average is (2 + 2) / 2 = 2;
 * slice (3, 4), whose average is (5 + 1) / 2 = 3;
 * slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
 * The goal is to find the starting position of a slice whose average is minimal.
 *
 * Write a function:
 * fun solution(A: IntArray): Int
 * that, given a non-empty array A consisting of N integers, returns the starting position of the slice with
 * the minimal average. If there is more than one slice with a minimal average, you should return the smallest
 * starting position of such a slice.
 *
 * For example, given array A such that:
 * A[0] = 4
 * A[1] = 2
 * A[2] = 2
 * A[3] = 5
 * A[4] = 1
 * A[5] = 5
 * A[6] = 8
 * the function should return 1, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−10,000..10,000].
 */
object MinAvgTwoSlice {

    // Score [100%]
    fun solution(A: IntArray): Int {

        // The trick to this problem is
        // that the min average slice has "the length of 2 or 3".
        // So, we only need to calculate the avg of the slices of length 2 and 3.

        var minAverage = Double.MAX_VALUE
        var index = 0

        for (i in 0 until A.size - 2) {
            val twoAverage = (A[i] + A[i + 1]) / 2.0
            val threeAverage = (A[i] + A[i + 1] + A[i + 2]) / 3.0

            val currentMin = min(twoAverage, threeAverage)

            if (currentMin <  minAverage) {
                minAverage = currentMin
                index = i
            }
        }

        val lastTwoAverage = (A[A.size - 2] + A[A.size - 1]) / 2.0
        if (lastTwoAverage < minAverage) {
            minAverage = lastTwoAverage
            index = A.size - 2
        }

        return index
    }
}