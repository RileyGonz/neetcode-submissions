class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int pointer1 = 0;
        int pointer2 = 0;
        HashSet<Integer> bank = new HashSet<>();
        for(int i = 0; i < nums.length-1;i++){
            if(!bank.contains(nums[i])){
                bank.add(nums[i]);
                pointer1 = i+1;
                pointer2 = nums.length-1;
                int target = -nums[i];
                while(pointer1 < pointer2){
                    if(nums[pointer1] + nums[pointer2] > target){
                        pointer2--;
                    }
                    else if(nums[pointer1] + nums[pointer2] < target){
                        pointer1++;
                    }else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[pointer1]);
                        temp.add(nums[pointer2]);
                        result.add(temp);
                        while(pointer1 < pointer2 && nums[pointer1] == nums[pointer1 + 1]) pointer1++;
                        while(pointer1 < pointer2 && nums[pointer2] == nums[pointer2 - 1]) pointer2--;
                        pointer2--;
                        pointer1++;
                    }
                }
            }
        }
        return result;
    }
}
