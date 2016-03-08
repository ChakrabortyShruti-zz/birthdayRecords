import java.util.ArrayList;

public class Guests {
    private final ArrayList<Person> personalDetails;
    private ArrayList<String> list = new ArrayList<>();

    public Guests(ArrayList<Person> details) {
        this.personalDetails = details;
    }

    public String getNamesWithAddress(String opt, String preferredCountry) {
        list.clear();
        for (Person p : personalDetails) {
            String representation = p.withAddressAndStyle(opt, preferredCountry);
            if (!representation.equals(""))
                list.add(representation);
        }
        return representation();
    }

    public String getName(String opt) {
        list.clear();
        for (Person p : personalDetails) {
            String representation = p.stylePreferred(opt);
            list.add(representation);
        }
        return representation();
    }

    public String representation() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += (i == list.size() - 1) ? list.get(i) : list.get(i) + "\n";
        }
        return str;
    }

    public String getNameWithAge(String opt, String country, String age) {
        list.clear();
        for (Person p : personalDetails) {
            String representation = p.withAddressAndAge(opt, country, age);
            if (!(representation.equals("")))
                list.add(representation);
        }
        return representation();
    }
}
