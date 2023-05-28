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
    println(main(500, false))
    println(main(500, true))

    println(main(1250, false))
    println(main(1250, true))

    println(main(11200, false))
    println(main(11200, true))
}