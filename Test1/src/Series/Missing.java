package Series;
import java.util.Scanner;
public class Missing {

	protected int [] inpt() 
	{
	 int [] inarray = new int[9];	
	
	System.out.println("Provode 9 digits");
	Scanner inscan = new Scanner(System.in);
		for (int i=0; i<9; i++)
		{
			inarray[i]=inscan.nextInt();
			
		}
	inscan.close();
		return inarray;
	}

	protected int [] SortOut(int [] SortInpt) {
		int [] SortInpt1 = SortInpt;
		
		int LengthIn=SortInpt1.length;
		
		for (int i=0; i < (LengthIn-1); i ++ ) {
			for (int j=(i+1); j < LengthIn; j ++)
			{
				if (SortInpt1[i] > SortInpt1[j] )
				{
					int back=SortInpt1[i];
					SortInpt1[i]=SortInpt1[j];
					SortInpt1[j]=back;
				}
				
			}
			
		}
			
		return SortInpt1;
	}
	protected void check (int [] inputarr) {
		
	int [] localarr = inputarr;
	int arrlength=localarr.length;
	int interval=0;
	int interval1=localarr[1]-localarr[0];
	int interval2=localarr[2]-localarr[1];
	int interval3=localarr[3]-localarr[2];
	if (interval1 == interval2)
	{ interval = interval1;}
	else if (interval2 == interval3)
	{interval=interval2;}
	else if (interval3 == interval1)
	{interval=interval3;}
		
	for (int i=0; i<(arrlength-1); i++) {
		
		if ( (localarr[i]+interval) != localarr[i+1]) {
			
			int NextExpected=(localarr[i]+interval);
			int NextActual=localarr[i+1];
			
			for (int j=NextExpected; j<NextActual; j=(j+interval) )
			{
				System.out.println( j + " is missing from series");
			}
			
		}
		
	}	
		
	}
	
public static void main (String [] args ) {
		
		Missing MissOB= new Missing();

		int [] ArrayStore=MissOB.inpt();
		int [] Sortedinput=MissOB.SortOut(ArrayStore);
		MissOB.check(Sortedinput);
			
		}
}

