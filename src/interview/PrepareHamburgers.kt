package interview

/**
 * You have been tasked to prepared as many burgers as possible given a limited set of ingredients.
 * All burgers contains tomatoes and cheese.
 *
 * Write a function,
 * fun solution(X: Int, Y:Int): IntArray
 * which given X tomatoes and Y cheese slices returns a tuple/list of the number of big burgers and mini burgers, can be prepared.
 * All ingredients must be used up. In case there are any remainders ingredient, output an array with values (-1, -1).
 *
 * In case there are one big burger and no mini burger, output for example (1, 0).
 *
 * A big burger contains 4 tomatoes and 1 slice of cheese, whereby a mini burger contains 2 tomatoes and 1 slice of cheese.
 *
 * 7 cheese, 16 tomatoes = 1 big & 6 mini
 * 15 cheese, 40 tomatoes = 5 big, 10 mini
 */
object PrepareHamburgers {

    // X -> tomatoes, Y -> Cheeses
    fun solution(X: Int, Y: Int): IntArray {

        // (a, b) a for big burgers, b for mini
        //  a + b = Y
        // 4a + 2b = X

        val a = (X - (2 * Y)) / 2.0
        val b = ((4 * Y) - X) / 2.0

        val aToInt = a.toInt()
        val bToInt = b.toInt()

        return if (a < 0 || a - aToInt > 0 || b < 0 && b - bToInt > 0) {
            intArrayOf(-1, -1)
        } else {
            intArrayOf(aToInt, bToInt)
        }
    }
}