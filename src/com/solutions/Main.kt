package com.solutions

import lesson1.BinaryGap
import lesson2.CyclicRotation
import lesson2.OddOccurrencesInArray
import lesson3.FrogJmp

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        // write your code here
        println("BinaryGap -> ${BinaryGap.solution(9)}")
        println("OddOccurrencesInArray -> ${OddOccurrencesInArray.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))}")
        print("CyclicRotation -> ")
        PrintUtil.print(CyclicRotation.solution(intArrayOf(3, 8, 9, 7, 6), 3))
        println()
        println("FrogJmp -> ${FrogJmp.solution(10, 85, 30)}")
    }
}
