import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		FileOutputStream fos = new FileOutputStream("MyFile");
		
		
		char x = 'a';
		while(x !='z') {
			
			x= (char) System.in.read();
			
			fos.write(x);

	}

}
}
