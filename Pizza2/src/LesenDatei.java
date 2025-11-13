import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LesenDatei {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("H:\\git\\TestJava2025-26\\Pizza2\\src\\Speisekarte.txt"
        		+ ""))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
