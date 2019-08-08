package interview

/**
 * OCR reads strings from a given text. If it cannot recognize the character, it puts a digit which
 * shows the number of characters that the reader couldn't achieve to understand.
 * Write a function which returns true if these strings could be same or false.
 *
 * A2Le
 * 2pL1 // those can be the same.
 *
 * ba1
 * 1Ad // false
 */
object OCR {

    // Question #2 - Done
    fun solution(S: String, T: String): Boolean {

        var digitS: Int = 0
        var digitT: Int = 0

        var i = 0
        var j = 0
        while (i < S.length && j < T.length) {
            when {
                S[i].isDigit() && T[j].isDigit() -> { // Digit - Digit So, proceed. We don't know both of them.
                    if (digitS == 0) {
                        digitS = Character.getNumericValue(S[i])
                    }
                    if (digitT == 0) {
                        digitT = Character.getNumericValue(T[j])
                    }
                    digitS--
                    digitT--

                    if (digitS == 0) {
                        i++
                    }
                    if (digitT == 0) {
                        j++
                    }
                }
                S[i].isDigit() && !T[j].isDigit() -> { // Digit - Char
                    if (digitS == 0) {
                        digitS = Character.getNumericValue(S[i])
                    }
                    digitS--
                    if (digitS == 0) {
                        i++
                    }
                    j++

                }
                !S[i].isDigit() && T[j].isDigit() -> { // Char - Digit
                    if (digitT == 0) {
                        digitT = Character.getNumericValue(T[j])
                    }
                    digitT--
                    if (digitT == 0) {
                        j++
                    }
                    i++
                }
                !S[i].isDigit() && !T[j].isDigit() -> { // Char - Char
                    if (S[i] != T[j]) {
                        return false
                    }
                    i++
                    j++
                }
            }
        }
        return true
    }

    // Bad solution
    fun solution2(S: String, T: String): Boolean {
        var newS = ""
        for (char in S) {
            if (char.isDigit()) {
                for (i in 0 until Character.getNumericValue(char)) {
                    newS += "?"
                }
            } else {
                newS += char
            }
        }

        var newT = ""
        for (char in T) {
            if (char.isDigit()) {
                for (i in 0 until Character.getNumericValue(char)) {
                    newT += "?"
                }
            } else {
                newT += char
            }
        }

        if (newS.length != newT.length) {
            return false
        }

        for (i in 0 until newS.length) {
            if ((newS[i] != '?' && newT[i] != '?') && newS[i] != newT[i]) {
                return false
            }
        }
        return true
    }
}