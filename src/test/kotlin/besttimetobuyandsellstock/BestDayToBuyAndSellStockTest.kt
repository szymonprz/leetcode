package besttimetobuyandsellstock

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.ints.shouldBeExactly

class BestDayToBuyAndSellStockTest : StringSpec({

    "should return maximum profit" {
        BestDayToBuyAndSellStock().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)) shouldBeExactly 5
    }

    "should return 0 if no maximum profit" {
        BestDayToBuyAndSellStock().maxProfit(intArrayOf(7, 6, 4, 3, 1)) shouldBeExactly 0
    }
})
