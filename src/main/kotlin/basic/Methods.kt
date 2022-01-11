package basic

fun myFunction(fname: String, age: Int) {
    println(fname + " is " + age)
}

fun myFunction2(x: Int): Int {
    return (x + 5)
}

fun myFunction3(x: Int, y: Int) = x + y

fun main() {
    myFunction("John", 35)
    myFunction2(3)
    myFunction3(1, 2)
}