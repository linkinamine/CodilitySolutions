package main

import java.util.*

/**
 * Nesting
 * Determine whether a given string of parentheses (single type) is properly nested.
 *
 * A string S consisting of N characters is called properly nested if:
 * S is empty;
 * S has the form "(U)" where U is a properly nested string;
 * S has the form "VW" where V and W are properly nested strings.
 * For example, string "(()(())())" is properly nested but string "())" isn't.
 *
 * Write a function:
 * fun solution(S: String): Int
 * that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.
 * For example, given S = "(()(())())", the function should return 1 and given S = "())",
 * the function should return 0, as explained above.
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [0..1,000,000];
 * string S consists only of the characters "(" and/or ")".
 */
object Nesting {

    fun solution(S: String): Int {
        if (S.isEmpty()) {
            return 1
        }

        if (S.length % 2 != 0) {
            return 0
        }

        val stack = Stack<Char>()

        for (i in 0 until S.length) {
            if (S[i] == '(') {
                stack.push(')')

            } else if (S[i] == ')') {
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