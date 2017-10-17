package SpiralPrint;
import java.util.Scanner;
//import java.math.*;
public class SpiralP {

	protected int [][]  inpt(int a, int b)
	{
		int [][] ArrayIN = new int [a][b];
		System.out.println("Provide " +  a + " rows, each have " + b + " columns");
		Scanner scan=new Scanner(System.in);
		for (int i=0; i<a; i++)
		{
			for (int j=0; j<b; j++)
			{
				ArrayIN[i][j]=scan.nextInt();
			}
			System.out.println();
		}
				
		scan.close();
		System.out.println("The array is");
		for (int x=0; x<a; x++)
		{
			for (int y=0; y<b; y++)
			{
			System.out.print(ArrayIN[x][y] + " ");
			}
			System.out.println();
		}
	return ArrayIN;
		
	}
	
	protected void SpiPnt(int [][] INArray)
	{
		int a=INArray.length;
		int b=INArray[0].length;
	System.out.println("Spiral version of the above array");
	System.out.println("==================================");
		for (int i=0; i<a; i++)
		{
			int Res= (i % 2);
			//System.out.println("Remainder is " + Res);
			if ( Res == 0 )
			{	
				for (int j=0; j<b; j++)
				{
					System.out.print(INArray[i][j] + " ");
				}
			}
			else 
			{
				for (int x=(b-1); x>=0; x--)
				{
					System.out.print(INArray[i][x] + " ");
				}
			}
			
		}
	}
		
	public static void main(String[] args) 
		{
		int  row=0;
		int col=0;
		System.out.println("Provide Number of rows and column");
		Scanner Scan = new Scanner(System.in);
		row=Scan.nextInt();
		col=Scan.nextInt();
		SpiralP SpiralPOB= new SpiralP();
		int [][] InputArray=SpiralPOB.inpt(row,col);
		Scan.close();
		SpiralPOB.SpiPnt(InputArray);
		
		}

}
