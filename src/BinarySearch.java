
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {1,2,3,4,5};
		int target = 5;
		
		BinarySearch bs = new BinarySearch();
		int pos = bs.binarySeach(ar, target);
		if(pos == -1)
		{
			System.out.println("Target not found");
		}
		else
		{
			System.out.println("Number "+target+" found at index "+pos);
		}
	}
	
	public int binarySeach(int[] nums, int target) {
		int start, end, mid;
		start =0;
		end = nums.length - 1;
		//mid = (nums.length)/2;
		while(start<=end)
		{
			mid = (start + end)/2;
			if(nums[mid] == target)
			{
				return mid;
			}
			else
			{
				if(nums[mid] < target)
				{
					start = mid + 1;
				}
				else
				{
					end = mid - 1;
				}
			}
		}
		return -1;
	}

}
