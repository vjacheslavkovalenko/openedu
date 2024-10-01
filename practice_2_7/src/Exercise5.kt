import java.util.*

fun main (){

    println("Введите число от 1 до 7.")

    val reader = Scanner(System.`in`)
    val namberOfDays = reader.nextInt()

    when  {
        namberOfDays == 1 -> println("1=Понедельник")
        namberOfDays == 2  -> println("2=Вторник")
        namberOfDays == 3  -> println("3=Среда")
        namberOfDays == 4  -> println("4=Четверг")
        namberOfDays == 5  -> println("5=Пятница")
        namberOfDays == 6  -> println("6=Суббота")
        namberOfDays == 7  -> println("7=Воскресенье")
        else -> println("Неправильно введено число!")
    }

    println("---------------END PROGRAM---------------")

}