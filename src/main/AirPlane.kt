package main

object AirPlane {

    fun solution(rowCount: Int, occupiedSeats: List<String>): Int {

        val available = mutableListOf<Int>()

        for (i in 1 until rowCount + 1) {
            if (!occupiedSeats.contains(i.toString()+"A")
                    && !occupiedSeats.contains(i.toString()+"B")
                    && !occupiedSeats.contains(i.toString()+"C"))  {
                available.add(i)
            }
            if(!(occupiedSeats.contains(i.toString()+"D") && occupiedSeats.contains(i.toString()+"G"))
                    && !(occupiedSeats.contains(i.toString()+"E") || occupiedSeats.contains(i.toString()+"F"))) {
                available.add(i)
            }
            if (!occupiedSeats.contains(i.toString()+"H")
                    && !occupiedSeats.contains(i.toString()+"J")
                    && !occupiedSeats.contains(i.toString()+"K"))  {
                available.add(i)
            }
        }
        return available.size
    }
}