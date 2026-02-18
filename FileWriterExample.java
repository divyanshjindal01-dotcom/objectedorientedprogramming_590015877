import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {
public static void main(String[] args) {
try {
FileWriter fw = new FileWriter("Sample.txt");
fw.write("Java I/O Streams Example hhlbrv f vhjbrv er v  vbk.r");
fw.close();
System.out.println("File written successfully.");
} catch (IOException e) {
System.out.println(e);
}
}
}