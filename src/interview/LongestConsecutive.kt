package interview

import kotlin.math.max

/**
 * Write a function
 *
 * public int solution(int[] A)
 *
 * which returns the longest number of consecutive numbers in a given array.
 *
 * A consecutive run is a list of numbers which differ by one in either increasing or decreasing.
 * The numbers within a run must be direct neighbours in the original array. Create a function that takes a list of numbers
 * and returns the length of the longest consecutive run.
 *
 * To illustrate:
 * [1, 2, 3, 5, 6, 7, 8, 9] -> 5
 * [1, 2, 3, 10, 11, 15] -> 3
 * [5, 4, 2, 1] -> 2
 * [3, 5, 7, 10, 15] -> 1 (No consecutive run)
 * [5, -3, -2, -1, 0, 1, 5, 6, 7] -> 5
 *
 * [3, 4, 5, -2, -1, 0, 1, 6, 7] // 4
 * [2, 3, 12, 11, 10, 9] // 4
 * [4, 5, 6, -4, -3, -2, -1, 0, 2, 3] // 5
 * [1, 3, 4, -7, -8, -9, -10, -11, 12, 11] // 5
 *
 */
object LongestConsecutive {

    // Question #4 - Done
    fun solution(A: IntArray) : Int {

        var positiveConsecutive = 1
        var maxPositiveConsecutive = 1

        var negativeConsecutive = 1
        var maxNegativeConsecutive = 1

        for (i in 0 until A.size - 1) {
            val difference = A[i] - A[i + 1]

            if (difference == 1) { // I have a sequence like -3, -2, -1
                positiveConsecutive ++
            } else {
                maxPositiveConsecutive = positiveConsecutive
                positiveConsecutive = 1
            }
            if (positiveConsecutive > maxPositiveConsecutive) {
                maxNegativeConsecutive = positiveConsecutive
            }

            if (difference == -1) { // I have a sequence like  1, 2, 3
                negativeConsecutive ++
            } else {
                negativeConsecutive = 1
            }
            if (negativeConsecutive > maxNegativeConsecutive) {
                maxNegativeConsecutive = negativeConsecutive
            }
        }

        return max(maxPositiveConsecutive, maxNegativeConsecutive)
    }
}