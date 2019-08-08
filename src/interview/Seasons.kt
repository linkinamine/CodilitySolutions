package interview

/**
 * You are given a year list which contains the temperatures in it.
 * Each season is equal and has length T/4.
 *
 * Find the max amplitude of each season  and return the max value.
 *
 */
object Seasons {

    fun solution(T: IntArray): String {
        val list = T.toList()
        val chunkedList = list.chunked(T.size / 4)
        val seasonArray = chunkedList.map { it.max()!! - it.min()!! }

        return when (seasonArray.indexOf(seasonArray.max())) {
            0 -> "WINTER"
            1 -> "SPRING"
            2 -> "SUMMER"
            3 -> "AUTUMN"
            else -> "ERROR"
        }
    }
}