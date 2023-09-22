/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
*
* */

fun main() {
    val nums = intArrayOf(1, 2, 3, 1)
    println(containsDuplicate(nums))
}

fun containsDuplicate(nums: IntArray): Boolean {
    val hashMap = HashMap<Int, Int>()
    for (i in nums.indices) {
        if (hashMap[nums[i]] != null) return true
        hashMap[nums[i]] = i
    }
    return false
}