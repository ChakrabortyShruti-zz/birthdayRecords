import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileContent() throws IOException {
        File record = new File(fileName);
        FileReader file = new FileReader(record);
        char[] fileContent = new char[(int) record.length()];
        file.read(fileContent);
        String invitees = new String(fileContent);
        return invitees;
    }
}
