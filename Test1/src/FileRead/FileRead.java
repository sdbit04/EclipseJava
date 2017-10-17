package FileRead;
import java.io.*;
import java.util.*;
public class FileRead 
{

//public static ArrayList<String> GetLineArray(String a){
public static ArrayList<Character> GetLineArray(String a){
	ArrayList<String> ARL=new ArrayList<>();
	ArrayList<Character> ARC=new ArrayList<>();
	try {
		FileReader FR = new FileReader(a);
		BufferedReader BR = new BufferedReader(FR);
		
		while (true){
			String line=BR.readLine();
			if (line==null){break;}
			ARL.add(line);
		for (int i=0; i<ARL.size();i++)
		{
			ARC.add(i, (ARL.toString()).charAt(i));
		}
		
		}
		
BR.close();
	} 
	catch (IOException e) 	{System.out.print("excetpion");}


return ARC;
}

public static void main (String [] Args) {
	
//	ArrayList<String> ARL1 =new ArrayList<>();
	ArrayList<Character> ARL1 =new ArrayList<>();
	ARL1=GetLineArray("input1.txt");
	for (int i=0; i<ARL1.size(); i++)
	{
		System.out.print(ARL1.get(i) + "END");
	}
	
}
}
