
public class SearchInserPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,4,5};
		int target = 3;
		
		SearchInserPosition sip = new SearchInserPosition();
		int pos = sip.searchInsert(ar, target);
		System.out.println(pos);

	}
	public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int mid = 0;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return start;
    }

}
