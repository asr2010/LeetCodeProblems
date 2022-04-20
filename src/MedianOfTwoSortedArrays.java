//Given 2 sorted arrays find the median of the merged array

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) 
	{
				
	        int median_upper = (nums1.length+nums2.length)/2;
			int median_lower = median_upper-1+(nums1.length+nums2.length)%2;
			int i=0;
			int start_1 = 0;
			int start_2 = 0;
			int[] merged = new int[nums1.length+nums2.length];
			for(i=0;start_1<nums1.length && start_2< nums2.length;i++)
			{
				if(nums1[start_1]<=nums2[start_2])
				{
					merged[i]=nums1[start_1];
					start_1++;
				}
				else 
	            {
					merged[i]=nums2[start_2];
					start_2++;
				}
	            if(i == median_upper)
	                return (merged[median_lower]+merged[median_upper])/2.0;
	        }
	        if(start_1<nums1.length)
	        {
				while(start_1<nums1.length) 
	            {
					merged[i] = nums1[start_1];
					start_1++;
	                if(i == median_upper)
	                    return (merged[median_lower]+merged[median_upper])/2.0;
	                i++;
				}	
			}
			else 
	        {
				while(start_2<nums2.length) 
	            {
					merged[i] = nums2[start_2];
					start_2++;
	                if(i == median_upper)
	                    return (merged[median_lower]+merged[median_upper])/2.0;
	                i++;
				}
				
			}
	        return -1;
	    }

}
