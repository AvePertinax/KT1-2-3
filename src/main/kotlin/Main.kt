fun main() {
    println("Введите сумму покупки:")
    val purchaseAmount = readLine()?.toIntOrNull() ?: 0

    println("Являетесь ли вы постоянным покупателем? (y/n)")
    val isRegularCustomer = readLine()?.equals("y", true) ?: false

    var discountAmount = 0
    var discountPercent = 0

    when {
        purchaseAmount in 1_001..10_000 -> {
            discountAmount = 100
        }
        purchaseAmount >= 10_001 -> {
            discountPercent = 5
        }
    }

    if (isRegularCustomer) {
        discountPercent += 1
    }

    if (discountAmount > 0) {
        println("Ваша скидка составляет $discountAmount рублей.")
        println("Сумма к оплате: ${purchaseAmount - discountAmount} рублей.")
    } else if (discountPercent > 0) {
        val discountedAmount = purchaseAmount * (100 - discountPercent) / 100
        println("Ваша скидка составляет $discountPercent%.")
        println("Сумма к оплате: $discountedAmount рублей.")
    } else {
        println("Сумма к оплате: $purchaseAmount рублей.")
    }
}