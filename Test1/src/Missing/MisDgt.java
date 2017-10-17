package Missing;

import java.util.Scanner;
//import java.util.ArrayList;

public class MisDgt {
static int [] srcarr=new int[] {1,2,3,4,5,6,7,8,9,0};

public void Misdgit(int [] inpt) {
//ArrayList<Integer> alist = new ArrayList<Integer>();
 
 int [] inptarr = inpt;
 
 for (int i : srcarr)
 {
	 String Match = "yes";
	 
	 for (int j : inptarr) 
	 {
		 Match = "yes";
		if ( i == j )
		{
		break ; 	
		}
		else 
		{
			Match = "No";
		}
	 }
if (Match == "No")	{
	
	System.out.println(i + " not into list");

}
 }
		 
 }
//numbers array need to be populated by input stream
public int[] inpt () {
		int [] numbers = new int [6];
		 Scanner inputarr = new Scanner(System.in);
		 System.out.println("Please enter 6 numbers " + "\n");
		for (int i=0; i<6; i++) 
		{
		numbers[i]=inputarr.nextInt();	
		}
		inputarr.close();
		return numbers;
		
}

public static void main (String [] args) {
	
	MisDgt MDOB = new MisDgt();
	int [] nbrs=MDOB.inpt();
	MDOB.Misdgit(nbrs);
	
}
}
