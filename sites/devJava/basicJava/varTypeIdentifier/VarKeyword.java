package sites.devJava.basicJava.varTypeIdentifier;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class VarKeyword {
    public static void main(String[] args) throws IOException {
        String msg = "Hello World!!";
        Path path = Path.of("debug.log");
        InputStream stream = Files.newInputStream(path);
    }
}
