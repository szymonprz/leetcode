package runningsumof1darray

class RunningSumOf1DArray {
    fun runningSum(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var lastSum = 0
        nums.withIndex().forEach {
            lastSum += it.value
            result[it.index] = lastSum
        }
        return result
    }
}