import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter ("Films.txt");
        File filmFile = new File("oscar_age_female.csv");
        boolean isHeading = true;

        Scanner fileReader = new Scanner(filmFile);
        fileReader.nextLine();
        while(fileReader.hasNextLine()){
            String[] lineArray = fileReader.nextLine().split(", ");

                writer.write("Name: " + lineArray[3] + "\n");
                writer.write("Year: " + lineArray[1] + "\n");
                writer.write("Age: " + lineArray[2] + "\n");
                writer.write("Movie: " + lineArray[4] + "\n");
                writer.write("__________"+ "\n");
        }
        fileReader.close();
        writer.close();

    }
}