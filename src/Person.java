import java.util.Objects;

public class Person {
    private Gender gender;
    private Name name;
    private int age;
    private Address address;


    public Person(Name name, Gender gender, int age, Address address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    private String getFirstNameFirst() {
        return name.firstNameFirst();
    }

    private String getLastNameFirst() {
        return name.firstNameLast();
    }

    public String stylePreferred(String opt) {
        if (opt.equals("--lastFirst"))
            return assignTitle() + " " + getLastNameFirst();
        return assignTitle() + " " + getFirstNameFirst();
    }

    public String withAddressAndStyle(String opt, String preferredCountry) {
        String countryName = "";
        if (address.getCountry().equals(preferredCountry))
            return stylePreferred(opt) + "," + address.getCountry();
        return countryName;
    }

    public String assignTitle() {
        return gender.toString();
    }

    public String withAddressAndAge(String opt, String country, String legalAge) {
        if (age >= Integer.parseInt(legalAge)) //Age.isLegal
            if (!(Objects.equals(withAddressAndStyle(opt, country), "")))
                return withAddressAndStyle(opt, country) + "," + age;
        return "";
    }
}
