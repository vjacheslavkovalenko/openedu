import java.util.*

fun main() {

    var reader = Scanner(System.`in`)

    println("Введите число (элементов в массиве)")

    var n = reader.nextInt()

    var j = mutableListOf<Int>()

    for (i in 0..n) {
        println("Ввевидите индекс[$i] - ")
        j.add(reader.nextInt())
    }

    j.forEach { i ->
        print(i)
    }
}