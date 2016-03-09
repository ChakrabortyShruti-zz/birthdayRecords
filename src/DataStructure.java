import java.util.ArrayList;
import java.util.Objects;

public class DataStructure {

    private String guestDetails;
    private ArrayList<Person> splittedData = new ArrayList<>();

    public DataStructure(String guestRecords) {
        this.guestDetails = guestRecords;
    }

    public ArrayList<Person> getData() {
        String[] content = guestDetails.split("\n");
        for (int i = 0; i < content.length; i++) {
            String[] detail = content[i].split(",");
            splittedData.add(initializeInfo(detail));
        }
        return splittedData;
    }

    public Person initializeInfo(String[] detail) {
        Name name = new Name(detail[0], detail[1]);
        Gender gender = Objects.equals(detail[2], "Female") ? Gender.Female : Gender.Male;
        int age = Integer.parseInt(detail[3]);
        Address address = new Address(detail[4], detail[5], detail[6]);
        return new Person(name, gender, age, address);
    }
}
