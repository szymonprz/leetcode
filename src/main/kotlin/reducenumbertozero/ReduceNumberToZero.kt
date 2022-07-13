package reducenumbertozero

class ReduceNumberToZero {
    fun numberOfSteps(num: Int): Int {
        var steps = 0
        var currentValue = num
        while (currentValue != 0) {
            if (currentValue % 2 == 0) {
                currentValue /= 2
            } else {
                currentValue--
            }
            steps++
        }
        return steps
    }
}