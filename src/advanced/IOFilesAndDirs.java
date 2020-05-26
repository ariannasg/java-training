package advanced;

import java.io.*;

// I/O Streams are a way of reading or writing data. Streams represent a flow of data and like streams of water,
// they can only go in one direction.
// If I need to write and read data, I need 2 streams: output for writing and input for reading.
// InputStream and OutputStream are abstract classes, as well as Reader and Writer.
// The difference between Reader/Writer and InputStream/OutputStream concrete implementations, is that
// InputStream/OutputStream move bytes around, whereas Reader/Writer move characters.
// Characters are easier and more intuitive to work with than bytes.
// Reader/Writer concrete impl also handle encoding issues which InputStream/OutputStream impl don't.
// An advantage of using BufferedReader instead of an output Scanner, is that BufferedReader is asynchronised,
// meaning that is safe to use in multithreaded applications.
// BufferedReader is also faster than a Scanner, so is best to use it when reading large sections of text
public class IOFilesAndDirs {
    public static void main(String[] args) {
        File exampleFile = new File("src/advanced/example.txt");
        System.out.println(exampleFile.exists() ? "example.txt exists" : "example.txt not exist");
        System.out.println("Printing all lines in example.txt");

        // using a try-with-resources block to ensure the BufferedReader and the FileReader resources are closed
        try (
                BufferedReader br = new BufferedReader(new FileReader(exampleFile))
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("\nWe now create a new file");
        // at this point this is just an abstract representation of the file.
        // if I stop the program after the next line, no new file will exist
        File newFile = new File("src/advanced/new.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
            boolean fileCreated = newFile.createNewFile(); // after running this, an empty file will exist
            System.out.println(fileCreated ? "new file created" :
                    (newFile.exists() ? "new file already exists" : "new file not created"));

            if (newFile.exists()) {
                bw.write("Hello ");
                bw.write("Ari");
                bw.newLine();
                bw.write("Bye");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nWe now want to list the files inside a directory");
        String[] directoryContent = new File(".").list();
        for (String content : directoryContent != null ? directoryContent : new String[0]) {
            System.out.println(content);
        }
        System.out.println("We now want to filter the files in a directory by a certain type");
        FilenameFilter fileFilter = (dir, name) -> name.contains(".md");
        directoryContent = new File(".").list(fileFilter);
        for (String mdFile : directoryContent != null ? directoryContent : new String[0]) {
            System.out.println(mdFile);
        }

        System.out.println("\nWe now want to create a new directory");
        boolean dirCreated = new File("src/advanced/newDirectory").mkdir();
        System.out.println(dirCreated ? "new dir created" :
                (newFile.exists() ? "new dir already exists" : "new dir not created"));
    }
}

//CONSOLE OUTPUT:
//example.txt exists
//Printing all lines in example.txt
//This is a line 1 (example file)
//This is a line 2 (example file)
//This is a line 3 (example file)
//
//We now create a new file
//new file created
//
//We now want to list the files inside a directory
//.git
//.gitignore
//.idea
//java-training.iml
//LICENSE.md
//out
//README.md
//src
//We now want to filter the files in a directory by a certain type
//LICENSE.md
//README.md
//
//We now want to create a new directory
//new dir created
