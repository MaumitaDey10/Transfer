import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO4 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("MyFile");
		
		int eof = 1;
		while(eof !=-1) {
			
			eof=fis.read();
			
			System.out.println(eof);
		}
		
		fis.close();
	}

}
