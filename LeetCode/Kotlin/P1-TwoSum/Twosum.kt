/*Goal of TwoSum Problem: 
* Learn how to use Kotlin in vscode
* Learn how to create and use a hashmap
* Start posting leetcode problems on github.
*/

fun main(){  
    val integers = intArrayOf(2,7,11,15)
    val answer = twoSet(integers, 13)
    System.out.print("${answer[0]}" + " " + "${answer[1]}")
}

fun twoSet(nums: IntArray, target: Int): IntArray{
    val map : HashMap<Int, Int> = HashMap<Int, Int>()
    val arr = IntArray(2){0}
    for(i in nums.indices){
        if(map.containsKey(target-nums[i])){
            arr[0] = map[target-nums[i]]!!
            arr[1] = i
        }
        map[nums[i]] = i
    }
    return arr
}