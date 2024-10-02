fun main() {

    var car1 = Car("Light", "Nissan", 1999)
    car1.printAll()
    var car2 = Car("Heavy", "MS", 2005)
    car2.printAll()

}

fun Car.printAll() {
    println("$type, $model, $year")
}