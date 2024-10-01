fun main() {

    printPrefix("one", "two", "three", "four", "five", prefix = "number: ")
    println("---------------END PROGRAM---------------")
}

fun printPrefix(vararg words: String, prefix: String) {

    for (i in words) {
        println(prefix + i)
    }

}