package FileTwo;
import java.io.*;
import java.util.*;
public class File2 {

	public static ArrayList<Character> GetLineArray(String a)
	{
	 ArrayList<Character> LineArray=new ArrayList<>();
	 ArrayList<Character> Line2Array=new ArrayList<>();
	 ArrayList<Character> Result=new ArrayList<>();
	try {
	FileReader FR=new FileReader(a);
	BufferedReader BR = new BufferedReader(FR);
	String Line=BR.readLine();
	String Line2=null;
//	Prepare arraylist from a line
	for (int i=0; i<Line.length(); i++){
	LineArray.add(i, Line.charAt(i));
	}
//	End
	
	while (true)
	{
		Line2=BR.readLine();
		if (Line2==null) {break;}
		for (int i=0; i<Line2.length(); i++){
			Line2Array.add(i, Line.charAt(i));
			}	
//		Now I have two lines into two array
		int arraylength=0;
		if (LineArray.size()<Line2Array.size()){arraylength=LineArray.size();}
		else {arraylength=Line2Array.size();}
		
		for (int i=0; i<arraylength; i++)
		{
			if ( LineArray.get(i)==Line2Array.get(i)) {Result.add(i, LineArray.get(i));	}
			else {break;}
			
		} 
		LineArray.clear();
		for (int i=0; i<Result.size();i++){
			
			LineArray.add(i, Result.get(i));
		}
		Result.clear();
	}
	BR.close();
	}catch (IOException e)
	{System.out.print("GetLIne method got an exception");
	}
	
	return LineArray;
	}
		
	public static void main (String [] args) {
	
		ArrayList<Character> ResultF=GetLineArray("input1.txt");
		for (int i=0; i<ResultF.size();i++)
		{System.out.print(ResultF.get(i));}
		
	}
		
}
