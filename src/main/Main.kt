package main

import interview.BinarySearch
import interview.LongestConsecutive
import interview.OCR
import interview.Seasons
import java.util.function.BinaryOperator

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
//        println("BinaryGap -> ${BinaryGap.solution(9)}")
//        println("OddOccurrencesInArray -> ${OddOccurrencesInArray.solution(intArrayOf(9, 3, 9, 3, 9, 7, 9))}")
//        print("CyclicRotation -> ")
//        PrintUtil.print(CyclicRotation.solution(intArrayOf(3, 8, 9, 7, 6), 3))
//        println()
//        println("FrogJmp -> ${FrogJmp.solution(10, 85, 30)}")
//        println("PermMissingElem -> " + PermMissingElem.solution(intArrayOf(2, 3, 1, 5)))
//        println("TapeEquilibrium -> " + TapeEquilibrium.solution(intArrayOf(3, 1, 2, 4, 3)))
//        println("PermCheck -> " + PermCheck.solution(intArrayOf(3, 1, 2, 4)))
//        println("FrogRiverOne -> " + FrogRiverOne.solution(5, intArrayOf(1, 3, 1, 4, 2, 3, 5, 4)))

//        val input = arrayOf(
//                charArrayOf('X', '.', 'X', 'X', 'X', '.'),
//                charArrayOf('X', '.', '.', '.', '.', '.'),
//                charArrayOf('X', '.', 'X', '.', 'X', '.'),
//                charArrayOf('.', '.', '.', '.', 'X', '.'),
//                charArrayOf('.', 'X', 'X', '.', 'X', '.'))
//        println(BattleshipsInABoard.countBattleships(input))

//        println(Elevator.solution(intArrayOf(60, 80, 40), intArrayOf(2, 3, 5), 5, 2, 200)) // 5
//        println(Elevator.solution(intArrayOf(40, 40, 100, 80, 20), intArrayOf(3, 3, 2, 2, 3), 3, 5, 200)) // 6

//        PrintUtil.print(GenomicRangeQuery.solution("CAGCCTA", intArrayOf(2, 5, 0), intArrayOf(4, 5, 6)))

//        PrintUtil.print(MaxCounters.solution(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)))
//        println("MissingInteger -> " + MissingInteger.solution(intArrayOf(1, 3, 6, 4, 1, 2)))

//        println("PassingCars -> " + PassingCars.solution(intArrayOf(0, 1, 0, 1, 1)))

//        println("Triangle -> " + Triangle.solution(intArrayOf(10, 2, 5, 1, 8, 20)))

//        println("MinAvgTwoSlice -> " + MinAvgTwoSlice.solution(intArrayOf(4, 2, 2, 5, 1, 5, 8)))
//
//        println("MaxProductOfThree -> " + MaxProductOfThree.solution(intArrayOf(-3, 1, 2, -2, 5, 6)))
//        println("MaxProductOfThree -> " + MaxProductOfThree.solution(intArrayOf(-6, -7, -10, -4, -5)))

//        println("Distinct -> " + Distinct.solution(intArrayOf(2, 1, 1, 2, 3, 1)))
//        println("Brackets -> " + Brackets.solution("((()))"))

//        println("Fish -> " + Fish.solution(intArrayOf(4, 3, 2, 1, 5), intArrayOf(0, 1, 0, 0, 0)))
//        println("Nesting -> " + Nesting.solution("(()(())())"))

//        val occupiedSeats = arrayOf(
//                charArrayOf('X', '.', 'X', 'X', 'X', '.'),
//                charArrayOf('X', '.', '.', '.', '.', '.'),
//                charArrayOf('X', '.', 'X', '.', 'X', '.'),
//                charArrayOf('.', '.', '.', '.', 'X', '.'),
//                charArrayOf('.', 'X', 'X', '.', 'X', '.'))
//
//        val occupied = listOf("1A", "1E", "2E", "3I")
//        println(AirPlane.solution(10, occupied))
//
//        PrintUtil.print(PrepareHamburgers.solution(17, 7)) // (-1, -1)
//        PrintUtil.print(PrepareHamburgers.solution(16, 7)) // (1, 6)
//        PrintUtil.print(PrepareHamburgers.solution(40, 15)) // (5, 10)
//        PrintUtil.print(PrepareHamburgers.solution(2, 1)) // (0, 1)

        println(LongestConsecutive.solution(intArrayOf())) // 1
        println(LongestConsecutive.solution(intArrayOf(5, 6, 7, 8, 9))) // 5
        println(LongestConsecutive.solution(intArrayOf(1, 2, 3, 5, 6, 7, 8, 9))) // 5
        println(LongestConsecutive.solution(intArrayOf(1, 2, 3, 10, 11, 15))) // 3
        println(LongestConsecutive.solution(intArrayOf(5, 4, 2, 1))) // 2
        println(LongestConsecutive.solution(intArrayOf(3, 5, 7, 10, 15))) // 1
        println(LongestConsecutive.solution(intArrayOf(5, -3, -2, -1, 0, 1, 5, 6, 7))) // 5

        println("------------")

        // Additional Examples:
        println(LongestConsecutive.solution(intArrayOf(3, 4, 5, -2, -1, 0, 1, 6, 7))) // 4
        println(LongestConsecutive.solution(intArrayOf(2, 3, 12, 11, 10, 9))) // 4
        println(LongestConsecutive.solution(intArrayOf(4, 5, 6, -4, -3, -2, -1, 0, 2, 3))) // 5
        println(LongestConsecutive.solution(intArrayOf(1, 3, 4, -7, -8, -9, -10, -11, 12, 11))) // 5

//        println(OCR.solution("A2Le", "2pL1")) // true
//        println(OCR.solution("1p1Le", "2pL1")) // true
//        println(OCR.solution("3Le", "AppLe")) // true
//        println(OCR.solution("ba1", "1Ad")) // false

//        println(Seasons.solution(intArrayOf(2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18)))

//        println(BinarySearch.solution(intArrayOf(2, 3, 4, 10, 40), 0, 4, 50))
    }
}
