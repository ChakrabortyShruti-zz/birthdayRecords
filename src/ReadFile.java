import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ReadFile {

    private String fileName;

    public ReadFile(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Person> getStructuredFile() {
        File record = new File(fileName);
        String[] fileContent;
        fileContent = new String[0];
        try {
            fileContent = readFile(record);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Person> listRecord = new ArrayList<>();
        getFormattedList(fileContent, listRecord);
        return listRecord;
    }


    public static void getFormattedList(String[] fileContent, ArrayList<Person> listRecord) {
        for (String aFileContent : fileContent) {
            String[] detail = aFileContent.split(",");
            Person guest = initializeInfo(detail);
            listRecord.add(guest);
        }
    }

    private static Person initializeInfo(String[] info) {
        Name name = new Name(info[0],info[1]);
        Gender gender = Objects.equals(info[2], "Male") ? Gender.Male : Gender.Female;
        String  age = info[3];
        Address address = new Address(info[4],info[5],info[6]);
        return new Person(name,gender,age,address);
    }

    private static String[] readFile(File fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        char[] fileContent = new char[(int) fileName.length()];
        file.read(fileContent);
        String invitees = new String(fileContent);
        return invitees.split("\n");
    }
}
