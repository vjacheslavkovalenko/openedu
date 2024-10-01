fun main() {

    val arrayCreate = mutableListOf<Int>()

    arrayCreate.addAll(listOf(5, -15, 100, -55, 20, -5, -80, 45, 25, -10))

    var temp = 0

    for (i in 0..arrayCreate.count() - 2) {
        for (j in 0..arrayCreate.count() - i - 2) {
            if (arrayCreate[j] > arrayCreate[j + 1]) {
                temp = arrayCreate[j]
                arrayCreate[j] = arrayCreate[j + 1]
                arrayCreate[j + 1] = temp
            }
        }

    }
    arrayCreate.forEach { element ->
        println(element)
    }


}