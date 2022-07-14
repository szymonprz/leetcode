package findpivotIndex

class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var totalSum = nums.sum()
        var leftSum = 0
        for ((index, value) in nums.withIndex()) {
            if (leftSum == totalSum - nums[index]) {
                return index
            } else {
                leftSum += value
                totalSum -= value
            }
        }
        return -1
    }
}