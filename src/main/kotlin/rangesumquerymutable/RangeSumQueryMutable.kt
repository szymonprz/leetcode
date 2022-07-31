package rangesumquerymutable

class RangeSumQueryMutable(nums: IntArray) {
    private val numbers = nums
    fun update(index: Int, `val`: Int){
        numbers[index] = `val`
    }

    fun sumRange(left: Int, right: Int): Int {
        var sum = 0
        for(i in left..right){
            sum+=numbers[i]
        }
        return sum
    }
}