/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*
* */

fun main() {
    println(twoSum(intArrayOf(2, 7, 11, 15), 9).joinToString(","))
    println(twoSumComplexity(intArrayOf(2, 7, 11, 15), 9).joinToString(","))
}

//Complexity -> O(N^2)
fun twoSum(nums: IntArray, target: Int): IntArray {
    var result = intArrayOf()
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                result = intArrayOf(i, j)
                break
            }
        }
    }
    return result
}

//Complexity -> O(N)
fun twoSumComplexity(nums: IntArray, target: Int): IntArray {
    val dictionary = hashMapOf<Int, Int>()
    var result = intArrayOf()
    for (i in nums.indices) {
        val sum = target - nums[i]
        if (dictionary[sum] == null) {
            dictionary[nums[i]] = i
        } else {
            result = intArrayOf(dictionary[sum]!!, i)
            break
        }
    }
    return result
}