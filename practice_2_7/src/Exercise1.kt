import java.util.Scanner

fun main() {

//fun variables(){

    println("Введите Ваше имя:")

    val reader = Scanner(System.`in`)
    val name = reader.nextLine()

    println("Введите Ваш возраст:")

    val age = reader.nextInt()

    println("Привет, $name! Ваш возраст: $age.")
    println("-----------------")

    val message = "Hi, $name! Your age is $age. This message from variable."

    println(message)
    println("---------------END PROGRAM---------------")

//}
}