public class Person {
    private Name name;
    private int age;
    private String gender;
    private Address address;
    private String title = "";


    //arguments to be changed
    public Person(String firstName, String lastName, int age, String gender, String city, String state, String country) {
        this.name = new Name(firstName, lastName, gender);
        this.age = age;
        this.gender = gender;
        this.address = new Address(city, state, country);
    }

    private Object getFirstNameFirst() {
        return name.firsttNameFirst();
    }

    private Object getLastNameFirst() {
        return name.firstNameLast();
    }

    public Object StylePrefered(String opt){
        if(opt == "first-last")
           return getFirstNameFirst();
        return getLastNameFirst();

    }
}
