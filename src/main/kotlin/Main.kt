fun main(amount: Int, regularCustomer: Boolean): Int {
    val res = if (amount in 0..1000) {
        amount
    }
    else if (amount in 1001..10000) {
        amount - 100
    }
    else {
        (amount * 0.95).toInt()
    }

    return if (regularCustomer) (res * 0.99).toInt() else res
}

fun main() {
    println(main(900, false))
    println(main(900, true))

    println(main(1400, false))
    println(main(1400, true))

    println(main(15000, false))
    println(main(15000, true))
}