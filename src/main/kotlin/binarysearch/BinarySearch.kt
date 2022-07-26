package binarysearch

class BinarySearch {

    fun search(nums: IntArray, target: Int): Int {
        var pivot: Int
        var left = 0
        var right: Int = nums.size - 1
        while (left <= right) {
            pivot = (left + right) / 2
            if (nums[pivot] == target) return pivot
            if (target < nums[pivot]) right = pivot - 1 else left = pivot + 1
        }
        return -1
    }

}