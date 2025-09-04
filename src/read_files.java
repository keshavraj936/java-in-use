import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_files {
    public static void main(String[] args) {

        // READING FILES MAINLY 3 OPTIONS

        //BufferedReader + FileReader: Best for reading text files line by line
        //FileInputStream : Best for binary files (eg : images, audio files)
        //RandomAccessFile : Best for read/write specific portions of a large files

        String filePath = "C:\\Users\\THIS SUCKs\\Desktop\\Test.txt";



        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) !=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Couldn't locate files");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }

    }
}
