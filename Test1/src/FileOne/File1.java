package FileOne;
import java.io.*;
public class File1 {
public static void writeFile1() throws IOException {
	File fout = new File("out.txt");
	FileOutputStream fos = new FileOutputStream(fout);
	OutputStreamWriter fosw = new OutputStreamWriter(fos);
	BufferedWriter bw = new BufferedWriter(fosw);
 
	
	
	
	for (int i = 0; i < 10; i++) {
		bw.write("something");
		bw.newLine();
		bw.flush();
		System.out.println("HI");
	}
	
	for (int i = 0; i < 10; i++) {
		fosw.write("something1");
		bw.flush();
		}

	
	bw.close();
	fosw.close();
	fos.close();
	
}
public static void main (String [] args) throws IOException {
//	File1 file1= new File1();
//	file1.writeFile1();
	writeFile1();
}
}
