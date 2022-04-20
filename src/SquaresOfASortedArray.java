
public class SquaresOfASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {-5,-2,1,3,4};
		SquaresOfASortedArray soasa = new SquaresOfASortedArray();
		int[] s_ar=soasa.sortedSquares(ar);
		for(int i=0;i<s_ar.length;i++) {
			System.out.println(s_ar[i]);
		}

	}
	public int[] sortedSquares(int[] nums) 
	{
		int p_start=-1, n_start=-1;
		int[] squared_nums = new int[nums.length];
		int i;
		//find the first non negative number
		for(i =0; i< nums.length; i++)
		{
			if(Integer.signum(nums[i]) == 1 || Integer.signum(nums[i]) == 0)
			{
				
				p_start =i;
				n_start = i-1;
				System.out.println("Non negative number found\n N_start ="+n_start+"\nP_start ="+p_start);
				break;
			}
			else
			{
				n_start = i;
				p_start = i+1;
				System.out.println("Negative number found\n N_start ="+n_start+"\nP_start ="+p_start);
			}
		}
		
		i=0;
		//pick and choose till negative numbers exists
		
		  while(n_start > -1 && p_start < nums.length) 
		  {
			  if(Math.abs(nums[n_start])<nums[p_start]) 
			  { 
				  squared_nums[i] = nums[n_start] *	nums[n_start]; 
				  n_start --; 
			  }
			  else 
			  { 
				  squared_nums[i] = nums[p_start] * nums[p_start]; 
				  p_start++; 
			  } 
			  i++; 
		  } 
		  while(n_start > -1) 
		  { 
			  squared_nums[i] = nums[n_start] * nums[n_start]; 
			  n_start --; 
			  i++;
		  }
		  
		  //check if positive elements are remaining 
		  while(p_start < nums.length) 
		  {
			  squared_nums[i] = nums[p_start] * nums[p_start]; 
			  p_start++; 
			  i++; 
		  }
		 
		
		
		return squared_nums;
        
    }

}
