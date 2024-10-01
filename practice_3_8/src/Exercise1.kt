fun main () {
    
println(nullString("kotlin"))

}

fun nullString (stroka: String?) : String {

    if (stroka != null && stroka.length > 0) {
        return "Длина строки ${stroka.length}"
    } else {
        return "Строка не содержит значений или null"
    }

}