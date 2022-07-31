package twosum

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mapOfNumbers = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val lookingFor = target - nums[i]
            val indexOfSecondElement = mapOfNumbers[lookingFor]
            if (indexOfSecondElement != null) return intArrayOf(i, indexOfSecondElement)
            else mapOfNumbers[nums[i]] = i
        }
        return intArrayOf()
    }
}
