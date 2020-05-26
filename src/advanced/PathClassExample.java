package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

// The best way to move, copy and delete files in java is with the Path class, since it has functionality that does
// not exist in the File class.
// Is normally used along the Files class.
public class PathClassExample {
    public static void main(String[] args) {
        Path path = Paths.get("src/advanced/new.txt");

        try {
            Files.deleteIfExists(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Listing path properties of a file");
        Path path2 = Paths.get("src/advanced/example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
        System.out.println(path2.getName(0));

        System.out.println("Copying a file content to another file without having to create new file");
        Path source = Paths.get("src/advanced/example.txt");
        Path dest = Paths.get("src/advanced/new.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

//CONSOLE OUTPUT:
//src/advanced
//null
//example.txt
//src