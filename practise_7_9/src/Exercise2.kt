fun main() {

    var aircraft = Airplane(156, 2015, "Airbus A-319")
    println("${aircraft.seats}, ${aircraft.year}, ${aircraft.model}")
    aircraft.model = "Airbus A-320"
    println("${aircraft.model}")
    println("---------------END PROGRAM---------------")

}