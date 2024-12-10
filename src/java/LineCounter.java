package java;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {

	   public static void main(String[] args) {
	        try {
	            // Open 'leni.txt' file for reading
	            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
	            int lineCount = 0;
	            
	            // Read each line and increment lineCount
	            while (reader.readLine() != null) {
	                lineCount++;
	            }
	            reader.close();
	            
	            // Write the line count to 'counted.txt'
	            FileWriter writer = new FileWriter("counted.txt");
	            writer.write("Total number of lines: " + lineCount);
	            writer.close();
	            
	            // Print success message
	            System.out.println("Line count written to counted.txt");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
