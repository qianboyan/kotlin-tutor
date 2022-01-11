package basic

fun main() {
    var name = "John"
    val birthyear = 1975

    val myNum: Int = 5                // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String

    println(name)
    println(birthyear)
    println("Hello, World!")

    var txt = "Hello World"
    println(txt[0])
    println("The length of the txt string is: " + txt.length)
    var firstName = "John "
    var lastName = "Doe"
    println(firstName.plus(lastName))
    println("My name is $firstName $lastName")

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    println(cars.size)

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) {
        println(x)
    }

    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    for (chars in 'a'..'x') {
        println(chars)
    }
}
