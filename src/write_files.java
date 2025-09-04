import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class write_files {
    public static void main(String[] args) {

        // How to write a file using Java (4 options)

        // FileWriter = Good for small or medium sized text files
        //BufferedWriter = Better performance for large amount of text
        //PrintWriter = Best for structured data, like reports or logs
        //FileOutputStream = Best for binary files (eg - images, audio)


        String filePath = "C:\\Users\\THIS SUCKs\\Desktop\\Test.txt";
        String textContent = "I like pizza\nIt's really good\nBuy me one";

        try( FileWriter writer = new FileWriter(filePath);){
            writer.write(textContent);
            System.out.println("File has been written");
        }
        catch (FileNotFoundException e){
            System.out.println("File path invalid");
        }
        catch (IOException e){
            System.out.println("Couldn't write file");
        }

    }
}
