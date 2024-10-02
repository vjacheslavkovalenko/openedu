class Parrot {

    var nickname = ""
        get() = field.toLowerCase().capitalize()

    var age = 0
        set(value) {
            if (value < 0) {
                field = value
            }//else {field = age}
        }

}