package interview

/**
 * What is the length of the longest switching slice(continuous fragment) in a given array A?
 *
 * Write a function:
 * fun solution(A: IntArray): Int
 * that, given an array A consisting of N integers, returns the length of the longest switching slice in A.
 *
 * Examples:
 * 1. Given A=[3, 2, 3, 2, 3] the function should return 5, because the whole array is switching.
 * 2. Given A=[7, 4, -2, 4, -2, -9] the function should return 4. The longest switching slice is [4, -2, 4, -2].
 * 3. Given A=[7, -5, -5, -5, 7, -1, 7] the function should return 3. There are two switching slices of equal length
 * [-5, -5, -5] and [7, -1, 7].
 * 4. Given A=[4] the function should return 1. A single element slice is also a switching slice.
 */
object ContinuousFragment {

    // Question #1 // NOT IMPLEMENTED YET
    fun solution(A: IntArray): Int {

        if (A.size == 1) {
            return 1
        }

        return 0
    }
}