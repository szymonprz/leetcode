package firstbadversion

abstract class VersionControl(private val badVersion: Int) {
    abstract fun firstBadVersion(n: Int): Int

    fun isBadVersion(version: Int): Boolean {
        return version >= badVersion
    }
}

class FirstBadVersion(badVersion: Int): VersionControl(badVersion) {
    override fun firstBadVersion(n: Int) : Int {
        var left = 1
        var right = n
        while(left <= right){
            val pivot = left + (right - left) / 2
            if(isBadVersion(pivot)) right = pivot -1
            else left = pivot + 1
        }
        return left
    }
}