import java.util.ArrayList;

public class Records {
    private final ArrayList<Person> personalDetails;
    private ArrayList<String> list = new ArrayList<>();

    public Records(ArrayList<Person> details) {
        this.personalDetails = details;
    }

    public String getNamesWithAddress(String opt, String preferredCountry) {
        list.clear();
        for (Person PersonalDetail : personalDetails) {
            String representation = PersonalDetail.withAddressAndStyle(opt, preferredCountry);
            if (!representation.equals(""))
                list.add(representation);
        }
        return representation();
    }

    public String getNameRepresentations(String opt) {
        list.clear();
        for (Person PersonalDetail : personalDetails) {
            String representation = PersonalDetail.stylePreferred(opt);
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
}
