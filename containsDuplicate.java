import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        ArrayList <Integer> dl=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            dl.add(nums[i]);
        }

        HashMap <Integer,Integer> hp=new HashMap<>();
        for(int data:dl){
            hp.put(data,hp.getOrDefault(data,0)+1);
        }
        boolean hasDuplicate=false;
        for(int data:hp.keySet()){
            if(hp.get(data)>1){
                hasDuplicate=true;
            }
        }
        return hasDuplicate;


    }
}
