package main

/**
 * MaxProductOfThree
 * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 *
 * A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).
 * For example, array A such that:
 * A[0] = -3
 * A[1] = 1
 * A[2] = 2
 * A[3] = -2
 * A[4] = 5
 * A[5] = 6
 * contains the following example triplets:
 *
 * (0, 1, 2), product is −3 * 1 * 2 = −6
 * (1, 2, 4), product is 1 * 2 * 5 = 10
 * (2, 4, 5), product is 2 * 5 * 6 = 60
 * Your goal is to find the maximal product of any triplet.
 *
 * Write a function:
 * fun solution(A: IntArray): Int
 *
 * that, given a non-empty array A, returns the value of the maximal product of any triplet.
 * For example, given array A such that:
 * A[0] = -3
 * A[1] = 1
 * A[2] = 2
 * A[3] = -2
 * A[4] = 5
 * A[5] = 6
 * the function should return 60, as the product of triplet (2, 4, 5) is maximal.
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [3..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
object MaxProductOfThree {

    // Score [100%]
    fun solution(A: IntArray): Int {

        A.sort()
        val size = A.size

        val result = mutableListOf<Int>()

        if (A[size - 1] > 0 && A[size - 2] > 0 && A[size - 3] > 0) {
            result.add(A[size - 1] * A[size - 2] *  A[size - 3])
        }

        if (A[0] < 0 && A[1] < 0){
            result.add(A[0] * A[1] *  A[size - 1])
        }

        if (A[0] < 0 && A[1] < 0 && A[2] < 0){
            result.add(A[size - 1] * A[size - 2] *  A[size - 3])
        }

        return result.max() ?: 0
    }
}