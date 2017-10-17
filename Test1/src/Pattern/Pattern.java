package Pattern;

import java.io.*;
import java.util.*;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Pattern {

	public static void main(String[] args) {
		String ouput = ReadingLines("input1.txt");
		System.out.println("Common pattern is " + ouput);

	}

	protected static String ReadingLines(String filename) {
		String FirstLine = null;
		try {
			FileReader FR = new FileReader(filename);
			java.io.BufferedReader BR = new BufferedReader(FR);
			FirstLine = BR.readLine();
			if (FirstLine != null)
			// IF we have first line, then only we walk through the others lines
			// for common patter
			{
				int FLlen = FirstLine.length();
				

				// ===================================================================
				while (true) {
					
					String InputLine = BR.readLine();

					if (InputLine == null) {
						break;
					}
					ArrayList<Character> pattern = new ArrayList<>();
					int len = 0;
					// int FLlen=FirstLine.length();
					// For first run FLlen is calculated, for next phase of
					// while loop we need to initiate this value at the end of
					// previus phase
					int IPlen = InputLine.length();
					if (FLlen < IPlen) {
						len = FLlen;
					} else {
						len = IPlen;
					}

					for (int i = 0; i < len; i++) {
						if (FirstLine.charAt(i) == InputLine.charAt(i)) {
							pattern.add(FirstLine.charAt(i));
						} else {
							break;
						}
					}
					FirstLine = getStringRepresentation(pattern);
					
					FLlen = FirstLine.length();

				}
				// ===================================================================
				BR.close();
			}

		} catch (IOException e) {
			System.out.print(e);
		}
		return FirstLine;
	}
	
	static String getStringRepresentation(ArrayList<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}

}
