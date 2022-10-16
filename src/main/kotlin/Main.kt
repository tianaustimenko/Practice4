fun main(args: Array<String>) {
    printFullName()
    calculateFullName()
    println (calculateFullName())
    isPrime(4)
    isPrime(17)

}

fun printFullName(firstName: String = "Татьяна", lastName: String = "Устименко" ){
    println("$firstName $lastName")
}

fun calculateFullName(firstName: String = "Татьяна", lastName: String = "Устименко" ): Pair<String, Int>{
    val fullName = "$firstName $lastName"
    return Pair(fullName, fullName.length)
}

fun isPrime(n: Int): Boolean {
    if (n < 2) {println("Не простое число")
    return false}

    for (m in 2..n - 1) {
        if (n % m == 0) {println("Не простое число")
        return false}

    }
    println("Простое число")
    return true

}