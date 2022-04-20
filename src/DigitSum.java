
public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DigitSum ds = new DigitSum();
		int count = ds.countOfDigiSum(20, 5);
		System.out.println(count);

	}
	
	public int countOfDigiSum(int x, int y)
	{
		int count =0;
		for(int i = 0; i<=x;i++)
		{
			if(sumOfDigi(i) == y)
				count++;
			
		}
		return count;
	}
	public int sumOfDigi(int n)
	{
		int sum = 0;
		while(n!=0)
		{
			sum = sum + n%10;
			n=n/10;
		}
		return sum;
	}

}
