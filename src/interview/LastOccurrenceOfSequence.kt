package interview

/**
 * Given an array A consists of N integers and an array B consisting of K integers
 * returns an integer that the last occurrence of the sequence array within a given the array A.
 *
 * [9, 3, 7, 9, 2] -> [9, 3, 7] = 0
 * [9, 3, 7, 9, 2] -> [7, 9] = 2
 * [9, 3, 7, 9, 2, 1, 7, 9] -> [7, 9] = 6
 * [9, 3, 7, 9, 2] -> [1, 7, 9] = -1
 */
object LastOccurrenceOfSequence {

    fun solution(A: IntArray, B: IntArray): Int {
        var result = -1

        var i = 0
        while (i < A.size) {
            if (A[i] == B[0]) {
                var keepContinue = true
                for (j in 0 until B.size) {
                    if (i + j < A.size) {
                        keepContinue = A[i + j] == B[j]
                    }
                }
                if (keepContinue) {
                    result = i
                }
            }
            i++
        }
        return result // If not found
    }
}