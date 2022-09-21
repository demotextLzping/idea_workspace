/**
 * @author lzp
 * @version 1.0
 * @date 2022/8/24 13:22
 */
public class demo {
    public static void main(String[] args) {
        Solution s=new Solution();
        for (int i : s.twoSum(new int[]{2, 7, 11, 15}, 9)) {
            System.out.println(i);
        }
    }

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }

}