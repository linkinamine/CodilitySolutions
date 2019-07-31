package com.solutions

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here
        println("""BinaryGap -> ${BinaryGap.solution(9)}""")
        println("""OddOccurrencesInArray -> ${OddOccurrencesInArray.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))}""")
        println("""CyclicRotation -> ${CyclicRotation.solution(intArrayOf(3, 8, 9, 7, 6), 3)}""")
    }
}
