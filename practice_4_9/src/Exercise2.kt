fun main() {

    println(symbol('f'))
    println(symbol('1'))
    println(number('1'))

}

fun symbol(s: Char) : Boolean {
    if (s in 'a'..'z' || s in 'A'..'Z')
        return true
    else return false
}

fun number(n: Char) : Boolean  {
    if (n !in '0'..'9')
        return true
    else return false
}