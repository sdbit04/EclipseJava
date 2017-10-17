package Series;

public class MissDriver {
	public static void main (String [] args ) {
		
		Missing MissOB= new Missing();

		int [] ArrayStore=MissOB.inpt();
		int [] Sortedinput=MissOB.SortOut(ArrayStore);
		MissOB.check(Sortedinput);
			
		}	
}
