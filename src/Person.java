import java.util.HashMap;

public class Person {
    private Name name;
    private Object age;
    private Address address;


    public Person(HashMap detailOfPerson) {
        this.name = new Name(detailOfPerson.get("FirstName"), detailOfPerson.get("LastName"), detailOfPerson.get("Gender"));
        this.age = detailOfPerson.get("Age");
        this.address = new Address(detailOfPerson.get("City"), detailOfPerson.get("State"), detailOfPerson.get("Country"));
    }

    private Object getFirstNameFirst() {
        return name.firstNameFirst();
    }

    private Object getLastNameFirst() {
        return name.firstNameLast();
    }

    public Object stylePrefered(String opt) {
        if (opt.equals("first-last"))
            return getFirstNameFirst();
        return getLastNameFirst();
    }

    public Object withAddressAndStyle(String opt, String preferedCountry) {
        String countryName = null;
        if (address.getCountry().equals(preferedCountry))
            return stylePrefered(opt) + "," + preferedCountry;
        return countryName;
    }
}
