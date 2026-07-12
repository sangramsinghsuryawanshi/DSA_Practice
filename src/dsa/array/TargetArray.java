package dsa.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */
public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] ind = {0,1,2,2,1};
        List<Integer> lst = new LinkedList<>();
        int cnt=0,a=0;
        char ch='z';
        for(int i=0;i<nums.length;i++){
            lst.add(ind[cnt++],nums[a++]);
        }
        System.out.println((int)ch+"");
    }
}
