package SpiralPrintN;

import java.util.Scanner;

public class SpiPrint {

	protected int [][]  inpt(int a, int b)
	{
		int [][] ArrayIN = new int [a][b];
		System.out.println("Provide data for " +  a + " rows, each have " + b + " columns");
		Scanner scan=new Scanner(System.in);
		for (int i=0; i<a; i++)
		{
			for (int j=0; j<b; j++)
			{
				ArrayIN[i][j]=scan.nextInt();
			}
			System.out.println(); //leave a line after receiving a row of data
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
	
	protected void SpiPnt (int [][] INArray) {
	int row = INArray.length;
	int col = INArray[0].length;
	int a=0; //starting of row index
	int b=0; //starting of col index
	int i;
	//for (a=0; a<=(row/2); a++) {
	while (a<row & b<col) {
		
		//if (a<row) {
		for (i=b;i<=(col-1);i++){
			System.out.print(INArray[a][i] + " ");
			}
		a++ ;
		//}
		
		for ( i=a; i<=(row-1);i++) {
			System.out.print(INArray[i][col-1] + " ");
		}
		col--;
		
		if (a<row) {
		for (i=(col-1); i>=b;i--){
			System.out.print(INArray[row-1][i] + " ");
		}
		row--;
		}
		if (b<col) {
		for (i=(row-1);i>=a;i--){
			System.out.print(INArray[i][b] + " ");
		}
		b++;
		}
	}
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiPrint SpntOB=new SpiPrint();
		int [][] source =  SpntOB.inpt(5,6);
		SpntOB.SpiPnt(source);
	}

}
