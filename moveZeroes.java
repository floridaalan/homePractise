class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            nums[index++]=nums[i];
            }   
    }
    for(int i=0;i<nums.length;i++){
        if(index<nums.length){
            nums[index++]=0;
        }
    }
    for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
    }
    }
}
