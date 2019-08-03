package main

/**
 * PermMissingElem
 * Find the missing element in a given permutation.
 *
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
 * which means that exactly one element is missing. Your goal is to find that missing element.
 *
 * Write a function:
 *
 * fun solution(A: IntArray): Int
 *
 * that, given an array A, returns the value of the missing element.
 *
 * For example, given array A such that:
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 */
object PermMissingElem {

    // Score [100%]
    fun solution(A: IntArray): Int {
        val n: Long = (A.size + 1).toLong()
        val sumOfAllElements: Long = (n * (n + 1)) / 2
        val missingElement: Long = sumOfAllElements - A.sum()
        return missingElement.toInt()
    }
}