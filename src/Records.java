import java.util.ArrayList;
import java.util.HashMap;

public class Records {
    private final ArrayList<Object> personalDetails;
    private ArrayList list = new ArrayList();

    public Records(ArrayList<Object> details) {
        this.personalDetails = details;
    }

    public Object getNamesWithAddress(String opt, String preferedCountry) {
        list.clear();
        for (Object PersonalDetail : personalDetails) {
            Person p = new Person((HashMap) PersonalDetail);
            Object representation = (p.withAddressAndStyle(opt, preferedCountry));
            if (representation != null)
                list.add(representation);
        }
        return list;
    }

    public Object getNameRepresentations(String opt) {
        list.clear();
        for (Object PersonalDetail : personalDetails) {
            Person p = new Person((HashMap) PersonalDetail);
            Object representation = p.stylePrefered(opt);
            list.add(representation);
        }
        return list;
    }


    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += (i == list.size() - 1) ? list.get(i) : list.get(i) + "\n";
        }
        return str;
    }
}
