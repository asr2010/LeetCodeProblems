
public class FirstBadVersion {

	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		
		int n = 1;
		
		FirstBadVersion fbv = new FirstBadVersion();
		int fbv_pos = fbv.firstBadVersion(n);
		if(fbv_pos == -1 )
		{
			System.out.println("No bad version found");
		}
		else
		{
			System.out.println("First bad version was: "+ fbv_pos);
		}

	}
	public int firstBadVersion(int n) throws Exception
	{
		int start =0, end = n, mid = (start+end)/2, firstVersion = -1;
		
		while(start <= end)
		{
			System.out.println("Next is: "+ start+" end is: "+ end);
			mid = (end-start)/2+start;
			
			System.out.println("mid Value: "+mid);
			if(isBadVersion(mid)) {
				firstVersion = mid;
				end = mid -1;
				System.out.println("OOO--Currently checking at: "+mid+" value: True");
				System.out.println("Next start is: "+ start);
			}
			else
			{
				start = mid + 1;
				System.out.println("XXX--Currently checking at: "+mid+" value: False");
				System.out.println("Next start is: "+ start+" end is: "+ end);
				
				Thread.sleep(2000);
			}
		}
		return firstVersion;
	}
	public boolean isBadVersion(int version)
	{
		
		
		int target =1;
		if(version>=target)
		{
			return true;
		}
		return false;
	}

}
