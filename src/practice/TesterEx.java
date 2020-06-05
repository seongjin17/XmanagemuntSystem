import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TesterEx {

	public static void main(String[] args) {
		try {
				FileWriter fout = new FileWriter("test.txt");
				FileOutputStream file = new FileOutputStream("text.txt");
				file.write("hello".getBytes());
				file.close();
				} catch (IOException e) {
				e.printStackTrace();
				}

		}

}
