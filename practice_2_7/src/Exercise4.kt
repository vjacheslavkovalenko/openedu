fun main() {

    println(even())
    println("---------------END PROGRAM---------------")
}

fun even() {
    val a = 11
    val b = 15

    if (a % 2 == 0) {
        println("Чётное число: a")}
    else{
        if (b % 2 == 0)
            println("Чётное число: b")
        else println("Чётных числе нет")}
}