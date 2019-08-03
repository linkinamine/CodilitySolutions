package main

/**
 * Given an 2D board, count how many battleships are in it.
 *
 * The battleships are represented with 'X's, empty slots are represented with '.'s.
 * You may assume the following rules:
 *
 * 1) You receive a valid board, made of only battleships or empty slots.
 * 2) Battleships can only be placed horizontally or vertically. In other words, they can only be made
 * of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
 * 3) At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
 */
object BattleshipsInABoard {

    // If point is X, the point above of it and the point left of it cannot be X
    fun countBattleships(board: Array<CharArray>): Int {
        val rowCount = board.size
        val columnCount = board[0].size

        if (rowCount == 0 || columnCount == 0) return 0

        var countOfBattleShips = 0
        for (i in 0 until rowCount) {
            for (j in 0 until columnCount) {
                if (board[i][j] == '.') continue
                if (i > 0 && board[i - 1][j] == 'X') continue // vertical ship
                if (j > 0 && board[i][j - 1] == 'X') continue // horizontal ship
                countOfBattleShips++
            }
        }
        return countOfBattleShips
    }
}