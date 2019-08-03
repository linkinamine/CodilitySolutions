package main

/**
 * GenomicRangeQuery
 * Find the minimal nucleotide from a range of sequence DNA.
 *
 * A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types
 * of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer.
 * Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively.
 * You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained
 * in a particular part of the given DNA sequence?
 *
 * The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters.
 * There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers.
 * The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained
 * in the DNA sequence between positions P[K] and Q[K] (inclusive).
 *
 * For example, consider string S = CAGCCTA and arrays P, Q such that:
 * P[0] = 2    Q[0] = 4
 * P[1] = 5    Q[1] = 5
 * P[2] = 0    Q[2] = 6
 * The answers to these M = 3 queries are as follows:
 *
 * The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2
 * respectively, so the answer is 2.
 * The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
 * The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose
 * impact factor is 1, so the answer is 1.
 *
 * Write a function:
 * fun solution(S: String, P: IntArray, Q: IntArray): IntArray
 * that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers,
 * returns an array consisting of M integers specifying the consecutive answers to all queries.
 *
 * Result array should be returned as an array of integers.
 * For example, given the string S = CAGCCTA and arrays P, Q such that:
 * P[0] = 2    Q[0] = 4
 * P[1] = 5    Q[1] = 5
 * P[2] = 0    Q[2] = 6
 * the function should return the values [2, 4, 1], as explained above.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000];
 * M is an integer within the range [1..50,000];
 * each element of arrays P, Q is an integer within the range [0..N − 1];
 * P[K] ≤ Q[K], where 0 ≤ K < M;
 * string S consists only of upper-case English letters A, C, G, T.
 */
object GenomicRangeQuery {

    // Score [100%]
    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {

        val result = IntArray(P.size)

        // Creates a new array of the specified [size], with all elements initialized to zero.
        val A = IntArray(S.length + 1) // {0, 0, 1, 1, 1, 1, 1, 2}
        val C = IntArray(S.length + 1) // {0, 1, 1, 1, 2, 3, 3, 3}
        val G = IntArray(S.length + 1) // {0, 0, 0, 1, 1, 1, 1, 1}
        val T = IntArray(S.length + 1) // {0, 0, 0, 0, 0, 0, 1, 1}

        // Counting (Note: A[0]=0, C[0]=0, G[0]=0, T[0]=0)
        for (i in 0 until S.length) {
            when {
                S[i] == 'A' -> {
                    A[i + 1] = A[i] + 1
                    C[i + 1] = C[i]
                    G[i + 1] = G[i]
                    T[i + 1] = T[i]
                }
                S[i] == 'C' -> {
                    A[i + 1] = A[i]
                    C[i + 1] = C[i] + 1
                    G[i + 1] = G[i]
                    T[i + 1] = T[i]
                }
                S[i] == 'G' -> {
                    A[i + 1] = A[i]
                    C[i + 1] = C[i]
                    G[i + 1] = G[i] + 1
                    T[i + 1] = T[i]
                }
                S[i] == 'T' -> {
                    A[i + 1] = A[i]
                    C[i + 1] = C[i]
                    G[i + 1] = G[i]
                    T[i + 1] = T[i] + 1
                }
            }
        }

        for (i in 0 until P.size) {
            val start = P[i]
            val end = Q[i] + 1
            when {
                A[end] - A[start] > 0 -> result[i] = 1
                C[end] - C[start] > 0 -> result[i] = 2
                G[end] - G[start] > 0 -> result[i] = 3
                T[end] - T[start] > 0 -> result[i] = 4
            }
        }
        return result
    }

    // Score [62%]
//    fun solution(S: String, P: IntArray, Q: IntArray): IntArray {
//
//        val result = IntArray(P.size)
//
//        for (i in 0 until P.size) {
//            val start = P[i]
//            val end = Q[i] + 1
//
//            for (j in start until end) {
//                when {
//                    S.subSequence(start, end).contains('A') -> result[i] = 1
//                    S.subSequence(start, end).contains('C') -> result[i] = 2
//                    S.subSequence(start, end).contains('G') -> result[i] = 3
//                    S.subSequence(start, end).contains('T') -> result[i] = 4
//                }
//            }
//        }
//        return result
//    }
}