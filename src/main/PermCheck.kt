package main

object PermCheck {

    // Score [100%]
    fun solution(A: IntArray): Int {
        A.sort()

        for (i in 0 until A.size) {
            if (A[i] != i + 1) {
                return 0
            }
        }
        return 1
    }
}