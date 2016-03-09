import java.util.ArrayList;

public class Guests {
    private ArrayList<Person> guestsList;
    private ArrayList<String> listOfRepresentations = new ArrayList<>();

    public Guests(ArrayList<Person> details) {
        this.guestsList = details;
    }

    public String getNamesWithAddress(String opt, String preferredCountry) {
        listOfRepresentations.clear();
        for (Person p : guestsList) {
            String representation = p.withAddressAndStyle(opt, preferredCountry);
            if (!representation.equals(""))
                listOfRepresentations.add(representation);
        }
        return representation();
    }

    public String getName(String opt) {
        listOfRepresentations.clear();
        for (Person p : guestsList) {
            String representation = p.stylePreferred(opt);
            listOfRepresentations.add(representation);
        }
        return representation();
    }

    public String representation() {
        String str = "";
        int size = listOfRepresentations.size();
        for (int i = 0; i < size - 1; i++)
            str += listOfRepresentations.get(i) + "\n";
        str += listOfRepresentations.get(size - 1);
        return str;
    }

    public String getNameWithAge(String opt, String country, String age) {
        listOfRepresentations.clear();
        for (Person p : guestsList) {
            String representation = p.withAddressAndAge(opt, country, age);
            if (!(representation.equals(""))) //make it as another method
                listOfRepresentations.add(representation);
        }
        return representation();
    }
}
