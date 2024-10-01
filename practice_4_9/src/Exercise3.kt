fun main() {

    println(findMin(1, 3))
    println(findMin(4, 2, true))

}

fun findMin(n: Int, m: Int, nikak: Boolean = false): Int {

    val v1: Int
    val v2: Int

    if (nikak) {
        v1 = Math.abs(n)
        v2 = Math.abs(m)
    } else {
        v1 = n
        v2 = m
    }

    return if (v1 < v2) n else m

}