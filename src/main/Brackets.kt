package main

import java.util.*

/**
 * Brackets
 * Determine whether a given string of parentheses (multiple types) is properly nested.
 *
 * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:
 * S is empty;
 * S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, the string "{[()()]}" is properly nested but "([)()]" is not.
 *
 * Write a function:
 * fun solution(S: String): Int
 * that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.
 * For example, given S = "{[()()]}", the function should return 1 and
 * given S = "([)()]", the function should return 0, as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..200,000];
 * string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
object Brackets {

    // Score [100%]
    fun solution(S: String): Int {

        if (S.isEmpty()) {
            return 1
        }

        if (S.length % 2 != 0) {
            return 0
        }

        val stack = Stack<Char>()

        for (i in 0 until S.length) {
            // note: push "its pair"
            if (S[i] == '(') {
                stack.push(')')

            } else if (S[i] == '[') {
                stack.push(']')

            } else if (S[i] == '{') {
                stack.push('}')

            } else if (S[i] == ')' || S[i] == ']' || S[i] == '}') {
                if (stack.isEmpty()) {
                    return 0
                } else {
                    if (stack.pop() != S[i]) {
                        return 0
                    }
                }
            }
        }
        return if (stack.isEmpty()) { 1 } else { 0 }
    }
}