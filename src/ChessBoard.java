
public class ChessBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChessBoard cb = new ChessBoard();
		int num =8;
		char[][] cbi= cb.chessBoardGeneratorV2(num);
		for(int i = 0;i<num;i++)
		{
			for(int j=0;j<num;j++) 
			{
				System.out.print(cbi[i][j]);
			}
			System.out.println();
		}

	}
	public char[][] chessBoardGenerator(int num)
	{
		char[][] chessb= new char[num][num];
		for(int i = 0;i<num;i++)
		{
			for(int j=0;j<num;j++) 
			{
				if(i%2==0)
				{
					if(j%2 == 0)
					{
						chessb[i][j] = 'W';
					}
					else
					{
						chessb[i][j] = 'B';
					}
				}
				else
				{
					if(j%2 == 0)
					{
						chessb[i][j] = 'B';
					}
					else
					{
						chessb[i][j] = 'W';
					}
				}
			}
		}
		return chessb;
	}
	public char[][] chessBoardGeneratorV2(int num)
	{
		char[] sample_row1 = new char[num];
		char[] sample_row2 = new char[num];
		char[][] cb = new char[num][num];
		
		for(int i=0;i<num;i++)
		{
			if(i%2==0)
			{
				sample_row1[i] = 'W';
				sample_row2[i] = 'B';
			}
			else
			{
				sample_row1[i] = 'B';
				sample_row2[i] = 'W';
			}
		}
		for(int i=0;i<num;i++)
		{
			if(i%2==0)
				cb[i] = sample_row1;
			else
				cb[i] = sample_row2;
		}
		
		return cb;
	}
	

}
