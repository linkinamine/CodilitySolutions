package interview

object BinarySearch {

    fun solution(array: IntArray, fromIndex: Int, toIndex: Int, element: Int): Int {

        if (toIndex >= fromIndex) {
            val mid = (toIndex + fromIndex) / 2

            // If the element is present at the middle itself
            if (array[mid] == element) {
                return mid
            }

            return if (array[mid] > element) { // If element is smaller than mid, then it can only be present in left sub-array
                solution(array, fromIndex, mid - 1, element)
            } else {
                solution(array, mid + 1, toIndex, element) // Else the element can only be present in right sub-array
            }
        }

        return -1
    }
}