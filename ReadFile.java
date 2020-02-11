import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class ReadFile {
	private String fileName;
	
	public ReadFile(String s) {
		fileName = s;
	}
	
	public Vector<Word> process() {
		
		File f = new File(fileName);
		Scanner sc = null;
		
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Is it possible that file "+fileName+" does not exist?");
			System.exit(-1);
		}
		
		Vector<Word> toR = new Vector<Word>();
		
		while (sc.hasNext()) {
			toR.add(new Word(sc.next(),(int) (Math.random()*100)));
		}
		
		return toR;
	}

public static void main(String[] args) {
		
	ReadFile rf = new ReadFile("TextFile1.txt");
	Vector<Word> list = rf.process();
	for (Word w : list) {
		System.out.println("testing " +w);
	}
		
		
		
	}

}
