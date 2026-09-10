class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map= new HashMap<>();

       for(int i=0;i<nums.length;i++)
       {
          int findNo= target-nums[i];
          if(map.containsKey(findNo))
          {
            return new int[]{map.get(findNo),i};
          }
          else
          {
            map.put(nums[i],i);
          }
       }
       return new int[]{};
        
    }
}
