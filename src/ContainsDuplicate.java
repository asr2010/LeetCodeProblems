import java.util.HashMap;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {1,2,3,4,1,5};
		
		ContainsDuplicate cd = new ContainsDuplicate();
		System.out.println(cd.containsDuplicate(ar));

	}
	public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> distinct_list = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
        	if(distinct_list.containsKey(nums[i])) {
        		return true;
        	}
        	distinct_list.put(nums[i], i);
        }
        return false;
        
    }

}
