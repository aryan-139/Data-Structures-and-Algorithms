class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int rem = target - numbers[i];
            int remPos = bin(numbers, rem, i + 1, numbers.length - 1);
            if (remPos != -1) {
                res[0] = i + 1;
                res[1] = remPos + 1; // 1-based indexing
                break;
            }
        }
        return res;
    }

    private int bin(int[] numbers, int val, int l, int r) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] == val) {
                return mid;
            } else if (numbers[mid] < val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
