package essentials;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilesTryWithResources {
    public static void main(String[] args) {
        var file = new File("src/essentials/hello.txt");
        System.out.println("File exists: " + file.exists());

        // we should close both reader and br for avoiding memory leaks.
        // we could do it using finally, for which we'll need to ensure the objects are visible in all code-blocks.
        // the above will get messy, the best solution is to use a try-with-resources block.
        // the try-with-resources block will close them automatically at the end of the try-catch block, avoiding
        // memory leaks.
        // all objects that implement the Closeable interface in java, should be closed explicitly.
        // that so, they should be instantiated within a try-with-resources block.
        // this way, they will get closed automatically and we don't need to worry about closing them.
        try (
                var reader = new FileReader(file);
                var br = new BufferedReader(reader)
        ) {
            var text = br.readLine();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
