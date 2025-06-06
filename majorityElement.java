import java.util.HashMap;
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int mem:nums){
            hp.put(mem,hp.getOrDefault(mem,0)+1);
        }
        for(int mem:hp.keySet()){
            if(hp.get(mem)> n/2){
               return mem;
            }
        }
        return -1;
    }
}
