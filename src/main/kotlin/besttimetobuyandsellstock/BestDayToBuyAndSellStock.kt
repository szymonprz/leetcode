package besttimetobuyandsellstock

class BestDayToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        var minimum = prices.first()
        var profit = 0
        var currentProfit: Int

        for (price in prices) {
            minimum = if (price < minimum) price else minimum
            currentProfit = price - minimum
            profit = if (currentProfit > profit) currentProfit else profit
        }
        return profit
    }
}
