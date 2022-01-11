package basic

class Car {
    var brand = ""
    var model = ""
    var year = 0
}

class Truck (var brand: String, var model: String, var year: Int)

class Vehicle(var brand: String, var model: String, var year: Int) {
    fun drive() {
        println("Wrooom!" + brand + model + year)
    }
}

open class MyParentClass {
    val x = 5
}

class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x) // x is now inherited from the superclass
    }
}

fun main() {
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969
    val t1 = Truck("BMW", "i3", 1999)

    println(c1.brand + c1.model + c1.year)
    println(t1.brand + t1.model + t1.year)

    val v1 = Vehicle("VW", "ID3", 2020)
    v1.drive()

    val myObj = MyChildClass()
    myObj.myFunction()
}