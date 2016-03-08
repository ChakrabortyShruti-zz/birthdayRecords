public class Person implements Honorific {
    private Gender gender;
    private Name name;
    private String age;
    private Address address;


    public Person(Name name,Gender gender,String age,Address address) {
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
        if (opt.equals("--firstLast"))
            return assignTitle()+" "+getFirstNameFirst();
        return assignTitle()+" "+getLastNameFirst();
    }

    public String withAddressAndStyle(String opt, String preferredCountry) {
        String countryName = "";
        if (address.getCountry().equals(preferredCountry))
            return stylePreferred(opt) + "," + preferredCountry;
        return countryName;
    }

    @Override
    public Gender assignTitle() {
        if (gender == Gender.Male) {
            return Gender.Male;
        }
        return Gender.Female;
    }
}
